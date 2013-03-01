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

import com.google.gwt.dom.client.Element;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayStrategy;

import java.util.Arrays;

/**
 * Date: 03/07/12 22:54
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20OverlayStrategy extends DefaultOverlayStrategy {

    @Inject
    public AkomaNtoso20OverlayStrategy() {
    }

    @Override
    public Boolean isAmendable(Element element) {
        // don't allow references to be amendable by themselves
        final String type = element.getAttribute("type") != null ? element.getAttribute("type").toLowerCase() : null;
        if (type != null && !Arrays.asList("noteRef", "passiveRef", "eventRef", "componentRef", "activeRef", "mRef", "ref")
                .contains(type)) {
            return super.isAmendable(element);
        }
        return false;
    }
}
