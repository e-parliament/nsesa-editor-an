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
package org.nsesa.editor.gwt.an.amendments.client.ui.amendment;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;

/**
 * Date: 31/01/13 11:48
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentControllerUtil {

    @Inject
    @Named("default.pathToOriginalContent")
    public static String XPATH_DEFAULT_ORIGINAL;
    @Inject
    @Named("default.pathToAmendmentContent")
    public static String XPATH_DEFAULT_AMENDMENT;


    public static String getOriginalContentFromView(final AmendmentController amendmentController) {
        return getOriginalContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), amendmentController.getView().getPathToOriginalContent());
    }

    public static String getOriginalContentFromExtendedView(final AmendmentController amendmentController) {
        return getOriginalContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), amendmentController.getExtendedView().getPathToOriginalContent());
    }

    public static String getOriginalContentFromModel(final AmendmentController amendmentController) {
        return getOriginalContent(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()), XPATH_DEFAULT_ORIGINAL);
    }

    private static String getOriginalContent(final OverlayWidget overlayWidget, String path) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        if (path == null) return null;
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle(path, overlayWidget);
        return quotedStructure != null ? quotedStructure.getInnerHTML() : null;
    }

    public static void setOriginalContentOnViews(final AmendmentController amendmentController, final String originalContent) {
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent, amendmentController.getView().getPathToOriginalContent());
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent, amendmentController.getExtendedView().getPathToOriginalContent());
    }

    public static void setOriginalContentOnModel(final AmendmentController amendmentController, final String originalContent) {
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent, XPATH_DEFAULT_ORIGINAL);
    }

    private static void setOriginalContent(final OverlayWidget overlayWidget, final String originalContent, final String path) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        if (path == null) return;
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle(path, overlayWidget);
        if (quotedStructure != null)
            quotedStructure.setInnerHTML(originalContent);
    }

    public static void setOriginalNumOnViews(final AmendmentController amendmentController, final String originalContent) {
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent, amendmentController.getView().getPathToOriginalContent());
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent, amendmentController.getExtendedView().getPathToOriginalContent());
    }

    public static void setOriginalNumOnModel(final AmendmentController amendmentController, final String originalContent) {
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent, XPATH_DEFAULT_ORIGINAL);
    }

    private static void setOriginalNum(final OverlayWidget overlayWidget, final String num, final String path) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        if (path == null) return;
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle(path, overlayWidget);
        final OverlayWidget numOverlayWidget = OverlayUtil.findSingle("num", quotedStructure);
        if (numOverlayWidget != null) numOverlayWidget.setInnerHTML(num);
    }

    public static String getOriginalNumFromView(final AmendmentController amendmentController) {
        return getOriginalNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), amendmentController.getView().getPathToOriginalContent());
    }

    public static String getOriginalNumFromExtendedView(final AmendmentController amendmentController) {
        return getOriginalNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), amendmentController.getExtendedView().getPathToOriginalContent());
    }

    public static String getOriginalNumFromModel(final AmendmentController amendmentController) {
        return getOriginalNum(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()), XPATH_DEFAULT_ORIGINAL);
    }

    private static String getOriginalNum(final OverlayWidget overlayWidget, final String path) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        if (path == null) return null;
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle(path, overlayWidget);
        final OverlayWidget numOverlayWidget = OverlayUtil.findSingle("num", quotedStructure);
        return numOverlayWidget != null ? numOverlayWidget.getInnerHTML() : null;
    }


    public static String getAmendmentContentFromView(final AmendmentController amendmentController) {
        return getAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), amendmentController.getView().getPathToOriginalContent());
    }

    public static String getAmendmentContentFromExtendedView(final AmendmentController amendmentController) {
        return getAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), amendmentController.getExtendedView().getPathToOriginalContent());
    }

    public static String getAmendmentContentFromModel(final AmendmentController amendmentController) {
        return getAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()), XPATH_DEFAULT_AMENDMENT);
    }

    private static String getAmendmentContent(final OverlayWidget overlayWidget, final String path) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        if (path == null) return null;
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle(path, overlayWidget);
        return quotedStructure != null ? quotedStructure.getInnerHTML() : null;
    }

    public static void setAmendmentContentOnViews(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent, amendmentController.getView().getPathToAmendmentContent());
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent, amendmentController.getExtendedView().getPathToAmendmentContent());
    }

    public static void setAmendmentContentOnModel(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent, XPATH_DEFAULT_AMENDMENT);
    }

    private static void setAmendmentContent(final OverlayWidget overlayWidget, final String originalContent, final String path) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        if (path == null) return;
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle(path, overlayWidget);
        if (quotedStructure != null) quotedStructure.setInnerHTML(originalContent);
    }

    public static void setAmendmentNumOnViews(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent, amendmentController.getView().getPathToAmendmentContent());
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent, amendmentController.getExtendedView().getPathToAmendmentContent());
    }

    public static void setAmendmentNumOnModel(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent, XPATH_DEFAULT_AMENDMENT);
    }

    private static void setAmendmentNum(final OverlayWidget overlayWidget, final String num, final String path) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        if (path == null) return;
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle(path, overlayWidget);
        final OverlayWidget numOverlayWidget = OverlayUtil.findSingle("num", quotedStructure);
        if (numOverlayWidget != null) numOverlayWidget.setInnerHTML(num);
    }


    public static String getAmendmentNumFromView(final AmendmentController amendmentController) {
        return getAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), amendmentController.getView().getPathToAmendmentContent());
    }

    public static String getAmendmentNumFromExtendedView(final AmendmentController amendmentController) {
        return getAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), amendmentController.getExtendedView().getPathToAmendmentContent());
    }

    public static String getAmendmentNumFromModel(final AmendmentController amendmentController) {
        return getAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()), XPATH_DEFAULT_AMENDMENT);
    }

    private static String getAmendmentNum(final OverlayWidget overlayWidget, final String path) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        if (path == null) return null;
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle(path, overlayWidget);
        final OverlayWidget num = OverlayUtil.findSingle("num", quotedStructure);
        return num != null ? num.getInnerHTML() : null;
    }
}
