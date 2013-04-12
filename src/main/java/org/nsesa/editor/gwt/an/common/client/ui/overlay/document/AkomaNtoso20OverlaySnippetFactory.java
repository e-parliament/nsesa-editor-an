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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document;

import com.google.gwt.user.client.DOM;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Num;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.P;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Recital;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlaySnippetFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlaySnippet;

/**
 * Specialized factory for akomantoso snippets
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 8/04/13 14:09
 */
public class AkomaNtoso20OverlaySnippetFactory extends DefaultOverlaySnippetFactory {

    @Inject
    public AkomaNtoso20OverlaySnippetFactory() {

        // example of a recital
        final Num num = new Num();
        num.html("${widget.num}");

        final P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html("\u200b");
        p.getClassAttr().getValue();

        registerSnippet(new Recital(), new OverlaySnippet("recital", DOM.toString(num.asWidget().getElement()) + DOM.toString(p.asWidget().getElement())));
    }
}
