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

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Recital;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlaySnippetFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlaySnippet;

/**
 * Specialized factory for akomantoso snippets
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 8/04/13 14:09
 */
public class AkomaNtoso20OverlaySnippetFactory extends DefaultOverlaySnippetFactory {

    public AkomaNtoso20OverlaySnippetFactory() {
        super();
        registerSnippet(new OverlaySnippet("recital", "<span class=\"widget num\" ns=\"http://www.akomantoso.org/2.0\" type=\"num\">${widget.num}</span> <span class=\"widget p\" ns=\"http://www.akomantoso.org/2.0\" type=\"p\">type me</p>"), new Recital());
    }
}
