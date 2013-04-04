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
package org.nsesa.editor.gwt.an.drafting.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import org.nsesa.editor.gwt.an.drafting.client.ui.main.DraftingController;
import org.nsesa.editor.gwt.editor.client.Editor;

/**
 * Date: 15/10/12 21:20
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class DraftingEditor extends Editor {

    private DraftingInjector draftingInjector = GWT.create(DraftingInjector.class);
    private DraftingController draftingController;

    @Override
    public void onModuleLoadDeferred() {
        super.onModuleLoadDeferred();
    }

    @Override
    protected void initializeUI() {
        draftingController = getInjector().getDraftingController();
        draftingController.registerListeners();
        draftingController.setInjector(getInjector());
        RootLayoutPanel.get().add(draftingController.getView());
    }

    public DraftingInjector getInjector() {
        return draftingInjector;
    }
}
