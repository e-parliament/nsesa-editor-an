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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document.outline;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.InlineHTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.HierarchyComplexType;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.TextUtils;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetWalker;

import java.util.logging.Logger;

/**
 * Date: 05/02/13 09:32
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
public class OutlineController {

    private static final Logger LOG = Logger.getLogger(OutlineController.class.getName());

    final OutlineView view;

    private OverlayWidget rootOverlayWidget;

    private DocumentController documentController;

    @Inject
    public OutlineController(OutlineView view) {
        this.view = view;
    }

    public void setRootOverlayWidget(OverlayWidget rootOverlayWidget) {
        this.rootOverlayWidget = rootOverlayWidget;
        final VerticalPanel outlinePanel = new VerticalPanel();
        rootOverlayWidget.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
            @Override
            public boolean visit(final OverlayWidget visited) {
                if (visited instanceof BasehierarchyComplexType) {
                    String unformattedIndex = visited.getUnformattedIndex();
                    if (unformattedIndex == null) unformattedIndex = Integer.toString(visited.getTypeIndex() + 1);
                    final String repeat = TextUtils.repeat(visited.getParentOverlayWidgets().size() * 2, "&nbsp;");
                    String heading = "";
                    // see if there's a heading
                    for (final OverlayWidget child : visited.getChildOverlayWidgets()) {
                        if ("heading".equalsIgnoreCase(child.getType())) {
                            heading = " <i>" + child.asWidget().getElement().getInnerText() + "</i>";
                            break;
                        }
                    }

                    final InlineHTML index = new InlineHTML(repeat + TextUtils.capitalize(visited.getType()) + " " + unformattedIndex);
                    final InlineHTML description = new InlineHTML(heading);

                    description.getElement().getStyle().setTextOverflow(Style.TextOverflow.ELLIPSIS);
                    description.getElement().getStyle().setOverflow(Style.Overflow.HIDDEN);
                    description.getElement().getStyle().setFontStyle(Style.FontStyle.ITALIC);
//                    description.getElement().getStyle().setWhiteSpace(Style.WhiteSpace.NOWRAP);

                    HTMLPanel both = new HTMLPanel("");
                    both.add(index);
                    both.add(description);
                    final FocusPanel w = new FocusPanel(both);
                    w.getElement().getStyle().setPadding(5, Style.Unit.PX);
                    outlinePanel.add(w);

                    w.addClickHandler(new ClickHandler() {
                        @Override
                        public void onClick(ClickEvent event) {
                            if (documentController != null) {
                                documentController.getSourceFileController().scrollTo(visited.asWidget());
                            }
                        }
                    });

                    return !(visited.getParentOverlayWidget() instanceof HierarchyComplexType);
                }
                return true;
            }
        });
        outlinePanel.getElement().getStyle().setTableLayout(Style.TableLayout.FIXED);
        outlinePanel.getElement().getStyle().setTextOverflow(Style.TextOverflow.ELLIPSIS);
        this.view.setOutlinePanel(outlinePanel);
    }

    public OutlineView getView() {
        return view;
    }

    public void setDocumentController(DocumentController documentController) {
        this.documentController = documentController;
    }
}
