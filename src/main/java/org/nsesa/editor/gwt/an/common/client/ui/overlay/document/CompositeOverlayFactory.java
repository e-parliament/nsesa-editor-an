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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.QuotedStructure;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;

import java.util.List;

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
        OverlayWidget amendableWidget = null;
        if (akomantoso20OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            amendableWidget = akomantoso20OverlayFactory.getAmendableWidget(namespaceURI, tag);
        } else if (csd02OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            amendableWidget = csd02OverlayFactory.getAmendableWidget(namespaceURI, tag);
        }
        if (amendableWidget == null)
            amendableWidget = super.getAmendableWidget(namespaceURI, tag);
        setAmendable(amendableWidget);
        return amendableWidget;
    }

    @Override
    public OverlayWidget getAmendableWidget(Element element) {
        OverlayWidget amendableWidget = null;
        final String namespaceURI = element.getAttribute("ns");
        if (akomantoso20OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            amendableWidget = akomantoso20OverlayFactory.getAmendableWidget(element);
        } else if (csd02OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            amendableWidget = csd02OverlayFactory.getAmendableWidget(element);
        }
        if (amendableWidget == null)
            amendableWidget = super.getAmendableWidget(element);
        setAmendable(amendableWidget);
        return amendableWidget;
    }

    @Override
    public OverlayWidget toAmendableWidget(Element element) {
        OverlayWidget amendableWidget = null;
        final String namespaceURI = element.getAttribute("ns");
        if (akomantoso20OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            amendableWidget = akomantoso20OverlayFactory.toAmendableWidget(element);
        } else if (csd02OverlayFactory.getNamespaceURI().equals(namespaceURI)) {
            amendableWidget = csd02OverlayFactory.toAmendableWidget(element);
        }
        if (amendableWidget == null)
            amendableWidget = super.toAmendableWidget(element);
        setAmendable(amendableWidget);
        return amendableWidget;
    }

    protected void setAmendable(final OverlayWidget overlayWidget) {
        if (overlayWidget != null) {
            final String namespaceURI20 = akomantoso20OverlayFactory.getNamespaceURI();
            final String namespaceURI30 = csd02OverlayFactory.getNamespaceURI();

            overlayWidget.walk(new OverlayWidgetWalker.OverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    final boolean baseHierarchySubclass = (visited instanceof BasehierarchyComplexType ||
                            visited instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType);
                    // this prevents us from marking all children as
                    if (!visited.hasParent(namespaceURI20, "quotedStructure") && !visited.hasParent(namespaceURI30, "quotedStructure"))
                        visited.setAmendable(baseHierarchySubclass);
                    return true;
                }
            });
        }
    }

}
