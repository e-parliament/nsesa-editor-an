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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlaySnippetFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlaySnippet;

/**
 * Specialized factory for akomantoso snippets
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 8/04/13 14:09
 */
public class AkomaNtoso20OverlaySnippetFactory extends DefaultOverlaySnippetFactory {

    @Inject
    public AkomaNtoso20OverlaySnippetFactory() {

        // example of a recital
        Num num = new Num();
        num.html("${widget.num}");

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html("\u200b");

        registerSnippet(new Recital(), new OverlaySnippet("recital", DOM.toString(num.asWidget().getElement()) + DOM.toString(p.asWidget().getElement())));

        registerSnippet(new Citation(), new OverlaySnippet("citation", DOM.toString(p.asWidget().getElement())));

        I i = new I();
        i.html("Article ${widget.num}");
        num.html(DOM.toString(i.asWidget().getElement()));


        p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html("\u200bType your content here ...​​\u200b");
        Content content = new Content();
        content.html(DOM.toString(p.asWidget().getElement()));
        Paragraph paragraph = new Paragraph();
        paragraph.html(DOM.toString(content.asWidget().getElement()));


        registerSnippet(new Article(), new OverlaySnippet("article", DOM.toString(num.asWidget().getElement()) + DOM.toString(paragraph.asWidget().getElement())));

    }
}
