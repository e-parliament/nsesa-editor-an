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

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.DefaultCreator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.editor.client.ui.document.DocumentController;

import java.util.*;

/**
 * Date: 21/11/12 13:11
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20Creator extends DefaultCreator {

    private final OverlayFactory overlayFactory;

    @Inject
    public AkomaNtoso20Creator(OverlayFactory overlayFactory) {
        this.overlayFactory = overlayFactory;
    }

    @Override
    public LinkedHashMap<AmendableWidget, Occurrence> getAllowedSiblings(DocumentController documentController, AmendableWidget amendableWidget) {
        return getAllowedChildren(documentController, amendableWidget.getParentAmendableWidget());
    }

    @Override
    public LinkedHashMap<AmendableWidget, Occurrence> getAllowedChildren(DocumentController documentController, AmendableWidget amendableWidget) {
        final LinkedHashMap<AmendableWidget, Occurrence> allowedChildren = new LinkedHashMap<AmendableWidget, Occurrence>();
        final Map<AmendableWidget, Occurrence> allowedTypes = amendableWidget.getAllowedChildTypes();
        List<Map.Entry<AmendableWidget, Occurrence>> list = new ArrayList<Map.Entry<AmendableWidget, Occurrence>>(allowedTypes.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<AmendableWidget, Occurrence>>() {
            @Override
            public int compare(Map.Entry<AmendableWidget, Occurrence> o1, Map.Entry<AmendableWidget, Occurrence> o2) {
                return o1.getKey().getType().compareTo(o2.getKey().getType());
            }
        });
        for (final Map.Entry<AmendableWidget, Occurrence> allowedType : list) {
            allowedChildren.put(allowedType.getKey(), allowedType.getValue());
        }
        return allowedChildren;
    }
}
