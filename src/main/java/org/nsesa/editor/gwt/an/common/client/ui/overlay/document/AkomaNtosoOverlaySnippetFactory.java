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
import org.nsesa.editor.gwt.core.client.ui.overlay.Formatter;
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
public class AkomaNtosoOverlaySnippetFactory extends DefaultOverlaySnippetFactory {

    private final Formatter formatter;
    private final String caretPositionClassName;
    private final Messages messages;

    @Inject
    public AkomaNtosoOverlaySnippetFactory(@Named("html") final Formatter formatter,
                                           @Named("caretPositionClassName") final String caretPositionClassName,
                                           Messages messages) {

        this.formatter = formatter;
        this.caretPositionClassName = caretPositionClassName;
        this.messages = messages;

        // AN 2.0

        registerSnippet(new Point(), new OverlaySnippet("point", getAN20DefaultSnippet()));
        registerSnippet(new Indent(), new OverlaySnippet("indent", getAN20DefaultSnippet()));
        registerSnippet(new Citation(), new OverlaySnippet("citation", getAN20DefaultUnnumberedSnippet()));
        registerSnippet(new Recital(), new OverlaySnippet("recital", getAN20RecitalSnippet()));
        registerSnippet(new Paragraph(), new OverlaySnippet("paragraph", getAN20DefaultSnippet()));
        registerSnippet(new Article(), new OverlaySnippet("article", getAN20ArticleSnippet()));
        registerSnippet(new Subparagraph(), new OverlaySnippet("subparagraph", getAN20DefaultSnippet()));

        // AN 3.0 - 02
        registerSnippet(new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Point(), new OverlaySnippet("point", getAN30DefaultSnippet()));
        registerSnippet(new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Indent(), new OverlaySnippet("indent", getAN30DefaultSnippet()));
        registerSnippet(new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Citation(), new OverlaySnippet("citation", getAN30DefaultUnnumberedSnippet()));
        registerSnippet(new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Recital(), new OverlaySnippet("recital", getAN30RecitalSnippet()));
        registerSnippet(new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Paragraph(), new OverlaySnippet("paragraph", getAN30DefaultSnippet()));
        registerSnippet(new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Article(), new OverlaySnippet("article", getAN30ArticleSnippet()));
        registerSnippet(new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Subparagraph(), new OverlaySnippet("subparagraph", getAN30DefaultSnippet()));
    }

    protected String getAN20ArticleSnippet() {
        I i = new I();
        i.html(messages.placeholderNumArticle());

        Num num = new Num();
        num.addI(i);

        Heading heading = new Heading();
        B b = new B();
        b.html("Heading");
        heading.addB(b);
        setCaret(b);

        P p = new P();
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        Content content = new Content();
        content.addP(p);

        Paragraph paragraph = new Paragraph();
        paragraph.setContent_(content);

        return formatter.format(num) + formatter.format(heading) + formatter.format(paragraph);
    }

    protected String getAN20DefaultSnippet() {
        Num num = new Num();
        num.html(messages.placeholderNumDefault());

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        Content content = new Content();
        content.addP(p);

        return formatter.format(num) + formatter.format(content);
    }

    protected String getAN20RecitalSnippet() {
        Num num = new Num();
        num.html(messages.placeholderNumDefault());

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        return formatter.format(num) + formatter.format(p);
    }

    protected String getAN20DefaultUnnumberedSnippet() {

        P p = new P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        Content content = new Content();
        content.addP(p);

        return formatter.format(content);
    }

    protected String getAN30ArticleSnippet() {
        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.I i = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.I();
        i.html(messages.placeholderNumArticle());

        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Num num = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Num();
        num.addI(i);

        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Heading heading = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Heading();
        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.B b = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.B();
        b.html("Heading");
        heading.addB(b);
        setCaret(b);

        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.P p = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.P();
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Content content = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Content();
        content.addP(p);

        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Paragraph paragraph = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Paragraph();
        paragraph.setContent_(content);

        return formatter.format(num) + formatter.format(heading) + formatter.format(paragraph);
    }

    protected String getAN30DefaultSnippet() {
        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Num num = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Num();
        num.html(messages.placeholderNumDefault());

        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.P p = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Content content = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Content();
        content.addP(p);

        return formatter.format(num) + formatter.format(content);
    }

    protected String getAN30RecitalSnippet() {
        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Num num = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Num();
        num.html(messages.placeholderNumDefault());

        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.P p = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        return formatter.format(num) + formatter.format(p);
    }

    protected String getAN30DefaultUnnumberedSnippet() {

        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.P p = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.P();
        // set an empty character - this acts as a caret anchor position.
        p.html(messages.placeholderContentDefault());
        setCaret(p);
        org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Content content = new org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Content();
        content.addP(p);

        return formatter.format(content);
    }

    @Override
    public String getCaretPositionClassName() {
        return caretPositionClassName;
    }

    protected void setCaret(final OverlayWidget overlayWidget) {
        overlayWidget.getOverlayElement().addClassName(caretPositionClassName);
    }
}
