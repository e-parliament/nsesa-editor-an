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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document.outline;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.HierarchyComplexType;
import org.nsesa.editor.gwt.core.client.amendment.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.logging.Logger;

/**
 * Date: 05/02/13 09:32
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
public class OutlineController {

    private static final Logger LOG = Logger.getLogger(OutlineController.class.getName());

    final OutlineView view;

    private OverlayWidget rootOverlayWidget;

    @Inject
    public OutlineController(OutlineView view) {
        this.view = view;
    }

    public void setRootOverlayWidget(OverlayWidget rootOverlayWidget) {
        this.rootOverlayWidget = rootOverlayWidget;
        final VerticalPanel outlinePanel = new VerticalPanel();
        rootOverlayWidget.walk(new OverlayWidgetWalker.OverlayWidgetVisitor() {
            @Override
            public boolean visit(OverlayWidget visited) {
                if (visited instanceof HierarchyComplexType) {
                    final HTML w = new HTML(visited.getUnformattedIndex());
//                    w.getElement().getStyle().setMarginLeft(5 * depth.get(), Style.Unit.PX);
                    w.getElement().getStyle().setPadding(5, Style.Unit.PX);
                    outlinePanel.add(w);
                    return !(visited.getParentOverlayWidget() instanceof HierarchyComplexType);
                }
                return true;
            }
        });
        this.view.setOutlinePanel(outlinePanel);
    }

    public OutlineView getView() {
        return view;
    }
}
