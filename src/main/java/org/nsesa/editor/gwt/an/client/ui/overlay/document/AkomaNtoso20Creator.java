package org.nsesa.editor.gwt.an.client.ui.overlay.document;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.DefaultCreator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.editor.client.ui.document.DocumentController;

import java.util.LinkedHashMap;
import java.util.Map;

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
        final Map<AmendableWidget, Occurrence> allowedTypes = amendableWidget.getAllowedSubTypes();
        for (final Map.Entry<AmendableWidget, Occurrence> allowedType : allowedTypes.entrySet()) {
            allowedChildren.put(allowedType.getKey().getType(), overlayFactory.getAmendableWidget(allowedType.getKey().getType()));
        }
        return allowedChildren;
    }
}
