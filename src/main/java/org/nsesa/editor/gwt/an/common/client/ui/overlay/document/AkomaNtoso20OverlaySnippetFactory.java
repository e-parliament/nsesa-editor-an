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

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.NumberingType;
import org.nsesa.editor.gwt.core.client.ui.overlay.Transformer;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.*;

/**
 * Specialized factory for akomantoso snippets
 *
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 8/04/13 14:09
 */
public class AkomaNtoso20OverlaySnippetFactory extends DefaultOverlaySnippetFactory {

    private final Transformer transformer;
    private final String caretPositionClassName;

    @Inject
    public AkomaNtoso20OverlaySnippetFactory(@Named("html") final Transformer transformer,
                                             @Named("caretPositionClassName") final String caretPositionClassName) {

        this.transformer = transformer;
        this.caretPositionClassName = caretPositionClassName;

        registerSnippet(new Citation(), new OverlaySnippet("citation", getCitationSnippet()));
        registerSnippet(new Recital(), new OverlaySnippet("recital", getRecitalSnippet()));
        registerSnippet(new Paragraph(), new OverlaySnippet("paragraph", getParagraphSnippet()));
        registerSnippet(new Article(), new OverlaySnippet("article", getArticleSnippet()));

    }

    protected String getArticleSnippet() {
        I i = new I();
        i.html("Article ${widget.num}");

        Num num = new Num();
        num.addI(i);

        P p = new P();
        p.html("Type your content here ...​​");
        p.getOverlayElement().addClassName(caretPositionClassName);
        Content content = new Content();
        content.addP(p);

        Paragraph paragraph = new Paragraph();
        paragraph.setContent_(content);

        return transformer.transform(num) + transformer.transform(paragraph);
    }

    protected String getParagraphSnippet() {
        Num num = new Num();
        num.html("${widget.num}");

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html("Type your content here ...​​");
        p.getOverlayElement().addClassName(caretPositionClassName);
        Content content = new Content();
        content.addP(p);

        return transformer.transform(num) + transformer.transform(content);
    }

    protected String getRecitalSnippet() {
        Num num = new Num();
        num.html("${widget.num}");

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html("Type your content here...");
        p.getOverlayElement().addClassName(caretPositionClassName);
        return transformer.transform(num) + transformer.transform(p);
    }

    protected String getCitationSnippet() {

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html("Type your content here ...​​");
        p.getOverlayElement().addClassName(caretPositionClassName);
        Content content = new Content();
        content.addP(p);

        return transformer.transform(content);
    }

    @Override
    public String getCaretPositionClassName() {
        return caretPositionClassName;
    }

    /**
     * An evaluator for num that will compute the num based on the existing widgets
     */
    public static class NumEvaluator implements OverlaySnippetEvaluator.Evaluator {

        private ClientFactory clientFactory;
        private OverlayWidgetInjectionStrategy widgetInjectionStrategy;
        private Locator locator;
        private OverlayWidget overlayWidget;
        private OverlayWidget parent;
        private OverlayWidget reference;

        public NumEvaluator(ClientFactory clientFactory,
                            OverlayWidgetInjectionStrategy widgetInjectionStrategy,
                            Locator locator,
                            OverlayWidget overlayWidget,
                            OverlayWidget parent,
                            OverlayWidget reference) {
            this.clientFactory = clientFactory;
            this.widgetInjectionStrategy = widgetInjectionStrategy;
            this.locator = locator;
            this.overlayWidget = overlayWidget;
            this.parent = parent;
            this.reference = reference;
        }

        @Override
        public String getPlaceHolder() {
            return "${widget.num}";
        }

        @Override
        public String evaluate() {
            if (overlayWidget.getNumberingType() == null) {
                // if there is a sibling of the same type, use that one
                OverlayWidget sibling = overlayWidget.next(new OverlayWidgetSelector() {
                    @Override
                    public boolean select(OverlayWidget toSelect) {
                        return true;
                    }
                });
                if (sibling != null) {
                    overlayWidget.setNumberingType(sibling.getNumberingType());
                } else {
                    // take the parent's numbering, but use a different one
                    // TODO
                    overlayWidget.setNumberingType(NumberingType.ROMANITO);
                }
            }
            //add the overlay widget in the parent children collection to compute the num
            final int injectionPosition = widgetInjectionStrategy.getProposedInjectionPosition(parent, reference, overlayWidget);

            parent.addOverlayWidget(overlayWidget, injectionPosition);
            String num = locator.getNum(overlayWidget, clientFactory.getClientContext().getDocumentTranslationLanguageCode(), true);
            parent.removeOverlayWidget(overlayWidget);
            return num == null ? "" : num;
        }
    }
}
