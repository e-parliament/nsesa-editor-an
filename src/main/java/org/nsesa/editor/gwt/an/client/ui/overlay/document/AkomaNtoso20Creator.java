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
    public LinkedHashMap<String, AmendableWidget> getAllowedSiblings(DocumentController documentController, AmendableWidget amendableWidget) {
        return getAllowedChildren(documentController, amendableWidget.getParentAmendableWidget());
    }

    @Override
    public LinkedHashMap<String, AmendableWidget> getAllowedChildren(DocumentController documentController, AmendableWidget amendableWidget) {
        final LinkedHashMap<String, AmendableWidget> allowedChildren = new LinkedHashMap<String, AmendableWidget>();
        final Map<AmendableWidget, Occurrence> allowedTypes = amendableWidget.getAllowedChildTypes();
        List<Map.Entry<AmendableWidget, Occurrence>> list = new ArrayList<Map.Entry<AmendableWidget, Occurrence>>(allowedTypes.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<AmendableWidget, Occurrence>>() {
            @Override
            public int compare(Map.Entry<AmendableWidget, Occurrence> o1, Map.Entry<AmendableWidget, Occurrence> o2) {
                return o1.getKey().getType().compareTo(o2.getKey().getType());
            }
        });
        for (final Map.Entry<AmendableWidget, Occurrence> allowedType : list) {
            allowedChildren.put(allowedType .getKey().getType(), allowedType.getKey());
        }
        return allowedChildren;
    }
}
