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
import org.nsesa.editor.gwt.amendment.client.amendment.AmendmentInjectionPointProvider;
import org.nsesa.editor.gwt.amendment.client.amendment.DefaultAmendmentInjectionPointProvider;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

import java.util.logging.Logger;

/**
 * A composite injection point finder that delegates to either the NLP version or the default one.
 * Date: 30/11/12 11:31
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class CompositeAmendmentInjectionPointProvider implements AmendmentInjectionPointProvider {

    private static final Logger LOG = Logger.getLogger(CompositeAmendmentInjectionPointProvider.class.getName());

    protected final NLPAmendmentInjectionPointProvider nlpAmendmentInjectionPointProvider;
    protected final DefaultAmendmentInjectionPointProvider defaultAmendmentInjectionPointProvider;

    @Inject
    public CompositeAmendmentInjectionPointProvider(NLPAmendmentInjectionPointProvider nlpAmendmentInjectionPointProvider, DefaultAmendmentInjectionPointProvider defaultAmendmentInjectionPointProvider) {
        this.nlpAmendmentInjectionPointProvider = nlpAmendmentInjectionPointProvider;
        this.defaultAmendmentInjectionPointProvider = defaultAmendmentInjectionPointProvider;
    }

    @Override
    public OverlayWidget provideInjectionPoint(AmendmentController amendmentController, OverlayWidget injectionPoint, DocumentController documentController) {
        if (amendmentController.getModel().getSourceReference() != null) {
            return defaultAmendmentInjectionPointProvider.provideInjectionPoint(amendmentController, injectionPoint, documentController);
        }
        return nlpAmendmentInjectionPointProvider.provideInjectionPoint(amendmentController, injectionPoint, documentController);
    }
}
