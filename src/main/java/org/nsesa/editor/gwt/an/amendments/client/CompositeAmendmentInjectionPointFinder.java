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
import org.nsesa.editor.gwt.amendment.client.amendment.AmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.amendment.client.amendment.DefaultAmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.shared.AmendableWidgetReference;

import java.util.List;
import java.util.logging.Logger;

/**
 * A composite injection point finder that delegates to either the NLP version or the default one.
 * Date: 30/11/12 11:31
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class CompositeAmendmentInjectionPointFinder implements AmendmentInjectionPointFinder {

    private static final Logger LOG = Logger.getLogger(CompositeAmendmentInjectionPointFinder.class.getName());

    protected final NLPAmendmentInjectionPointFinder nlpAmendmentInjectionPointFinder;
    protected final DefaultAmendmentInjectionPointFinder defaultAmendmentInjectionPointFinder;

    @Inject
    public CompositeAmendmentInjectionPointFinder(NLPAmendmentInjectionPointFinder nlpAmendmentInjectionPointFinder,
                                                  DefaultAmendmentInjectionPointFinder defaultAmendmentInjectionPointFinder) {
        this.nlpAmendmentInjectionPointFinder = nlpAmendmentInjectionPointFinder;
        this.defaultAmendmentInjectionPointFinder = defaultAmendmentInjectionPointFinder;
    }

    @Override
    public List<OverlayWidget> findInjectionPoints(AmendmentController amendmentController, OverlayWidget root, DocumentController documentController) {
        if (amendmentController.getModel().getSourceReference() != null) {
            return defaultAmendmentInjectionPointFinder.findInjectionPoints(amendmentController, root, documentController);
        }
        return nlpAmendmentInjectionPointFinder.findInjectionPoints(amendmentController, root, documentController);
    }

    @Override
    public AmendableWidgetReference getInjectionPoint(OverlayWidget parent, OverlayWidget reference, OverlayWidget overlayWidget) {
        return nlpAmendmentInjectionPointFinder.getInjectionPoint(parent, reference, overlayWidget);
    }
}
