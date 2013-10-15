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
package org.nsesa.editor.gwt.an.amendments.client.ui.amendment;

import com.google.gwt.user.client.DOM;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.*;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.action.AmendmentActionPanelController;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.resources.Constants;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.resources.Messages;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;

import java.util.List;
import java.util.logging.Logger;

/**
 * Date: 09/01/13 16:38
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoAmendmentController extends DefaultAmendmentController {

    private static final Logger LOG = Logger.getLogger(AkomaNtosoAmendmentController.class.getName());

    private final ConsolidatedAmendmentViewImpl consolidatedAmendmentView;
    private final ConsolidatedAmendmentViewImpl consolidatedAmendmentViewExtended;
    private final SingleColumnAmendmentViewImpl singleColumnAmendmentView;
    private final SingleColumnAmendmentViewImpl singleColumnAmendmentViewExtended;

    @Inject
    public AkomaNtosoAmendmentController(AmendmentView amendmentView, AmendmentView amendmentExtendedView,
                                         AmendmentActionPanelController amendmentActionPanelController,
                                         Constants constants, Messages messages,
                                         ConsolidatedAmendmentViewImpl consolidatedAmendmentView,
                                         ConsolidatedAmendmentViewImpl consolidatedAmendmentViewExtended,
                                         SingleColumnAmendmentViewImpl singleColumnAmendmentView,
                                         SingleColumnAmendmentViewImpl singleColumnAmendmentViewExtended) {
        super(amendmentView, amendmentExtendedView, amendmentActionPanelController, constants, messages);
        this.consolidatedAmendmentView = consolidatedAmendmentView;
        this.consolidatedAmendmentViewExtended = consolidatedAmendmentViewExtended;
        this.singleColumnAmendmentView = singleColumnAmendmentView;
        this.singleColumnAmendmentViewExtended = singleColumnAmendmentViewExtended;
    }

    @Override
    public void registerViews() {
        super.registerViews();

        this.availableViews.put(AmendmentView.CONSOLIDATION, consolidatedAmendmentView);
        this.availableExtendedViews.put(AmendmentView.CONSOLIDATION, consolidatedAmendmentViewExtended);
        this.availableViews.put(AmendmentView.SINGLE, singleColumnAmendmentView);
        this.availableExtendedViews.put(AmendmentView.SINGLE, singleColumnAmendmentViewExtended);
    }

    @Override
    public void setBody(String xmlContent) {
        // to make sure we don't do a double overlaying -- too costly
        if (view != availableViews.get(AmendmentView.DEFAULT) || extendedView != availableExtendedViews.get(AmendmentView.DEFAULT)) {
            // if we're not in the default template (2 columns), then only set the amendment content on the body
            final OverlayWidget amendmentContentFromModel = AkomaNtosoAmendmentControllerUtil.getAmendmentContentFromModel(this);
            final String content = DOM.toString(amendmentContentFromModel.asWidget().getElement());
            if (view != availableViews.get(AmendmentView.DEFAULT))
                view.setBody(content);
            if (extendedView != availableExtendedViews.get(AmendmentView.DEFAULT))
                extendedView.setBody(content);
        } else {
            super.setBody(xmlContent);
        }
    }

    @Override
    public void mergeIntoBundle(AmendmentController toBundle) {
        super.mergeIntoBundle(toBundle);

        // merge the xml content in
        // TODO xpath expression to the change block is not configurable
        final OverlayWidget amendmentOverlayWidget = toBundle.asAmendableWidget(toBundle.getModel().getBody());
        final List<OverlayWidget> mods = OverlayUtil.find("mod", amendmentOverlayWidget);

        if (mods != null && !mods.isEmpty()) {
            // add all mods to this body
            final OverlayWidget overlayWidget = asAmendableWidget(getModel().getBody());
            final OverlayWidget changeBlock = OverlayUtil.findSingle("block[name=\"changeBlock\"]", overlayWidget);

            for (final OverlayWidget mod : mods) {
                changeBlock.addOverlayWidget(mod);
                // add to the DOM as well
                changeBlock.getOverlayElement().appendChild(mod.getOverlayElement());
            }
            getModel().setRoot(overlayWidget);
            LOG.info("Successfully merged " + toBundle + " into " + this);
        } else {
            LOG.warning("Could not find mods in amendment body?");
        }
    }

    @Override
    public void removedFromBundle(AmendmentController amendmentController) {
        super.removedFromBundle(amendmentController);

        // remove the xml content

    }
}
