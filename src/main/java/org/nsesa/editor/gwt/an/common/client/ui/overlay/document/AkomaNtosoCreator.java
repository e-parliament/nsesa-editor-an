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
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.DefaultCreator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 28/05/13 15:45
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoCreator extends DefaultCreator {

    final Predicate<OverlayWidget> predicate = new Predicate<OverlayWidget>() {
        @Override
        public boolean apply(OverlayWidget input) {
            return true; //input instanceof BasehierarchyComplexType || input instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType;
        }
    };

    @Override
    public List<OverlayWidget> getAllowedSiblings(DocumentController documentController, OverlayWidget overlayWidget) {
        final List<OverlayWidget> allowedSiblings = super.getAllowedSiblings(documentController, overlayWidget);
        return new ArrayList<OverlayWidget>(Collections2.filter(allowedSiblings, predicate));
    }

    @Override
    public List<OverlayWidget> getAllowedChildren(DocumentController documentController, OverlayWidget overlayWidget) {
        final List<OverlayWidget> allowedChildren = super.getAllowedChildren(documentController, overlayWidget);
        return new ArrayList<OverlayWidget>(Collections2.filter(allowedChildren, predicate));
    }
}
