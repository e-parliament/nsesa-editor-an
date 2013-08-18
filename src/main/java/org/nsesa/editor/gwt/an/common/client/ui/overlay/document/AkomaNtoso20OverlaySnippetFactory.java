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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.resources.Messages;
import org.nsesa.editor.gwt.core.client.ui.overlay.Transformer;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlaySnippetFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlaySnippet;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

/**
 * Specialized factory for snippets that contain small 'templates' for a given overlay widget. For example, if you add
 * a paragraph, you'd want to retrieve a structure that resolves something like:
 * {@code <paragraph><num>${placeholder.num}</num><content><p>${placeholder.content}</p></content></paragraph>}
 * Rather than just the {@code <paragraph></paragraph>} structure.
 * <p/>
 * It also supports the ability to set a selection and caret position, for easier and quicker editing in the CKEditor.
 * <p/>
 * This class supports the AkomaNtoso 2.0 specification.
 *
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 8/04/13 14:09
 */
public class AkomaNtoso20OverlaySnippetFactory extends DefaultOverlaySnippetFactory {

    private final Transformer transformer;
    private final String caretPositionClassName;
    private final Messages messages;

    @Inject
    public AkomaNtoso20OverlaySnippetFactory(@Named("html") final Transformer transformer,
                                             @Named("caretPositionClassName") final String caretPositionClassName,
                                             Messages messages) {

        this.transformer = transformer;
        this.caretPositionClassName = caretPositionClassName;
        this.messages = messages;

        registerSnippet(new Citation(), new OverlaySnippet("citation", getCitationSnippet()));
        registerSnippet(new Recital(), new OverlaySnippet("recital", getRecitalSnippet()));
        registerSnippet(new Paragraph(), new OverlaySnippet("paragraph", getParagraphSnippet()));
        registerSnippet(new Article(), new OverlaySnippet("article", getArticleSnippet()));

    }

    protected String getArticleSnippet() {
        I i = new I();
        i.html(messages.placeholderNumArticle());

        Num num = new Num();
        num.addI(i);

        P p = new P();
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        Content content = new Content();
        content.addP(p);

        Paragraph paragraph = new Paragraph();
        paragraph.setContent_(content);

        return transformer.transform(num) + transformer.transform(paragraph);
    }

    protected String getParagraphSnippet() {
        Num num = new Num();
        num.html(messages.placeholderNumDefault());

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        Content content = new Content();
        content.addP(p);

        return transformer.transform(num) + transformer.transform(content);
    }

    protected String getRecitalSnippet() {
        Num num = new Num();
        num.html(messages.placeholderNumDefault());

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        return transformer.transform(num) + transformer.transform(p);
    }

    protected String getCitationSnippet() {

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        Content content = new Content();
        content.addP(p);

        return transformer.transform(content);
    }

    @Override
    public String getCaretPositionClassName() {
        return caretPositionClassName;
    }

    protected void setCaret(final OverlayWidget overlayWidget) {
        overlayWidget.getOverlayElement().addClassName(caretPositionClassName);
    }
}
