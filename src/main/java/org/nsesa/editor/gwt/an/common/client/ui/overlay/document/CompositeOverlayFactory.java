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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document;

import com.google.gwt.dom.client.Element;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.Akomantoso20OverlayFactory;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.Csd02OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

/**
 * Date: 27/03/13 13:51
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class CompositeOverlayFactory extends DefaultOverlayFactory {

    private final Akomantoso20OverlayFactory akomantoso20OverlayFactory;
    private final Csd02OverlayFactory csd02OverlayFactory;

    @Inject
    public CompositeOverlayFactory(final OverlayStrategy overlayStrategy,
                                   final Akomantoso20OverlayFactory akomantoso20OverlayFactory,
                                   final Csd02OverlayFactory csd02OverlayFactory) {
        super(overlayStrategy);
        this.akomantoso20OverlayFactory = akomantoso20OverlayFactory;
        this.csd02OverlayFactory = csd02OverlayFactory;
    }

    @Override
    public OverlayWidget getAmendableWidget(String namespaceURI, String tag) {
        if (akomantoso20OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            return akomantoso20OverlayFactory.getAmendableWidget(namespaceURI, tag);
        } else if (csd02OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            return csd02OverlayFactory.getAmendableWidget(namespaceURI, tag);
        }
        return super.getAmendableWidget(namespaceURI, tag);
    }

    @Override
    public OverlayWidget getAmendableWidget(Element element) {
        final String namespaceURI = element.getAttribute("ns");
        if (akomantoso20OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            return akomantoso20OverlayFactory.getAmendableWidget(element);
        } else if (csd02OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            return csd02OverlayFactory.getAmendableWidget(element);
        }
        return super.getAmendableWidget(element);
    }

    @Override
    public OverlayWidget toAmendableWidget(Element element) {
        final String namespaceURI = element.getAttribute("ns");
        if (akomantoso20OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            return akomantoso20OverlayFactory.toAmendableWidget(element);
        } else if (csd02OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            return csd02OverlayFactory.toAmendableWidget(element);
        }
        return super.toAmendableWidget(element);
    }
}
