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
package org.nsesa.editor.gwt.an.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.client.ui.amendment.AkomaNtoso20AmendmentController;
import org.nsesa.editor.gwt.an.client.ui.amendment.action.AkomaNtoso20AmendmentActionPanelController;
import org.nsesa.editor.gwt.an.client.ui.document.AkomaNtoso20SourceFileHeaderController;
import org.nsesa.editor.gwt.core.client.diffing.DiffingManager;
import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.amendment.action.AmendmentActionPanelController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.header.SourceFileHeaderController;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20DocumentModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(AmendmentController.class).to(AkomaNtoso20AmendmentController.class);
        bind(SourceFileHeaderController.class).to(AkomaNtoso20SourceFileHeaderController.class).in(Singleton.class);
        bind(AmendmentActionPanelController.class).to(AkomaNtoso20AmendmentActionPanelController.class).in(Singleton.class);
        bind(DiffingManager.class).to(AkomaNtoso20DiffingManager.class).in(Singleton.class);
    }
}
