/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
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
import com.google.common.io.Files;
import freemarker.ext.dom.NodeModel;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.nsesa.editor.gwt.an.common.server.service.gwt.SpringRemoteServiceServlet;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTAmendmentService;
import org.nsesa.editor.gwt.core.shared.AmendableWidgetReference;
import org.nsesa.editor.gwt.core.shared.AmendmentContainerDTO;
import org.nsesa.editor.gwt.core.shared.ClientContext;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.nsesa.editor.gwt.core.shared.exception.ResourceNotFoundException;
import org.nsesa.editor.gwt.core.shared.exception.StaleResourceException;
import org.nsesa.editor.gwt.core.shared.exception.ValidationException;
import org.nsesa.server.dto.AmendmentAction;
import org.nsesa.server.service.api.AmendmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.xml.sax.*;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import java.io.*;
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

    private Map<String, Resource> documents;
    private Resource documentTemplate;
    private Resource amendmentDirectory;

    @Override
    public AmendmentContainerDTO getAmendmentContainer(final ClientContext clientContext, final String id) throws UnsupportedOperationException, ResourceNotFoundException {
        return null;
    }

    @Override
    public AmendmentContainerDTO[] getAmendmentContainers(final ClientContext clientContext) throws UnsupportedOperationException {

        try {
            List<AmendmentContainerDTO> amendmentContainerDTOs = new ArrayList<AmendmentContainerDTO>();
            final String[] documentIDs = clientContext.getDocumentIDs();
            for (String documentID : clientContext.getDocumentIDs()) {
                List<AmendmentContainerDTO> temp = new ArrayList<AmendmentContainerDTO>();
                final List<org.nsesa.server.dto.AmendmentContainerDTO> backend = amendmentService.getAmendmentContainersByDocumentAndPerson(documentID, clientContext.getLoggedInPerson().getId());
                if (backend != null) {
                    for (org.nsesa.server.dto.AmendmentContainerDTO b : backend) {
                        AmendmentContainerDTO amendmentContainerDTO = fromBackend(b);
                        amendmentContainerDTO.setBody(toHTML(b.getBody().getBytes("UTF-8")));
                        amendmentContainerDTOs.add(amendmentContainerDTO);
                    }
                }
            }

            /*final AmendmentContainerDTO amendment1 = new AmendmentContainerDTO();
            amendment1.setId(UUID.randomUUID().toString());
            amendment1.setRevisionID(UUID.randomUUID().toString());
            final AmendableWidgetReference reference1 = new AmendableWidgetReference("rec1");
            amendment1.setSourceReference(reference1);
            amendment1.setBody(getAmendmentDocument("amendment-1"));

            final AmendmentContainerDTO amendment2 = new AmendmentContainerDTO();
            amendment2.setId(UUID.randomUUID().toString());
            amendment2.setRevisionID(UUID.randomUUID().toString());
            final AmendableWidgetReference reference2 = new AmendableWidgetReference("rec2");
            final AmendableWidgetReference reference2a = new AmendableWidgetReference("rec3");
            final AmendableWidgetReference reference2b = new AmendableWidgetReference("rec1");
            amendment2.setTargetReferences(new ArrayList<AmendableWidgetReference>(Arrays.asList(reference2a, reference2b)));
            amendment2.setSourceReference(reference2);
            amendment2.setBody(getAmendmentDocument("amendment-2"));

            final AmendmentContainerDTO amendment3 = new AmendmentContainerDTO();
            amendment3.setId(UUID.randomUUID().toString());
            amendment3.setRevisionID(UUID.randomUUID().toString());
            final AmendableWidgetReference reference3 = new AmendableWidgetReference("art2-pnta");
            amendment3.setSourceReference(reference3);
            amendment3.setBody(getAmendmentDocument("amendment-3"));

            return new AmendmentContainerDTO[]{amendment1, amendment2, amendment3};*/

            return amendmentContainerDTOs.toArray(new AmendmentContainerDTO[amendmentContainerDTOs.size()]);

        } catch (IOException e) {
            throw new RuntimeException("Could not retrieve amendment content.", e);
        }
    }

    private AmendmentContainerDTO fromBackend(org.nsesa.server.dto.AmendmentContainerDTO b) {
        AmendmentContainerDTO amendmentContainerDTO = new AmendmentContainerDTO();
        amendmentContainerDTO.setAmendmentContainerStatus(b.getAmendmentContainerStatus());
        amendmentContainerDTO.setDocumentID(b.getDocumentID());

        final org.nsesa.server.dto.AmendableWidgetReference backend = b.getSourceReference();
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
        return amendmentContainerDTO;
    }

    private String getAmendmentDocument(String id) throws IOException {

        byte[] bytes = Files.toByteArray(documents.get(id).getFile());
        return toHTML(bytes);

    }

    private void validate(final String content) throws ValidationException {
        LOG.debug("====================== AN VALIDATION ======================");
        System.setProperty("javax.xml.validation.SchemaFactory:" + XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI, "org.apache.xerces.jaxp.validation.XMLSchemaFactory");

        List<Source> schemas = new ArrayList<Source>();
        schemas.add(new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream("xml.xsd")));
        schemas.add(new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream("akomantoso20.xsd")));
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
//            factory.setValidating(true);
            factory.setNamespaceAware(true);

            SchemaFactory schemaFactory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);

            factory.setSchema(schemaFactory.newSchema(schemas.toArray(new Source[schemas.size()])));

            SAXParser parser = factory.newSAXParser();

            XMLReader reader = parser.getXMLReader();

            final LoggingErrorHandler loggingErrorHandler = new LoggingErrorHandler();
            reader.setErrorHandler(loggingErrorHandler);
            reader.parse(new InputSource(new ByteArrayInputStream(content.trim().getBytes("UTF-8"))));

        } catch (ParserConfigurationException e) {
            throw new ValidationException("Problem parsing XML - configuration error: " + e.getMessage(), e);
        } catch (IOException e) {
            throw new ValidationException("Problem parsing XML - I/O error: " + e.getMessage(), e);
        } catch (SAXException e) {
            throw new ValidationException("Problem parsing XML - SAX error: " + e.getMessage(), e);
        } finally {
            LOG.debug("==================== END OF VALIDATION ====================");
        }

    }

    public static class LoggingErrorHandler implements ErrorHandler {
        @Override
        public void warning(SAXParseException e) throws SAXException {
            LOG.warn("SAX warning: " + e);
        }

        @Override
        public void error(SAXParseException e) throws SAXException {
            LOG.warn("SAX error: " + e);
        }

        @Override
        public void fatalError(SAXParseException e) throws SAXException {
            LOG.warn("SAX fatal: " + e);
        }
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
    public AmendmentContainerDTO[] getRevisions(final ClientContext clientContext, final String id) throws UnsupportedOperationException, ResourceNotFoundException {
        return new AmendmentContainerDTO[0];
    }

    @Override
    public AmendmentContainerDTO[] saveAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, StaleResourceException, ValidationException {
        List<AmendmentContainerDTO> amendmentContainerDTOs = new ArrayList<AmendmentContainerDTO>();
        for (AmendmentContainerDTO data : amendmentContainers) {

            if (data.getDocumentID() == null)
                throw new NullPointerException("No documentID set on amendment DTO -- aborting");

            try {
                final File amendmentDirectoryFile = amendmentDirectory.getFile();
                /*if (!amendmentDirectoryFile.exists()) {
                    if (!amendmentDirectoryFile.mkdirs()) {
                        throw new RuntimeException("Could not create amendment export directory at '" + amendmentDirectoryFile.getAbsolutePath() + "'");
                    }
                }
                if (!amendmentDirectoryFile.canWrite()) {
                    throw new RuntimeException("No permission to write to '" + amendmentDirectoryFile.getAbsolutePath() + "'");
                }*/
                validate(data.getBody());
                //Files.write(data.getBody(), new File(amendmentDirectoryFile, data.getSourceReference().getPath() + "-" + data.getId() + "-am.xml"), Charset.forName("UTF-8"));


                // manually copy for now ...
                org.nsesa.server.dto.AmendmentContainerDTO backendDTO = new org.nsesa.server.dto.AmendmentContainerDTO();
                backendDTO.setPersonID(clientContext.getLoggedInPerson().getId());
                backendDTO.setDocumentID(data.getDocumentID());
                backendDTO.setRevisionID(data.getRevisionID());
                backendDTO.setAmendmentContainerStatus(data.getAmendmentContainerStatus());
                backendDTO.setLanguageISO(data.getLanguageISO());
                backendDTO.setAmendmentAction(AmendmentAction.valueOf(data.getAmendmentAction().toString()));
                backendDTO.setAmendmentContainerID(data.getId());
                backendDTO.setBody(data.getBody());
                final AmendableWidgetReference dto = data.getSourceReference();
                final org.nsesa.server.dto.AmendableWidgetReference sourceReference = new org.nsesa.server.dto.AmendableWidgetReference(dto.getPath());
                sourceReference.setNamespaceURI(dto.getNamespaceURI());
                sourceReference.setReferenceID(dto.getReferenceID());
                sourceReference.setType(dto.getType());
                sourceReference.setPath(dto.getPath());
                sourceReference.setSibling(dto.isSibling());
                sourceReference.setCreation(dto.isCreation());
                sourceReference.setOffset(dto.getOffset());

                backendDTO.setSourceReference(sourceReference);


                amendmentService.save(backendDTO);

                LOG.info("Saved amendment to the dto under document " + data.getDocumentID());

            } catch (IOException e) {
                LOG.error("Could not write file.", e);
            }
            try {
                data.setBody(toHTML(data.getBody().getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e) {
                LOG.error("Could not get encoding.", e);
            }
            amendmentContainerDTOs.add(data);
        }
        return amendmentContainerDTOs.toArray(new AmendmentContainerDTO[amendmentContainerDTOs.size()]);
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
    public AmendmentContainerDTO[] deleteAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
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
    public AmendmentContainerDTO[] tableAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        final Collection<AmendmentContainerDTO> tabled = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                input.setAmendmentContainerStatus("tabled");
                return input;
            }
        });
        return tabled.toArray(new AmendmentContainerDTO[tabled.size()]);
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
    public AmendmentContainerDTO[] withdrawAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        final Collection<AmendmentContainerDTO> withdrawn = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                input.setAmendmentContainerStatus("withdrawn");
                return input;
            }
        });
        return withdrawn.toArray(new AmendmentContainerDTO[withdrawn.size()]);
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
    public AmendmentContainerDTO[] registerAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        final Collection<AmendmentContainerDTO> registered = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                input.setAmendmentContainerStatus("registered");
                return input;
            }
        });
        return registered.toArray(new AmendmentContainerDTO[registered.size()]);
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
    public AmendmentContainerDTO[] returnAmendmentContainers(ClientContext clientContext, ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        final Collection<AmendmentContainerDTO> returned = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                input.setAmendmentContainerStatus("returned");
                return input;
            }
        });
        return returned.toArray(new AmendmentContainerDTO[returned.size()]);
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
        // TODO: this should do an ascii search for potential authors
        return new ArrayList<PersonDTO>(Arrays.asList(createPerson("1", "mep1", "MEP", "Mep1"), createPerson("2", "mep2", "MEP", "Mep2")));
    }

    private PersonDTO createPerson(String id, String username, String name, String lastName) {
        final PersonDTO person = new PersonDTO();
        person.setLastName(lastName);
        person.setName(name);
        person.setUsername(username);
        person.setId(id);
        return person;
    }

    // SPRING SETTERS -------------------------------------------


    public void setDocuments(Map<String, Resource> documents) {
        this.documents = documents;
    }

    public void setDocumentTemplate(Resource documentTemplate) {
        this.documentTemplate = documentTemplate;
    }

    public void setAmendmentDirectory(Resource amendmentDirectory) {
        this.amendmentDirectory = amendmentDirectory;
    }

    public void setAmendmentService(AmendmentService amendmentService) {
        this.amendmentService = amendmentService;
    }
}
