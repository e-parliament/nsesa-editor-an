package org.nsesa.editor.gwt.an.client.util;

import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;

import java.util.List;

/**
 * Date: 07/01/13 17:23
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AmendmentUtil {
    public static String getOriginalContent(AmendableWidget amendableWidget) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        return quotedStructures.get(0).getInnerHTML();
    }

    public static void setOriginalContent(AmendableWidget amendableWidget, final String originalContent) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        quotedStructures.get(0).setInnerHTML(originalContent);
    }

    public static String getAmendmendContent(AmendableWidget amendableWidget) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        return quotedStructures.get(1).getInnerHTML();
    }

    public static void setAmendmentContent(AmendableWidget amendableWidget, final String amendmentContent) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        quotedStructures.get(1).setInnerHTML(amendmentContent);
    }
}
