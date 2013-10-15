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
import org.nsesa.editor.gwt.amendment.client.amendment.DefaultAmendmentInjectionPointProvider;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Location;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetInjectionStrategy;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.core.shared.OverlayWidgetOrigin;

import java.util.logging.Logger;

/**
 * An injection point finder for amendments that do not have a source {@link org.nsesa.editor.gwt.core.shared.AmendableWidgetReference} set.
 * Instead, we try to find the injection point by parsing the location string ('Article 2 - paragraph 3').
 * Date: 30/11/12 11:31
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class NLPAmendmentInjectionPointProvider extends DefaultAmendmentInjectionPointProvider {

    private static final Logger LOG = Logger.getLogger(NLPAmendmentInjectionPointProvider.class.getName());
    protected final Locator locator;
    protected final OverlayFactory overlayFactory;

    @Inject
    public NLPAmendmentInjectionPointProvider(final OverlayWidgetInjectionStrategy overlayWidgetInjectionStrategy,
                                              final Locator locator,
                                              final OverlayFactory overlayFactory) {
        super(overlayWidgetInjectionStrategy);
        this.locator = locator;
        this.overlayFactory = overlayFactory;
    }

    @Override
    public OverlayWidget provideInjectionPoint(AmendmentController amendmentController, OverlayWidget injectionPoint, DocumentController documentController) {

        final OverlayWidget amendableWidget = amendmentController.asAmendableWidget(amendmentController.getModel().getBody());
        final OverlayWidget block = OverlayUtil.xpathSingle("//akomaNtoso/amendment/amendmentBody/amendmentHeading/block", amendableWidget);

        if (block == null) {
            LOG.info("Could not find heading block.");
            return null;
        }
        final String location = block.getInnerHTML();
        final String languageISO = amendmentController.getModel().getLanguageISO();
        final Location[] locations = locator.parse(injectionPoint, location, languageISO);
        final Location lastPart = locations[locations.length - 1];
        boolean isCreation = lastPart.isNew();

        // check if we need to create a new element or not
        if (isCreation) {
            // we have to guess here a bit - assume we can use the namespace of the injection point we found
            final OverlayWidget toInject = documentController.getOverlayFactory().getAmendableWidget(injectionPoint.getNamespaceURI(), lastPart.getType());

            if (toInject == null)
                throw new NullPointerException("The provided overlay factory " + documentController.getOverlayFactory() + " was not able to provide an injection point for " + location);

            // mark the origin so we know it was introduced by amendments.
            toInject.setOrigin(OverlayWidgetOrigin.AMENDMENT);
            // make sure our document controller is listening to the UI events
            toInject.setUIListener(documentController.getSourceFileController());

            if (lastPart.isSibling()) {
                overlayWidgetInjectionStrategy.injectAsSibling(injectionPoint, toInject);
            } else {
                overlayWidgetInjectionStrategy.injectAsChild(injectionPoint, toInject);
            }
            return toInject;
        } else {
            LOG.info("Added amendment directly on " + injectionPoint);
            return injectionPoint;
        }
    }
}
