package org.nsesa.editor.gwt.an.common.client.ui.overlay.document;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BlocksoptComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Li;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

/**
 * Created by Philip Luppens on 12/04/14 19:51.
 * TODO Complete this class documentation.
 */
public class AkomaNtosoUtil {
    public static boolean representsBlock(final OverlayWidget overlayWidget) {
        return overlayWidget instanceof BasehierarchyComplexType
                || overlayWidget instanceof BlocksoptComplexType
                || overlayWidget instanceof Li
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Li
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BlocksoptComplexType
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.BasehierarchyComplexType
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.Li
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.BlocksoptComplexType;
    }
}
