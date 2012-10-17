package org.nsesa.editor.gwt.an.client;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.editor.client.Editor;

/**
 * Date: 15/10/12 21:20
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoEditor extends Editor {

    final AkomaNtoso20Injector injector = GWT.create(AkomaNtoso20Injector.class);

    public AkomaNtoso20Injector getInjector() {
        return injector;
    }
}
