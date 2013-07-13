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

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import org.nsesa.editor.gwt.amendment.client.amendment.AmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.amendment.client.amendment.AmendmentInjectionPointProvider;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.action.AmendmentActionPanelController;
import org.nsesa.editor.gwt.amendment.client.ui.document.AmendmentDocumentViewImpl;
import org.nsesa.editor.gwt.amendment.client.ui.document.marker.AmendmentMarkerController;
import org.nsesa.editor.gwt.amendment.client.ui.pagination.AmendmentPaginationController;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtoso20AmendmentController;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtoso20AmendmentControllerUtil;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.action.AkomaNtoso20AmendmentActionPanelController;
import org.nsesa.editor.gwt.an.amendments.client.ui.document.AkomaNtoso20SourceFileHeaderController;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtosoOverlayWidgetInjectionStrategy;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.CompositeLocator;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.sourcefile.actionbar.create.AkomaNtosoActionBarCreatePanelController;
import org.nsesa.editor.gwt.core.client.diffing.DiffingManager;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentEventBus;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentView;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.actionbar.create.ActionBarCreatePanelController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.header.SourceFileHeaderController;
import org.nsesa.editor.gwt.core.client.ui.document.sourcefile.marker.MarkerController;
import org.nsesa.editor.gwt.core.client.ui.overlay.DefaultSelector;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Selector;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetInjectionStrategy;
import org.nsesa.editor.gwt.core.client.ui.pagination.PaginationController;
import org.nsesa.editor.gwt.core.client.undo.UndoManager;

/**
 * Date: 15/10/12 21:23
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AmendmentDocumentModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(AmendmentController.class).to(AkomaNtoso20AmendmentController.class);
        bind(DocumentView.class).to(AmendmentDocumentViewImpl.class).in(Singleton.class);
        bind(SourceFileHeaderController.class).to(AkomaNtoso20SourceFileHeaderController.class).in(Singleton.class);
        bind(AmendmentActionPanelController.class).to(AkomaNtoso20AmendmentActionPanelController.class).in(Singleton.class);
        bind(MarkerController.class).to(AmendmentMarkerController.class).in(Singleton.class);
        bind(OverlayWidgetInjectionStrategy.class).to(AkomaNtosoOverlayWidgetInjectionStrategy.class).in(Singleton.class);
        bind(UndoManager.class).in(Singleton.class);
        bind(PaginationController.class).to(AmendmentPaginationController.class).in(Singleton.class);
        bindConstant().annotatedWith(Names.named("amendmentsPerPage")).to(10);
        bind(new TypeLiteral<DiffingManager<AmendmentController>>() {
        }).to(AmendmentDiffingManager.class).in(Singleton.class);

        bind(ActionBarCreatePanelController.class).to(AkomaNtosoActionBarCreatePanelController.class).in(Singleton.class);

        bind(AmendmentInjectionPointFinder.class).to(CompositeAmendmentInjectionPointFinder.class).in(Singleton.class);
        bind(AmendmentInjectionPointProvider.class).to(CompositeAmendmentInjectionPointProvider.class).in(Singleton.class);
        bind(Locator.class).to(CompositeLocator.class).in(Singleton.class);

        bindConstant().annotatedWith(Names.named("default.pathToOriginalContent")).to("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[0]");
        bindConstant().annotatedWith(Names.named("default.pathToAmendmentContent")).to("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[1]");
        // bindConstant().annotatedWith(Names.named("single.pathToOriginalContent")).to(null);
        bindConstant().annotatedWith(Names.named("single.pathToAmendmentContent")).to("//*");
        // bindConstant().annotatedWith(Names.named("consolidation.pathToOriginalContent")).to(null);
        bindConstant().annotatedWith(Names.named("consolidation.pathToAmendmentContent")).to("//*");

        requestStaticInjection(AkomaNtoso20AmendmentControllerUtil.class);

    }

    @Singleton
    @Provides
    @Inject
    Selector<AmendmentController> createSelector(DocumentEventBus documentEventBus) {
        return new DefaultSelector<AmendmentController>(documentEventBus);
    }
}
