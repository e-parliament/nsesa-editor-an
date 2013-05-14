package org.nsesa.editor.gwt.an.amendments.server.service;

import org.nsesa.server.dto.AmendmentContainerDTO;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import static javax.xml.transform.OutputKeys.INDENT;

/**
 * Default implementation of {@link DiffHandlerService} interface without doing anything with the text.
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 3/05/13 14:24
 */
@Service
public class NoDiffHandlerService implements DiffHandlerService {

    private DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    private TransformerFactory transformerFactory = TransformerFactory.newInstance();

    // style for BI diffing
    public static final String originalChangeTemplate = "<change>{0}</change>";

    // style for complex diffing
    public static final String originalComplexChangeTemplate = "<change>{0}</change>";
    public static final String complexInsertTemplate = "<change>{0}</change>";
    public static final String complexDeleteTemplate = "<change>{0}</change>";
    public static final String complexChangeTemplate = "<change>{0}</change>";


    /**
     * Call the diff service and update the content of the amendment container with the changes
     * retrieved after diff operation
     * @param amendmentContainerDTO
     */
    @Override
    public void diff(AmendmentContainerDTO amendmentContainerDTO) {

        final XMLAmendmentHandler amendmentHandler = new XMLAmendmentHandler(amendmentContainerDTO.getBody());
        amendmentHandler.setOriginal(amendmentHandler.getOriginal());
        amendmentHandler.setAmendment(amendmentHandler.getAmendment());
       //amendmentContainerDTO.setBody(amendmentHandler.getContent());

    }

    /**
     * A helper class to deal with xml representation of the amendments
     */
    private class XMLAmendmentHandler {
        private Document bodyDocument;
        private NodeList nodes;

        /**
         * Create an instance of the XMLAmendmentHandler class by parsing the given String and identify if possible
         * the nodes which contain information about the original text and the modified one.
         * @param body xml representation of the amendment document
         */
        public XMLAmendmentHandler(String body) {
            try {
                DocumentBuilder builder = builderFactory.newDocumentBuilder();
                bodyDocument = builder.parse(new InputSource(new StringReader(body)));
                XPathFactory xPathFactory = XPathFactory.newInstance();
                XPath xPath = xPathFactory.newXPath();
                XPathExpression xPathExpression = xPath.compile("//quotedStructure");

                nodes = ((NodeList)xPathExpression.evaluate(bodyDocument, XPathConstants.NODESET));

            } catch (ParserConfigurationException pce) {
                throw new RuntimeException("The string can not be parsed: " + body, pce);
            } catch (SAXException saxe) {
                throw new RuntimeException("The string can not be parsed: " + body, saxe);
            } catch (IOException ioe) {
                throw new RuntimeException("The string can not be parsed: " + body, ioe);
            } catch (XPathExpressionException xe) {
                throw new RuntimeException("The string can not be parsed: " + body, xe);
            }
        }

        /**
         *  Set the original text in the xml tree
         * @param original xml representation of the original text as String
         */
        public void setOriginal(String original) {
            try {
                DocumentBuilder builder = builderFactory.newDocumentBuilder();
                Node node = builder.parse(new InputSource(new StringReader(original))).getDocumentElement();
                Node parentNode = nodes.item(0).getParentNode();
                parentNode.removeChild(nodes.item(0));
                Node importNode = bodyDocument.importNode(node, true);
                parentNode.insertBefore(importNode, nodes.item(1));
            } catch (ParserConfigurationException pce) {
                throw new RuntimeException("The string can not be parsed: " + original, pce);
            } catch (SAXException saxe) {
                throw new RuntimeException("The string can not be parsed: " + original, saxe);
            } catch (IOException ioe) {
                throw new RuntimeException("The string can not be parsed: " + original, ioe);
            }

        }

        /**
         *  Set the amendment text in the xml tree
         * @param amendment xml representation of the amendment text as String
         */
        public void setAmendment(String amendment) {
            try {
                DocumentBuilder builder = builderFactory.newDocumentBuilder();
                Node node = builder.parse(new InputSource(new StringReader(amendment))).getDocumentElement();
                Node parentNode = nodes.item(1).getParentNode();
                parentNode.removeChild(nodes.item(1));
                Node importNode = bodyDocument.importNode(node, true);
                parentNode.appendChild(importNode);
            } catch (ParserConfigurationException pce) {
                throw new RuntimeException("The string can not be parsed: " + amendment, pce);
            } catch (SAXException saxe) {
                throw new RuntimeException("The string can not be parsed: " + amendment, saxe);
            } catch (IOException ioe) {
                throw new RuntimeException("The string can not be parsed: " + amendment, ioe);
            }
        }

        /**
         * Returns the original text by searching in the xml representation of the document
         * @return The original text as String
         */
        public String getOriginal() {
            Node node = nodes.item(0);
            return toString(node);
        }

        /**
         * Returns the amendment text by searching in the xml representation of the document
         * @return The amendment text as String
         */
        public String getAmendment() {
            Node node = nodes.item(1);
            return toString(node);
        }

        /**
         * Returns the entire xml representation of the amendment document
         * @return xml representation of the amendment document
         */
        public String getContent() {
            return toString(bodyDocument.getDocumentElement());
        }

        /**
         * Print out xml representation of the given node
         * @param nodeOriginal
         * @return Xml representation of the given node as String
         */
        private String toString(Node nodeOriginal) {
            try {
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(INDENT, "yes");
                StreamResult streamResult = new StreamResult(new StringWriter());
                DOMSource domSource = new DOMSource(nodeOriginal);
                transformer.transform(domSource, streamResult);

                return streamResult.getWriter().toString();

            } catch (TransformerConfigurationException e) {
                throw new RuntimeException(e);
            } catch (TransformerException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
