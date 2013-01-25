package org.nsesa.editor.gwt.an.server.service.gwt;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.io.Files;
import freemarker.ext.dom.NodeModel;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTAmendmentService;
import org.nsesa.editor.gwt.core.shared.AmendableWidgetReference;
import org.nsesa.editor.gwt.core.shared.AmendmentContainerDTO;
import org.nsesa.editor.gwt.core.shared.ClientContext;
import org.nsesa.editor.gwt.core.shared.exception.ResourceNotFoundException;
import org.nsesa.editor.gwt.core.shared.exception.StaleResourceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * Date: 24/06/12 19:57
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class GWTAmendmentServiceImpl extends SpringRemoteServiceServlet implements GWTAmendmentService {

    private static final Logger LOG = LoggerFactory.getLogger(GWTAmendmentServiceImpl.class);

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
            final AmendmentContainerDTO amendment1 = new AmendmentContainerDTO();
            amendment1.setId(UUID.randomUUID().toString());
            final AmendableWidgetReference reference1 = new AmendableWidgetReference("rec1");
            amendment1.setSourceReference(reference1);
            amendment1.setBody(getAmendmentDocument("amendment-1"));

            final AmendmentContainerDTO amendment2 = new AmendmentContainerDTO();
            amendment2.setId(UUID.randomUUID().toString());
            final AmendableWidgetReference reference2 = new AmendableWidgetReference("rec2");
            final AmendableWidgetReference reference2a = new AmendableWidgetReference("rec3");
            final AmendableWidgetReference reference2b = new AmendableWidgetReference("rec1");
            amendment2.setTargetReferences(new ArrayList<AmendableWidgetReference>(Arrays.asList(reference2a, reference2b)));
            amendment2.setSourceReference(reference2);
            amendment2.setBody(getAmendmentDocument("amendment-2"));

            final AmendmentContainerDTO amendment3 = new AmendmentContainerDTO();
            amendment3.setId(UUID.randomUUID().toString());
            final AmendableWidgetReference reference3 = new AmendableWidgetReference("art2-pnta");
            amendment3.setSourceReference(reference3);
            amendment3.setBody(getAmendmentDocument("amendment-3"));

            return new AmendmentContainerDTO[]{amendment1, amendment2, amendment3};

        } catch (IOException e) {
            throw new RuntimeException("Could not retrieve amendment content.", e);
        }
    }

    private String getAmendmentDocument(String id) throws IOException {

        byte[] bytes = Files.toByteArray(documents.get(id).getFile());
        return toHTML(bytes);

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
    public AmendmentContainerDTO[] saveAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, StaleResourceException {
        List<AmendmentContainerDTO> amendmentContainerDTOs = new ArrayList<AmendmentContainerDTO>();
        for (AmendmentContainerDTO data : amendmentContainers) {
            try {
                final File amendmentDirectoryFile = amendmentDirectory.getFile();
                if (!amendmentDirectoryFile.exists()) {
                    if (!amendmentDirectoryFile.mkdirs()) {
                        throw new RuntimeException("Could not create amendment export directory at '" + amendmentDirectoryFile.getAbsolutePath() + "'");
                    }
                }
                if (!amendmentDirectoryFile.canWrite()) {
                    throw new RuntimeException("No permission to write to '" + amendmentDirectoryFile.getAbsolutePath() + "'");
                }
                Files.write(data.getBody(), new File(amendmentDirectoryFile, data.getSourceReference().getPath() + "-" + data.getId() + "-am.xml"), Charset.forName("UTF-8"));
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
    public AmendmentContainerDTO[] deleteAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        final Collection<AmendmentContainerDTO> deleted = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                input.setAmendmentContainerStatus("DELETED");
                return input;
            }
        });
        return deleted.toArray(new AmendmentContainerDTO[deleted.size()]);
    }

    @Override
    public AmendmentContainerDTO[] tableAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        final Collection<AmendmentContainerDTO> tabled = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                input.setAmendmentContainerStatus("TABLED");
                return input;
            }
        });
        return tabled.toArray(new AmendmentContainerDTO[tabled.size()]);
    }

    @Override
    public AmendmentContainerDTO[] withdrawAmendmentContainers(final ClientContext clientContext, final ArrayList<AmendmentContainerDTO> amendmentContainers) throws UnsupportedOperationException, ResourceNotFoundException, StaleResourceException {
        final Collection<AmendmentContainerDTO> withdrawn = Collections2.transform(amendmentContainers, new Function<AmendmentContainerDTO, AmendmentContainerDTO>() {
            @Override
            public AmendmentContainerDTO apply(AmendmentContainerDTO input) {
                input.setAmendmentContainerStatus("WITHDRAWN");
                return input;
            }
        });
        return withdrawn.toArray(new AmendmentContainerDTO[withdrawn.size()]);
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
}
