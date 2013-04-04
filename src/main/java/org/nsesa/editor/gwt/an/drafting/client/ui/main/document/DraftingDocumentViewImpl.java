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
package org.nsesa.editor.gwt.an.drafting.client.ui.main.document;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.SourceFileController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.SourceFileView;
import org.nsesa.editor.gwt.core.client.ui.rte.RichTextEditor;
import org.nsesa.editor.gwt.core.client.util.Scope;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.outline.OutlineController;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.document.outline.OutlineView;

import java.util.logging.Logger;

import static org.nsesa.editor.gwt.core.client.util.Scope.ScopeValue.DOCUMENT;

/**
 * Date: 24/06/12 16:39
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
@Scope(DOCUMENT)
public class DraftingDocumentViewImpl extends Composite implements DraftingDocumentView, ProvidesResize {


    interface MyUiBinder extends UiBinder<Widget, DraftingDocumentViewImpl> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    private static final Logger LOG = Logger.getLogger(DraftingDocumentViewImpl.class.getName());

    private final DocumentEventBus documentEventBus;

    @UiField
    DockLayoutPanel mainPanel;

    @UiField
    HTML documentTitle;

    @UiField(provided = true)
    SourceFileView sourceFileView;

    @UiField(provided = true)
    OutlineView outlineView;

    final SourceFileController sourceFileController;

    @Inject
    public DraftingDocumentViewImpl(final DocumentEventBus documentEventBus,
                                    final SourceFileController sourceFileController,
                                    final OutlineController outlineController,
                                    final RichTextEditor richTextEditor
    ) {

        this.documentEventBus = documentEventBus;
        this.outlineView = outlineController.getView();
        this.sourceFileController = sourceFileController;
        richTextEditor.asWidget().setVisible(false);
        this.sourceFileView = sourceFileController.getView();

        final Widget widget = uiBinder.createAndBindUi(this);
        initWidget(widget);
    }

    public void setDocumentHeight(final int height) {
        mainPanel.setHeight(height + "px");
    }

    public void setDocumentTitle(String titleHTML) {
        documentTitle.setHTML(titleHTML);
    }

    @Override
    public void switchToTab(int index) {
        // ignore
    }

    @Override
    public void showLoadingIndicator(boolean show, String message) {
        // ignore
    }
}
