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
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
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
    public LinkedHashMap<OverlayWidget, Occurrence> getAllowedSiblings(DocumentController documentController, OverlayWidget overlayWidget) {
        return getAllowedChildren(documentController, overlayWidget.getParentOverlayWidget());
    }

    @Override
    public LinkedHashMap<OverlayWidget, Occurrence> getAllowedChildren(DocumentController documentController, OverlayWidget overlayWidget) {
        final LinkedHashMap<OverlayWidget, Occurrence> allowedChildren = new LinkedHashMap<OverlayWidget, Occurrence>();
        final Map<OverlayWidget, Occurrence> allowedTypes = overlayWidget.getAllowedChildTypes();
        List<Map.Entry<OverlayWidget, Occurrence>> list = new ArrayList<Map.Entry<OverlayWidget, Occurrence>>(allowedTypes.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<OverlayWidget, Occurrence>>() {
            @Override
            public int compare(Map.Entry<OverlayWidget, Occurrence> o1, Map.Entry<OverlayWidget, Occurrence> o2) {
                return o1.getKey().getType().compareTo(o2.getKey().getType());
            }
        });
        for (final Map.Entry<OverlayWidget, Occurrence> allowedType : list) {
            allowedChildren.put(allowedType.getKey(), allowedType.getValue());
        }
        return allowedChildren;
    }
}
