package org.nsesa.editor.gwt.an.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20Creator;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20Locator;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20OverlayStrategy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.Akomantoso20OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentModifyAwareController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.author.AuthorPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.content.ContentPanelController;
import org.nsesa.editor.gwt.editor.client.activity.EditorActivityMapper;
import org.nsesa.editor.gwt.editor.client.ui.main.EditorModule;

import java.util.Arrays;
import java.util.List;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20Module extends AbstractGinModule {
    @Override
    protected void configure() {
        install(new EditorModule());
   		// bind the mapper
   		bind(ActivityMapper.class).to(EditorActivityMapper.class).in(Singleton.class);
        bind(OverlayFactory.class).to(Akomantoso20OverlayFactory.class).in(Singleton.class);
        bind(OverlayStrategy.class).to(AkomaNtoso20OverlayStrategy.class).in(Singleton.class);
        bind(Locator.class).to(AkomaNtoso20Locator.class).in(Singleton.class);
        bind(Creator.class).to(AkomaNtoso20Creator.class).in(Singleton.class);

        bind(new TypeLiteral<List<AmendmentModifyAwareController>>(){}).annotatedWith(Names.named("modify.controllers")).toProvider(ModifyControllersProvider.class);
    }

    public static class ModifyControllersProvider implements Provider<List<AmendmentModifyAwareController>> {

        @Inject
        AuthorPanelController authorPanelController;

        @Inject
        ContentPanelController contentPanelController;

        @Override
        public List<AmendmentModifyAwareController> get() {
            return Arrays.asList(contentPanelController, authorPanelController);
        }
    }
}
