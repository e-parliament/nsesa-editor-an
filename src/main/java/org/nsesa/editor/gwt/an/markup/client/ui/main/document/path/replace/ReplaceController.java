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
package org.nsesa.editor.gwt.an.markup.client.ui.main.document.path.replace;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
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
public class ReplaceController {

    public static interface Listener {
        void onClick(OverlayWidget toReplace, OverlayWidget replacement);
    }

    private static final Logger LOG = Logger.getLogger(ReplaceController.class.getName());

    final ReplaceView view;

    private OverlayWidget overlayWidget;

    private DocumentController documentController;

    private Listener listener;

    @Inject
    public ReplaceController(ReplaceView view) {
        this.view = view;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setOverlayWidget(final OverlayWidget overlayWidget) {
        this.overlayWidget = overlayWidget;

        final VerticalPanel panel = new VerticalPanel();
        final List<OverlayWidget> allowedSiblings = documentController.getCreator().getAllowedSiblings(documentController, overlayWidget);
        for (final OverlayWidget sibling : allowedSiblings) {
            final Anchor anchor = new Anchor();
            anchor.setText(sibling.getType());
            anchor.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                    listener.onClick(overlayWidget, sibling);
                }
            });
            panel.add(anchor);
        }

        view.setPanel(panel);
    }

    public ReplaceView getView() {
        return view;
    }

    public void setDocumentController(final DocumentController documentController) {
        this.documentController = documentController;
    }
}
