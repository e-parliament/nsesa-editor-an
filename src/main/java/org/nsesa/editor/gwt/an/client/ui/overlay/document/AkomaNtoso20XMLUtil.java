/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

/**
 * Date: 07/02/13 16:12
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20XMLUtil {

    public static IDSimpleType id(final String text) {
        final IDSimpleType s = new IDSimpleType();
        s.setValue(text);
        return s;
    }

    public static StringSimpleType s(final String text) {
        final StringSimpleType s = new StringSimpleType();
        s.setValue(text);
        return s;
    }

    public static DateSimpleType d(final String text) {
        final DateSimpleType dateSimpleType = new DateSimpleType();
        dateSimpleType.setValue(text);
        return dateSimpleType;
    }

    public static AnyURISimpleType u(final String text) {
        final AnyURISimpleType anyURISimpleType = new AnyURISimpleType();
        anyURISimpleType.setValue(text);
        return anyURISimpleType;
    }

    public static LanguageSimpleType l(final String text) {
        final LanguageSimpleType languageSimpleType = new LanguageSimpleType();
        languageSimpleType.setValue(text);
        return languageSimpleType;
    }
}
