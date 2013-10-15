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
package org.nsesa.editor.gwt.an.markup.client.ui.main.document.picker;

import com.bfr.client.selection.Range;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.markup.client.ui.main.document.MarkupDocumentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlaySnippet;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlaySnippetFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.List;
import java.util.logging.Logger;

/**
 * Date: 05/02/13 09:32
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
public class PickerController {

    private static final Logger LOG = Logger.getLogger(PickerController.class.getName());

    final PickerView view;

    private OverlayWidget overlayWidget;

    private DocumentController documentController;

    private final OverlaySnippetFactory overlaySnippetFactory;

    @Inject
    public PickerController(final PickerView view, final OverlaySnippetFactory overlaySnippetFactory) {
        this.view = view;
        this.overlaySnippetFactory = overlaySnippetFactory;
    }

    public void setOverlayWidget(final OverlayWidget overlayWidget) {
        this.overlayWidget = overlayWidget;
        final VerticalPanel detailPanel = new VerticalPanel();

        final Creator creator = documentController.getCreator();
        final List<OverlayWidget> allowedChildren = creator.getAllowedChildren(documentController, overlayWidget);

        for (final OverlayWidget child : allowedChildren) {
            final Anchor anchor = new Anchor();
            anchor.setText(child.getType());
            anchor.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
//                    final Selection selection = ((MarkupDocumentController) documentController).getPreviousSelection();
                    final Range range = ((MarkupDocumentController) documentController).getCurrentSelectionRange();
                    LOG.info("----> selection: " + range + ": " + range.getHtmlText());

                    if (!range.isCursor()) {
                        final OverlaySnippet overlaySnippet = overlaySnippetFactory.getSnippet(child);
                            /*if (overlaySnippet != null) {

                            }
                            else {*/
                        // just wrap it around
                        final OverlayWidget copy = documentController.getOverlayFactory().getAmendableWidget(child.getNamespaceURI(), child.getType());
                        if (copy == null) throw new RuntimeException(
                                "The overlay factory couldn't provide the overlay widget named "
                                        + child.getType() + " in the namespace " + child.getNamespaceURI());
                        range.surroundContents(copy.getOverlayElement());
                        // redo the overlaying
                        ((MarkupDocumentController) documentController).overlay();
                        //}
                    }


                }
            });
            detailPanel.add(anchor);
        }

        this.view.setPicker(detailPanel);

        this.view.setName(overlayWidget.getType());
    }

    public PickerView getView() {
        return view;
    }

    public void setDocumentController(DocumentController documentController) {
        this.documentController = documentController;
    }
}
