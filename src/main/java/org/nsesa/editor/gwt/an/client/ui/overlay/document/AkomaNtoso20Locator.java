package org.nsesa.editor.gwt.an.client.ui.overlay.document;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ui.overlay.DefaultLocator;

/**
 * Date: 06/07/12 17:24
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20Locator extends DefaultLocator {
    public AkomaNtoso20Locator() {
        hide(AkomaNtoso.class, Body.class, Preamble.class, Components.class, Component.class, Eol.class, P.class, B.class, I.class, Span.class, Recitals.class, Content.class/*, Num.class*/);
    }
}
