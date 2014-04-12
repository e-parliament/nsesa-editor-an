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
                || overlayWidget instanceof Li
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BasehierarchyComplexType
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.Li
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.BasehierarchyComplexType
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.Li;
    }

    public static boolean representsContainer(final OverlayWidget overlayWidget) {
        return overlayWidget instanceof BlocksoptComplexType
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.BlocksoptComplexType
                || overlayWidget instanceof org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05.BlocksoptComplexType;
    }
}
