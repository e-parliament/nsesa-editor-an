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
package org.nsesa.editor.gwt.an.amendments.client;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.compare.client.ui.compare.CompareController;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.AmendmentDialogController;
import org.nsesa.editor.gwt.editor.client.Editor;

/**
 * Date: 15/10/12 21:20
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoEditor extends Editor {

    final AmendmentInjector injector = GWT.create(AmendmentInjector.class);

    private AmendmentDialogController amendmentDialogController;
    private CompareController compareController;

    @Override
    public void onModuleLoad() {
        super.onModuleLoad();
        amendmentDialogController = injector.getAmendmentDialogController();
        amendmentDialogController.registerListeners();
        compareController = injector.getCompareController();
        compareController.registerListeners();
    }

    public AmendmentInjector getInjector() {
        return injector;
    }
}
