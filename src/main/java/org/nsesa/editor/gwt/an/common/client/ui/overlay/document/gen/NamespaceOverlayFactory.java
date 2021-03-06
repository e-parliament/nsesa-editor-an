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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen;

import com.google.gwt.dom.client.Element;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.logging.Logger;

/**
 * A factory class specialization used to create overlay wigets based on the given DOM element input data
 * Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayFactory.ftl</tt>.
 */
public class NamespaceOverlayFactory extends DefaultOverlayFactory {

    private final static Logger LOG = Logger.getLogger(NamespaceOverlayFactory.class.getName());

    /**
     * the namespace URI of the overlay factory *
     */
    private final String namespaceURI = "http://www.w3.org/XML/1998/namespace";

    /**
     * Create <code>NamespaceOverlayFactory</code> object with the given overlay strategy
     *
     * @param overlayStrategy The strategy to be used to create overlay widget objects
     */
    @Inject
    public NamespaceOverlayFactory(final OverlayStrategy overlayStrategy) {
        super(overlayStrategy);
    }

    /**
     * Return <code>namespaceURI</code> of the overlay class
     *
     * @return the namespace URI as String
     */
    @Override
    public String getNamespaceURI() {
        return namespaceURI;
    }

    /**
     * Return <code>OverlayWidget</code> instance based on the given DOM element or null if there is no
     * possibility to create an overlay widget with the type specified in the DOM element "type" attribute
     *
     * @return an overlay widget instance
     */
    @Override
    public OverlayWidget toAmendableWidget(final Element element) {
        final String nodeName = overlayStrategy.getType(element);
        final String namespaceURI = overlayStrategy.getNamespaceURI(element);

        if ("".equals(nodeName)) {
            throw new IllegalArgumentException("Empty element or null passed.");
        }
// nothing found
        LOG.warning("Could not find overlay element (nodename: " + nodeName + " in namespace URI '" + namespaceURI + "')");
        return null;
    }
}