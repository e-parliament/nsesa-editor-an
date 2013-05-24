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

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayWidgetInjectionStrategy;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetSelector;

import java.util.logging.Logger;

/**
 * Date: 21/05/13 16:11
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoOverlayWidgetInjectionStrategy extends DefaultOverlayWidgetInjectionStrategy {

    private static final Logger LOG = Logger.getLogger(DefaultOverlayWidgetInjectionStrategy.class.getName());

    @Override
    public int getInjectionPosition(OverlayWidget parent, OverlayWidget reference, OverlayWidget toInject) {
        // find index just before the first child block
        final boolean sibling = (parent != reference);

        if (sibling) {
            // this will return the index to inject
            OverlayWidget nextNonIntroducedOverlayWidget = reference.getNextSibling(new OverlayWidgetSelector() {
                @Override
                public boolean select(OverlayWidget toSelect) {
                    return !toSelect.isIntroducedByAnAmendment() && (toSelect instanceof BasehierarchyComplexType || toSelect instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType);
                }
            });
            if (nextNonIntroducedOverlayWidget != null) {
                final int position = parent.getChildOverlayWidgets().indexOf(nextNonIntroducedOverlayWidget);
                LOG.info("Sibling index (with another non-introduced overlay widget after): " + position);
                return position;
            } else {
                // at the end
                final int position = (parent.getChildOverlayWidgets().size());
                LOG.info("Sibling index (without non-introduced overlay widget after): " + position);
                return position;
            }

        } else {
            // this will return the index
            int position = 0;
            for (final OverlayWidget child : reference.getChildOverlayWidgets()) {
                if (!child.isIntroducedByAnAmendment()) {
                    if (child instanceof BasehierarchyComplexType || child instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType) {
                        LOG.info("Child index: " + position);
                        return position;
                    }
                }
                position++;
            }
            return position;
        }
    }
}
