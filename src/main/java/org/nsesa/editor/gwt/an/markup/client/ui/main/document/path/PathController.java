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
package org.nsesa.editor.gwt.an.markup.client.ui.main.document.path;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.logging.Logger;

/**
 * Date: 05/02/13 09:32
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
public class PathController {

    private static final Logger LOG = Logger.getLogger(PathController.class.getName());

    final PathView view;

    private OverlayWidget overlayWidget;

    private DocumentController documentController;

    @Inject
    public PathController(PathView view) {
        this.view = view;
    }

    public void setOverlayWidget(final OverlayWidget overlayWidget) {
        this.overlayWidget = overlayWidget;

        final HorizontalPanel pathPanel = new HorizontalPanel();

        for (final OverlayWidget parent : overlayWidget.getParentOverlayWidgets()) {
            final Anchor anchor = new Anchor();
            anchor.setText(parent.getType());
            pathPanel.add(anchor);
            pathPanel.add(new HTML(" > "));
        }
        final Anchor anchor = new Anchor();
        anchor.setText(overlayWidget.getType());
        pathPanel.add(anchor);

        view.setPath(pathPanel);
    }

    public PathView getView() {
        return view;
    }

    public void setDocumentController(final DocumentController documentController) {
        this.documentController = documentController;
    }
}
