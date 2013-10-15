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

import com.google.inject.Inject;
import org.nsesa.editor.gwt.amendment.client.amendment.DefaultAmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetInjectionStrategy;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * An injection point finder for amendments that do not have a source {@link org.nsesa.editor.gwt.core.shared.AmendableWidgetReference} set.
 * Instead, we try to find the injection point by parsing the location string ('Article 2 - paragraph 3').
 * Date: 30/11/12 11:31
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class NLPAmendmentInjectionPointFinder extends DefaultAmendmentInjectionPointFinder {

    private static final Logger LOG = Logger.getLogger(NLPAmendmentInjectionPointFinder.class.getName());
    protected final Locator locator;

    @Inject
    public NLPAmendmentInjectionPointFinder(final OverlayWidgetInjectionStrategy overlayWidgetInjectionStrategy,
                                            final Locator locator) {
        super(overlayWidgetInjectionStrategy);
        this.locator = locator;
    }

    /**
     * Finds injection points for amendments based on the location string.
     *
     * @param amendmentController the amendment controller to find the injection points for
     * @param root                the root overlay widget node
     * @param documentController  the containing document controller
     * @return the list of injection points (that is, overlay widgets which should get the amendment controller)
     */
    @Override
    public List<OverlayWidget> findInjectionPoints(final AmendmentController amendmentController, final OverlayWidget root, final DocumentController documentController) {

        final OverlayWidget amendableWidget = amendmentController.asAmendableWidget(amendmentController.getModel().getBody());
        final OverlayWidget block = OverlayUtil.xpathSingle("//akomaNtoso/amendment/amendmentBody/amendmentHeading/block", amendableWidget);

        if (block == null) {
            LOG.info("Could not find heading block.");
            return null;
        }
        final String path = block.getInnerHTML();
        if (LOG.isLoggable(Level.FINE)) {
            LOG.fine("Trying to find nodes matching '" + path + "'");
        }

        final OverlayWidget[] holder = new OverlayWidget[1];
        root.walk(new OverlayWidgetWalker.DefaultOverlayWidgetVisitor() {
            @Override
            public boolean visit(final OverlayWidget visited) {
                final String location = locator.getLocation(visited, amendmentController.getModel().getLanguageISO(), false);
                if (holder[0] == null && path.equalsIgnoreCase(location)) {
                    // aha, found one
                    holder[0] = visited;
                }
                return holder[0] == null;
            }
        });
        if (LOG.isLoggable(Level.FINE)) {
            LOG.fine("Found node " + holder[0]);
        }
        return new ArrayList<OverlayWidget>(Arrays.asList(holder[0]));
    }
}
