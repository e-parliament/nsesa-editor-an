package org.nsesa.editor.gwt.an.client;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.AmendmentDialogController;
import org.nsesa.editor.gwt.editor.client.Editor;

/**
 * Date: 15/10/12 21:20
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoEditor extends Editor {

    final AkomaNtoso20Injector injector = GWT.create(AkomaNtoso20Injector.class);

    private AmendmentDialogController amendmentDialogController;

    @Override
    public void onModuleLoad() {
        super.onModuleLoad();
        amendmentDialogController = injector.getAmendmentDialogController();
    }

    public AkomaNtoso20Injector getInjector() {
        return injector;
    }
}
