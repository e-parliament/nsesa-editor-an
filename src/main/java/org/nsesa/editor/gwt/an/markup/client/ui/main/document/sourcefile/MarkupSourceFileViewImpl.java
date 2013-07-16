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
package org.nsesa.editor.gwt.an.markup.client.ui.main.document.sourcefile;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.SourceFileView;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.ActionBarController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.ActionBarView;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.content.ContentController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.content.ContentView;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.header.SourceFileHeaderController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.header.SourceFileHeaderView;

/**
 * Date: 24/03/13 13:09
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class MarkupSourceFileViewImpl extends Composite implements SourceFileView {
    interface MyUiBinder extends UiBinder<Widget, MarkupSourceFileViewImpl> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);
    @UiField
    HorizontalPanel horizontalPanel;
    @UiField(provided = true)
    ContentView contentView;
    @UiField(provided = true)
    SourceFileHeaderView sourceFileHeaderView;
    @UiField(provided = true)
    ActionBarView actionBarView;

    @Inject
    public MarkupSourceFileViewImpl(final DocumentEventBus documentEventBus,
                                    final ContentController contentController,
                                    final ActionBarController actionBarController,
                                    final SourceFileHeaderController sourceFileHeaderController) {

        this.contentView = contentController.getView();
        this.actionBarView = actionBarController.getView();
        this.sourceFileHeaderView = sourceFileHeaderController.getView();

        final Widget widget = uiBinder.createAndBindUi(this);
        initWidget(widget);
        if (!GWT.isScript())
            widget.setTitle(this.getClass().getName());

        contentController.getView().setScrollPanelOffset(0);
    }
}
