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
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.*;
import org.nsesa.editor.gwt.core.client.ui.overlay.DefaultLocator;

/**
 * Date: 06/07/12 17:24                                                                              `
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso30Locator extends DefaultLocator {

    @Inject
    public AkomaNtoso30Locator() {
        hide(AkomaNtoso.class, Body.class, Preamble.class, Bill.class, Components.class, Component.class, Eol.class, P.class, B.class, I.class, Span.class, Recitals.class, Content.class/*, Num.class*/);
    }
}
