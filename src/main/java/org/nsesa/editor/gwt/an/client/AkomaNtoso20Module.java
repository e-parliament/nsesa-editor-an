package org.nsesa.editor.gwt.an.client;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20Locator;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20OverlayStrategy;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.AkomaNtoso20OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
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
        install(new EditorModule());
   		// bind the mapper
   		bind(ActivityMapper.class).to(EditorActivityMapper.class).in(Singleton.class);
        bind(OverlayFactory.class).to(AkomaNtoso20OverlayFactory.class).in(Singleton.class);
        bind(OverlayStrategy.class).to(AkomaNtoso20OverlayStrategy.class).in(Singleton.class);
        bind(Locator.class).to(AkomaNtoso20Locator.class).in(Singleton.class);
    }
}
