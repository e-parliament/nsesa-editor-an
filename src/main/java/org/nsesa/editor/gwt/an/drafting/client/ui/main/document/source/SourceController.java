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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document.source;

import com.google.gwt.core.client.Scheduler;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import edu.ycp.cs.dh.acegwt.client.ace.AceEditor;
import edu.ycp.cs.dh.acegwt.client.ace.AceEditorMode;
import edu.ycp.cs.dh.acegwt.client.ace.AceEditorTheme;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Formatter;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.util.Scope;

import static org.nsesa.editor.gwt.core.client.util.Scope.ScopeValue.DOCUMENT;
import static org.nsesa.editor.gwt.core.client.util.Scope.ScopeValue.EDITOR;

/**
 * Component for showing a (temporary) notification on the screen of the end user.
 * Date: 24/06/12 21:42
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Scope(DOCUMENT)
public class SourceController {

    /**
     * The view.
     */
    final SourceView view;

    Formatter formatter;

    /**
     * The overlay widget to display the source for.
     */
    OverlayWidget overlayWidget;

    final AceEditor aceEditor = new AceEditor();

    /**
     * Flag to set whether or not this source should be editable and thus call back after changes.
     */
    boolean readOnly;

    private DocumentController documentController;

    @Inject
    public SourceController(final SourceView view) {
        this.view = view;
        attachEditor();
    }

    public void registerListeners() {

    }

    /**
     * Removes all registered event handlers from the event bus and UI.
     */
    public void removeListeners() {

    }

    public void setOverlayWidget(final OverlayWidget overlayWidget) {
        this.overlayWidget = overlayWidget;
        aceEditor.setValue(formatter.format(overlayWidget));
    }

    public void attachEditor() {
        view.getMainPanel().add(aceEditor);

        aceEditor.setWidth("100%");
        aceEditor.setHeight("100%");

        aceEditor.startEditor();
        aceEditor.setMode(AceEditorMode.XML);
    }

    public void detachEditor() {
        aceEditor.destroy();
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * Get the view associated with this notification.
     *
     * @return the view
     */
    public SourceView getView() {
        return view;
    }

    public void setDocumentController(DocumentController documentController) {
        this.documentController = documentController;
    }
}
