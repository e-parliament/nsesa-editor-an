package org.nsesa.editor.gwt.an.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import org.nsesa.editor.gwt.an.client.handler.create.AkomaNtoso20AmendmentDialogCreateController;
import org.nsesa.editor.gwt.an.client.handler.modify.AkomaNtoso20AmendmentDialogModifyController;
import org.nsesa.editor.gwt.an.client.handler.modify.content.AkomaNtoso20ContentPanelController;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20Creator;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20Locator;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20OverlayStrategy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.Akomantoso20OverlayFactory;
import org.nsesa.editor.gwt.core.client.diffing.DiffingManager;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.content.ContentPanelController;
import org.nsesa.editor.gwt.editor.client.activity.EditorActivityMapper;
import org.nsesa.editor.gwt.editor.client.ui.main.EditorModule;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20Module extends AbstractGinModule {
    @Override
    protected void configure() {
        bindConstant().annotatedWith(Names.named("richTextEditorBodyClass")).to("akomaNtoso");
        bindConstant().annotatedWith(Names.named("richTextEditorCss")).to("css/editor.css,css/document.css,css/amendment.css,css/akomaNtoso.css,css/akomaNtoso-override.css,css/ckeditor.css");
        install(new EditorModule());
        // bind the mapper
        bind(ActivityMapper.class).to(EditorActivityMapper.class).in(Singleton.class);
        bind(OverlayFactory.class).to(Akomantoso20OverlayFactory.class).in(Singleton.class);
        bind(OverlayStrategy.class).to(AkomaNtoso20OverlayStrategy.class).in(Singleton.class);
        bind(Locator.class).to(AkomaNtoso20Locator.class).in(Singleton.class);
        bind(Creator.class).to(AkomaNtoso20Creator.class).in(Singleton.class);
        bind(DiffingManager.class).to(AkomaNtoso20DiffingManager.class).in(Singleton.class);
        bind(AmendmentDialogModifyController.class).to(AkomaNtoso20AmendmentDialogModifyController.class);
        bind(AmendmentDialogCreateController.class).to(AkomaNtoso20AmendmentDialogCreateController.class);
        bind(ContentPanelController.class).to(AkomaNtoso20ContentPanelController.class);
    }
}
