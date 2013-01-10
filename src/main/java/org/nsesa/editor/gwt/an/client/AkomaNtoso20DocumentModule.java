package org.nsesa.editor.gwt.an.client;

import com.google.gwt.inject.client.AbstractGinModule;
import org.nsesa.editor.gwt.an.client.ui.amendment.AkomaNtoso20AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentController;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20DocumentModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(AmendmentController.class).to(AkomaNtoso20AmendmentController.class);
//        bind(AmendmentActionPanelController.class).to(AkomaNtoso20AmendmentActionPanelController.class);
    }
}
