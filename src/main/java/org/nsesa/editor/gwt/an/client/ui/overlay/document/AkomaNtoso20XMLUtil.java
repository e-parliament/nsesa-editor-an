package org.nsesa.editor.gwt.an.client.ui.overlay.document;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

/**
 * Date: 07/02/13 16:12
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20XMLUtil {

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
