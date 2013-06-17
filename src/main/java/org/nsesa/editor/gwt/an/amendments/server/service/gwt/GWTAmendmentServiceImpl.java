/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.amendments.server.service.gwt;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import freemarker.ext.dom.NodeModel;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.nsesa.editor.gwt.an.common.server.service.gwt.SpringRemoteServiceServlet;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTAmendmentService;
import org.nsesa.editor.gwt.core.client.util.Counter;
import org.nsesa.editor.gwt.core.shared.*;
import org.nsesa.editor.gwt.core.shared.exception.ResourceNotFoundException;
import org.nsesa.editor.gwt.core.shared.exception.StaleResourceException;
import org.nsesa.editor.gwt.core.shared.exception.ValidationException;
import org.nsesa.server.dto.AmendableWidgetReferenceDTO;
import org.nsesa.server.service.api.AmendmentService;
import org.nsesa.server.service.api.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Date: 24/06/12 19:57
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class GWTAmendmentServiceImpl extends SpringRemoteServiceServlet implements GWTAmendmentService {

    private static final Logger LOG = LoggerFactory.getLogger(GWTAmendmentServiceImpl.class);

    private AmendmentService amendmentService;

    private PersonService personService;

    private Resource documentTemplate;

    @Override
    public AmendmentContainerDTO getAmendmentContainer(final ClientContext clientContext, final String id) throws UnsupportedOperationException, ResourceNotFoundException {
        try {
            return fromBackend(amendmentService.getAmendmentContainer(id));
        } catch (org.nsesa.server.exception.ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public AmendmentContainerDTO getAmendmentContainerRevision(ClientContext clientContext, String revisionID) throws UnsupportedOperationException, ResourceNotFoundException {
        try {
            return fromBackend(amendmentService.getAmendmentContainerVersion(revisionID));
        } catch (org.nsesa.server.exception.ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public AmendmentContainerDTO[] getAmendmentContainers(final ClientContext clientContext) throws UnsupportedOperationException, ResourceNotFoundException {
        try {
            final List<AmendmentContainerDTO> amendmentContainerDTOs = new ArrayList<AmendmentContainerDTO>();
            for (final String documentID : clientContext.getDocumentIDs()) {
                List<org.nsesa.server.dto.AmendmentContainerDTO> backend = null;
                try {
                    backend = amendmentService.getAmendmentContainersByDocumentAndPerson(documentID, clientContext.getLoggedInPerson().getId());
                } catch (org.nsesa.server.exception.ResourceNotFoundException e) {
                    throw new ResourceNotFoundException(e.getMessage(), e.getCause());
                }
                if (backend != null) {
                    for (final org.nsesa.server.dto.AmendmentContainerDTO b : backend) {
                        AmendmentContainerDTO amendmentContainerDTO = fromBackend(b);
                        // transform XML into HTML
                        amendmentContainerDTO.setBody(toHTML(b.getBody().getBytes("UTF-8")));
                        amendmentContainerDTOs.add(amendmentContainerDTO);
                    }
                }
            }
            return amendmentContainerDTOs.toArray(new AmendmentContainerDTO[amendmentContainerDTOs.size()]);
        } catch (IOException e) {
            throw new RuntimeException("Could not retrieve amendment content.", e);
        }
    }

    // TODO use assemblers
    private AmendmentContainerDTO fromBackend(org.nsesa.server.dto.AmendmentContainerDTO b) {
        if (b == null) return null;
        AmendmentContainerDTO amendmentContainerDTO = new AmendmentContainerDTO();
        amendmentContainerDTO.setAmendmentContainerStatus(b.getAmendmentContainerStatus());
        amendmentContainerDTO.setDocumentID(b.getDocumentID());

        final AmendableWidgetReferenceDTO backend = b.getSourceReference();
        final AmendableWidgetReference sourceReference = new AmendableWidgetReference();
        sourceReference.setNamespaceURI(backend.getNamespaceURI());
        sourceReference.setReferenceID(backend.getReferenceID());
        sourceReference.setType(backend.getType());
        sourceReference.setPath(backend.getPath());
        sourceReference.setSibling(backend.isSibling());
        sourceReference.setCreation(backend.isCreation());
        sourceReference.setOffset(backend.getOffset());

        amendmentContainerDTO.setSourceReference(sourceReference);
        amendmentContainerDTO.setAmendmentAction(org.nsesa.editor.gwt.core.shared.AmendmentAction.valueOf(b.getAmendmentAction().toString()));
        amendmentContainerDTO.setBody(b.getBody());
        amendmentContainerDTO.setId(b.getAmendmentContainerID());
        amendmentContainerDTO.setLanguageISO(b.getLanguageISO());
        amendmentContainerDTO.setRevisionID(b.getRevisionID());

        try {
            amendmentContainerDTO.setBody(toHTML(amendmentContainerDTO.getBody().getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            LOG.error("Could not get encoding.", e);
        }

        return amendmentContainerDTO;
    }

    private String toHTML(byte[] bytes) {
        try {
            final InputSource inputSource = new InputSource(new ByteArrayInputStream(bytes));
            final NodeModel model = NodeModel.parse(inputSource);
            final Configuration configuration = new Configuration();
            configuration.setDefaultEncoding("UTF-8");
            configuration.setDirectoryForTemplateLoading(documentTemplate.getFile().getParentFile());
            final StringWriter sw = new StringWriter();
            Map<String, Object> root = new HashMap<String, Object>();
            root.put("doc", model);
            configuration.getTemplate(documentTemplate.getFile().getName()).process(root, sw);
            return sw.toString();

        } catch (IOException e) {
            throw new RuntimeException("Could not read file.", e);
        } catch (SAXException e) {
            throw new RuntimeException("Could not parse file.", e);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("Could not parse file.", e);
        } catch (TemplateException e) {
            throw new RuntimeException("Could not load template.", e);
        }
    }

    @Override
    public ArrayList<RevisionDTO> getRevisions(final ClientContext clientContext, final String id) throws UnsupportedOperationException, ResourceNotFoundException {
        final List<org.nsesa.server.dto.RevisionDTO> amendmentContainerVersions = amendmentService.getAmendmentContainerVersions(id);
        // manually copy for now
        final ArrayList<RevisionDTO> revisions = new ArrayList<RevisionDTO>();
        for (final org.nsesa.server.dto.RevisionDTO fromBackend : amendmentContainerVersions) {
            RevisionDTO revisionDTO = new RevisionDTO();
            revisionDTO.setRevisionID(fromBackend.getRevisionID());
            revisionDTO.setCreationDate(fromBackend.getCreationDate());
            revisionDTO.setModificationDate(fromBackend.getModificationDate());

            PersonDTO personDTO = new PersonDTO();
            personDTO.setId(fromBackend.getPerson().getPersonID());
            personDTO.setUsername(fromBackend.getPerson().getUsername());
            personDTO.setName(fromBackend.getPerson().getName());
            personDTO.setLastName(fromBackend.getPerson().getLastName());
            revisionDTO.setPerson(personDTO);

            revisions.add(revisionDTO);
        }
        return revisions;
    }

    @Override
    public AmendmentContainerDTO[] saveAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, StaleResourceException, ValidationException {
        try {

            final Boolean[] booleans = canSaveAmendmentContainers(clientContext, amendmentContainers);
            final Counter counter = new Counter();
            for (final Boolean b : booleans) {
                if (b != null && !b) {
                    // sorry, at least one amendment could not be saved.
                    throw new ValidationException("You are not allowed to save amendment with ID " + amendmentContainers.get(counter.get()).getId());
                }
                counter.increment();
            }

            // all fine

            final List<AmendmentContainerDTO> amendmentContainerDTOs = new ArrayList<AmendmentContainerDTO>();
            for (final AmendmentContainerDTO data : amendmentContainers) {

                if (data.getDocumentID() == null)
                    throw new NullPointerException("No documentID set on amendment DTO -- aborting");
                if (data.getId() == null)
                    throw new NullPointerException("No ID set on amendment DTO -- aborting");
                if (data.getRevisionID() == null)
                    throw new NullPointerException("No revisionID set on amendment DTO -- aborting");

                // manually copy for now ...
                final org.nsesa.server.dto.AmendmentContainerDTO backendDTO = new org.nsesa.server.dto.AmendmentContainerDTO();
                backendDTO.setPersonID(clientContext.getLoggedInPerson().getId());
                backendDTO.setDocumentID(data.getDocumentID());
                backendDTO.setRevisionID(data.getRevisionID());
                backendDTO.setAmendmentContainerStatus(data.getAmendmentContainerStatus());
                backendDTO.setLanguageISO(data.getLanguageISO());
                backendDTO.setAmendmentAction(org.nsesa.server.dto.AmendmentAction.valueOf(data.getAmendmentAction().toString()));
                backendDTO.setAmendmentContainerID(data.getId());
                backendDTO.setBody(data.getBody());
                final AmendableWidgetReference dto = data.getSourceReference();
                final AmendableWidgetReferenceDTO sourceReference = new AmendableWidgetReferenceDTO(dto.getPath());
                sourceReference.setNamespaceURI(dto.getNamespaceURI());
                sourceReference.setReferenceID(dto.getReferenceID());
                sourceReference.setType(dto.getType());
                sourceReference.setPath(dto.getPath());
                sourceReference.setSibling(dto.isSibling());
                sourceReference.setCreation(dto.isCreation());
                sourceReference.setOffset(dto.getOffset());

                backendDTO.setSourceReference(sourceReference);

                final org.nsesa.server.dto.AmendmentContainerDTO saved = amendmentService.save(backendDTO);
                final AmendmentContainerDTO amendmentContainerDTO = fromBackend(saved);

                LOG.info("Saved amendment to the dto under document " + amendmentContainerDTO.getDocumentID() +
                        " as revision " + amendmentContainerDTO.getRevisionID());
                amendmentContainerDTOs.add(amendmentContainerDTO);
            }
            return amendmentContainerDTOs.toArray(new AmendmentContainerDTO[amendmentContainerDTOs.size()]);
        } catch (org.nsesa.server.exception.StaleResourceException e) {
            throw new StaleResourceException(e.getMessage(), e.getCause());
        } catch (org.nsesa.server.exception.ValidationException e) {
            throw new ValidationException(e.getMessage(), e.getCause());
        } catch (org.nsesa.server.exception.ResourceNotFoundException e) {
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Boolean[] canSaveAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, StaleResourceException {
        return Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, Boolean>() {
            @Override
            public Boolean apply(AmendmentContainerDTO input) {
                return true;
            }
        }).toArray(new Boolean[amendmentContainers.size()]);
    }

    @Override
    public AmendmentContainerDTO[] deleteAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException, ValidationException {
        final Boolean[] booleans = canDeleteAmendmentContainers(clientContext, amendmentContainers);
        final Counter counter = new Counter();
        for (final Boolean b : booleans) {
            if (b != null && !b) {
                // sorry, at least one amendment could not be deleted.
                throw new ValidationException("You are not allowed to delete amendment with revision ID " + amendmentContainers.get(counter.get()).getRevisionID());
            }
            counter.increment();
        }

        final Collection<AmendmentContainerDTO> deleted = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                amendmentService.delete(input.getId());
                input.setAmendmentContainerStatus("deleted");
                return input;
            }
        });
        return deleted.toArray(new AmendmentContainerDTO[deleted.size()]);
    }

    @Override
    public Boolean[] canDeleteAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        return Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, Boolean>() {

            @Override
            public Boolean apply(AmendmentContainerDTO input) {
                return true;
            }
        }).toArray(new Boolean[amendmentContainers.size()]);
    }

    @Override
    public AmendmentContainerDTO[] tableAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException, ValidationException {
        final Boolean[] booleans = canTableAmendmentContainers(clientContext, amendmentContainers);
        final Counter counter = new Counter();
        for (final Boolean b : booleans) {
            if (b != null && !b) {
                // sorry, at least one amendment could not be tabled.
                throw new ValidationException("You are not allowed to table amendment with ID " + amendmentContainers.get(counter.get()).getId());
            }
            counter.increment();
        }
        final List<Exception> exceptions = new ArrayList<Exception>();
        final Collection<AmendmentContainerDTO> tabled = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                try {
                    amendmentService.updateStatus(input.getRevisionID(), "tabled");
                } catch (org.nsesa.server.exception.StaleResourceException e) {
                    LOG.error("Could not table amendment: stale resource.", e);
                    exceptions.add(new StaleResourceException(e));
                } catch (org.nsesa.server.exception.ResourceNotFoundException e) {
                    LOG.error("Could not table amendment: amendment not found.", e);
                    exceptions.add(new ResourceNotFoundException(e));
                }
                input.setAmendmentContainerStatus("tabled");
                return input;
            }
        });
        if (exceptions.isEmpty()) {
            return tabled.toArray(new AmendmentContainerDTO[tabled.size()]);
        } else {
            for (Exception exception : exceptions) {
                if (exception instanceof StaleResourceException) {
                    StaleResourceException staleResourceException = (StaleResourceException) exception;
                    throw staleResourceException;
                } else if (exception instanceof ResourceNotFoundException) {
                    ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) exception;
                    throw resourceNotFoundException;
                } else {
                    // unknown exception
                    throw new UnsupportedOperationException("Something went wrong.");
                }
            }
        }
        return new AmendmentContainerDTO[0];
    }

    @Override
    public Boolean[] canTableAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        return Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, Boolean>() {

            @Override
            public Boolean apply(AmendmentContainerDTO input) {
                return true;
            }
        }).toArray(new Boolean[amendmentContainers.size()]);
    }

    @Override
    public AmendmentContainerDTO[] withdrawAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException, ValidationException {
        final Boolean[] booleans = canWithdrawAmendmentContainers(clientContext, amendmentContainers);
        final Counter counter = new Counter();
        for (final Boolean b : booleans) {
            if (b != null && !b) {
                // sorry, at least one amendment could not be withdrawn.
                throw new ValidationException("You are not allowed to withdraw amendment with revision ID " + amendmentContainers.get(counter.get()).getRevisionID());
            }
            counter.increment();
        }
        final List<Exception> exceptions = new ArrayList<Exception>();
        final Collection<AmendmentContainerDTO> withdrawn = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                try {
                    amendmentService.updateStatus(input.getRevisionID(), "withdrawn");
                } catch (org.nsesa.server.exception.StaleResourceException e) {
                    LOG.error("Could not table amendment: stale resource.", e);
                    exceptions.add(new StaleResourceException(e));
                } catch (org.nsesa.server.exception.ResourceNotFoundException e) {
                    LOG.error("Could not table amendment: amendment not found.", e);
                    exceptions.add(new ResourceNotFoundException(e));
                }
                input.setAmendmentContainerStatus("withdrawn");
                return input;
            }
        });
        if (exceptions.isEmpty()) {
            return withdrawn.toArray(new AmendmentContainerDTO[withdrawn.size()]);
        } else {
            for (Exception exception : exceptions) {
                if (exception instanceof StaleResourceException) {
                    StaleResourceException staleResourceException = (StaleResourceException) exception;
                    throw staleResourceException;
                } else if (exception instanceof ResourceNotFoundException) {
                    ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) exception;
                    throw resourceNotFoundException;
                } else {
                    // unknown exception
                    throw new UnsupportedOperationException("Something went wrong.");
                }
            }
        }
        return new AmendmentContainerDTO[0];
    }

    @Override
    public Boolean[] canWithdrawAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        return Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, Boolean>() {
            @Override
            public Boolean apply(AmendmentContainerDTO input) {
                return true;
            }
        }).toArray(new Boolean[amendmentContainers.size()]);
    }

    @Override
    public AmendmentContainerDTO[] registerAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException, ValidationException {
        final Boolean[] booleans = canRegisterAmendmentContainers(clientContext, amendmentContainers);
        final Counter counter = new Counter();
        for (final Boolean b : booleans) {
            if (b != null && !b) {
                // sorry, at least one amendment could not be registered.
                throw new ValidationException("You are not allowed to register amendment with revision ID " + amendmentContainers.get(counter.get()).getRevisionID());
            }
            counter.increment();
        }
        final List<Exception> exceptions = new ArrayList<Exception>();
        final Collection<AmendmentContainerDTO> registered = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                try {
                    amendmentService.updateStatus(input.getRevisionID(), "registered");
                } catch (org.nsesa.server.exception.StaleResourceException e) {
                    LOG.error("Could not table amendment: stale resource.", e);
                    exceptions.add(new StaleResourceException(e));
                } catch (org.nsesa.server.exception.ResourceNotFoundException e) {
                    LOG.error("Could not table amendment: amendment not found.", e);
                    exceptions.add(new ResourceNotFoundException(e));
                }
                input.setAmendmentContainerStatus("registered");
                return input;
            }
        });
        if (exceptions.isEmpty()) {
            return registered.toArray(new AmendmentContainerDTO[registered.size()]);
        } else {
            for (Exception exception : exceptions) {
                if (exception instanceof StaleResourceException) {
                    StaleResourceException staleResourceException = (StaleResourceException) exception;
                    throw staleResourceException;
                } else if (exception instanceof ResourceNotFoundException) {
                    ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) exception;
                    throw resourceNotFoundException;
                } else {
                    // unknown exception
                    throw new UnsupportedOperationException("Something went wrong.");
                }
            }
        }
        return new AmendmentContainerDTO[0];
    }

    @Override
    public Boolean[] canRegisterAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        return Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, Boolean>() {
            @Override
            public Boolean apply(AmendmentContainerDTO input) {
                return true;
            }
        }).toArray(new Boolean[amendmentContainers.size()]);
    }

    @Override
    public AmendmentContainerDTO[] returnAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException, ValidationException {
        final Boolean[] booleans = canReturnAmendmentContainers(clientContext, amendmentContainers);
        final Counter counter = new Counter();
        for (final Boolean b : booleans) {
            if (b != null && !b) {
                // sorry, at least one amendment could not be returned.
                throw new ValidationException("You are not allowed to return amendment with revision ID " + amendmentContainers.get(counter.get()).getRevisionID());
            }
            counter.increment();
        }
        final List<Exception> exceptions = new ArrayList<Exception>();
        final Collection<AmendmentContainerDTO> returned = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                try {
                    amendmentService.updateStatus(input.getRevisionID(), "returned");
                } catch (org.nsesa.server.exception.StaleResourceException e) {
                    LOG.error("Could not table amendment: stale resource.", e);
                    exceptions.add(new StaleResourceException(e));
                } catch (org.nsesa.server.exception.ResourceNotFoundException e) {
                    LOG.error("Could not table amendment: amendment not found.", e);
                    exceptions.add(new ResourceNotFoundException(e));
                }
                input.setAmendmentContainerStatus("returned");
                return input;
            }
        });
        if (exceptions.isEmpty()) {
            return returned.toArray(new AmendmentContainerDTO[returned.size()]);
        } else {
            for (Exception exception : exceptions) {
                if (exception instanceof StaleResourceException) {
                    StaleResourceException staleResourceException = (StaleResourceException) exception;
                    throw staleResourceException;
                } else if (exception instanceof ResourceNotFoundException) {
                    ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) exception;
                    throw resourceNotFoundException;
                } else {
                    // unknown exception
                    throw new UnsupportedOperationException("Something went wrong.");
                }
            }
        }
        return new AmendmentContainerDTO[0];
    }

    @Override
    public Boolean[] canReturnAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        return Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, Boolean>() {
            @Override
            public Boolean apply(AmendmentContainerDTO input) {
                return true;
            }
        }).toArray(new Boolean[amendmentContainers.size()]);
    }

    @Override
    public ArrayList<PersonDTO> getAvailableAuthors(ClientContext clientContext, String query, int limit) {
        final List<org.nsesa.server.dto.PersonDTO> persons = personService.getPersons("%" + query + "%", 0, limit);
        final ArrayList<PersonDTO> personDTOs = new ArrayList<PersonDTO>();
        if (persons != null) {
            for (org.nsesa.server.dto.PersonDTO fromServer : persons) {
                personDTOs.add(new PersonDTO(fromServer.getPersonID(), fromServer.getUsername(), fromServer.getName(), fromServer.getLastName()));
            }
        }
        return personDTOs;
    }

    // SPRING SETTERS -------------------------------------------

    public void setDocumentTemplate(Resource documentTemplate) {
        this.documentTemplate = documentTemplate;
    }

    public void setAmendmentService(AmendmentService amendmentService) {
        this.amendmentService = amendmentService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
