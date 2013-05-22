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

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayWidgetInjector;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.Collection;
import java.util.logging.Logger;

/**
 * Date: 21/05/13 16:11
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoOverlayWidgetInjector extends DefaultOverlayWidgetInjector {

    private static final Logger LOG = Logger.getLogger(DefaultOverlayWidgetInjector.class.getName());

    @Override
    public void injectAsChild(OverlayWidget parent, OverlayWidget child, int offset) {
        com.google.gwt.user.client.Element parentElement = parent.getOverlayElement().cast();
        com.google.gwt.user.client.Element childElement = child.getOverlayElement().cast();


        final Collection<OverlayWidget> blockOverlayWidgets = Collections2.filter(parent.getChildOverlayWidgets(), new Predicate<OverlayWidget>() {
            @Override
            public boolean apply(OverlayWidget input) {
                return input instanceof BasehierarchyComplexType || input instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType;  //To change body of implemented methods use File | Settings | File Templates.
            }
        });

        if (blockOverlayWidgets.isEmpty()) {
            // ok, insert as the last child
            DOM.insertChild(parentElement, childElement, parentElement.getChildCount());
            parent.addOverlayWidget(child, -1, false);

            LOG.info("Added new " + child + " as the last child to " + parent);
        } else {
            // insert before the first child amendable widget
            int indexOfFirstBlockOverlayWidget = parent.getChildOverlayWidgets().indexOf(blockOverlayWidgets.iterator().next());

            final OverlayWidget overlayWidget = parent.getChildOverlayWidgets().get(indexOfFirstBlockOverlayWidget);

            com.google.gwt.user.client.Element beforeElement = overlayWidget.getOverlayElement().cast();
            DOM.insertBefore(parentElement, childElement, beforeElement);
            // logical
            parent.addOverlayWidget(child, indexOfFirstBlockOverlayWidget, true);
            LOG.info("Added new " + child + " as the first child to " + parent + " at position " + offset);
        }
    }
}
