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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.sourcefile.actionbar.create;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.create.ActionBarCreatePanelController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.create.ActionBarCreatePanelView;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 07/06/13 22:29
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoActionBarCreatePanelController extends ActionBarCreatePanelController {
    @Inject
    public AkomaNtosoActionBarCreatePanelController(DocumentEventBus documentEventBus, ActionBarCreatePanelView view) {
        super(documentEventBus, view);
    }

    @Override
    protected void setAvailableChildrenAndSiblings() {
        Predicate<OverlayWidget> predicate = new Predicate<OverlayWidget>() {
            @Override
            public boolean apply(OverlayWidget input) {
                return input instanceof BasehierarchyComplexType || input instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType;
            }
        };

        // clean up whatever is there
        view.clearChildOverlayWidgets();

        // add all the possible siblings
        List<OverlayWidget> allowedSiblings = sourceFileController.getDocumentController().getCreator().getAllowedSiblings(sourceFileController.getDocumentController(), overlayWidget);
        allowedSiblings = new ArrayList<OverlayWidget>(Collections2.filter(allowedSiblings, predicate));
        for (final OverlayWidget entry : allowedSiblings) {
            view.addSiblingAmendableWidget(entry.getType(), entry);
        }
        // add all the children
        List<OverlayWidget> allowedChildren = sourceFileController.getDocumentController().getCreator().getAllowedChildren(sourceFileController.getDocumentController(), overlayWidget);
        allowedChildren = new ArrayList<OverlayWidget>(Collections2.filter(allowedChildren, predicate));
        for (final OverlayWidget entry : allowedChildren) {
            view.addChildAmendableWidget(entry.getType(), entry);
        }

        // show separator if both siblings and children are possible
        view.setSeparatorVisible(!allowedSiblings.isEmpty() && !allowedChildren.isEmpty());

    }
}
