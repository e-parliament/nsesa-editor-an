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

    public static String getOriginalContentFromView(final AmendmentController amendmentController) {
        return getOriginalContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()));
    }

    public static String getOriginalContentFromExtendedView(final AmendmentController amendmentController) {
        return getOriginalContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()));
    }

    public static String getOriginalContentFromModel(final AmendmentController amendmentController) {
        return getOriginalContent(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()));
    }

    private static String getOriginalContent(final OverlayWidget overlayWidget) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[0]", overlayWidget);
        return quotedStructure.getInnerHTML();
    }

    public static void setOriginalContentOnViews(final AmendmentController amendmentController, final String originalContent) {
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent);
    }

    public static void setOriginalContentOnModel(final AmendmentController amendmentController, final String originalContent) {
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
    }

    private static void setOriginalContent(final OverlayWidget overlayWidget, final String originalContent) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[0]", overlayWidget);
        quotedStructure.setInnerHTML(originalContent);
    }

    public static void setOriginalNumOnViews(final AmendmentController amendmentController, final String originalContent) {
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent);
    }

    public static void setOriginalNumOnModel(final AmendmentController amendmentController, final String originalContent) {
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
    }

    private static void setOriginalNum(final OverlayWidget overlayWidget, final String num) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[0]", overlayWidget);
        final OverlayWidget numOverlayWidget = OverlayUtil.findSingle("num", quotedStructure);
        if (numOverlayWidget != null) numOverlayWidget.setInnerHTML(num);
    }

    public static String getOriginalNumFromView(final AmendmentController amendmentController) {
        return getOriginalNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()));
    }

    public static String getOriginalNumFromExtendedView(final AmendmentController amendmentController) {
        return getOriginalNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()));
    }

    public static String getOriginalNumFromModel(final AmendmentController amendmentController) {
        return getOriginalNum(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()));
    }

    private static String getOriginalNum(final OverlayWidget overlayWidget) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[0]", overlayWidget);
        final OverlayWidget numOverlayWidget = OverlayUtil.findSingle("num", quotedStructure);
        return numOverlayWidget != null ? numOverlayWidget.getInnerHTML() : null;
    }


    public static String getAmendmentContentFromView(final AmendmentController amendmentController) {
        return getAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()));
    }

    public static String getAmendmentContentFromExtendedView(final AmendmentController amendmentController) {
        return getAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()));
    }

    public static String getAmendmentContentFromModel(final AmendmentController amendmentController) {
        return getAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()));
    }

    private static String getAmendmentContent(final OverlayWidget overlayWidget) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[1]", overlayWidget);
        return quotedStructure != null ? quotedStructure.getInnerHTML() : null;
    }

    public static void setAmendmentContentOnViews(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent);
    }

    public static void setAmendmentContentOnModel(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
    }

    private static void setAmendmentContent(final OverlayWidget overlayWidget, final String originalContent) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[1]", overlayWidget);
        if (quotedStructure != null) quotedStructure.setInnerHTML(originalContent);
    }

    public static void setAmendmentNumOnViews(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent);
    }

    public static void setAmendmentNumOnModel(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
    }

    private static void setAmendmentNum(final OverlayWidget overlayWidget, final String num) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[1]", overlayWidget);
        final OverlayWidget numOverlayWidget = OverlayUtil.findSingle("num", quotedStructure);
        if (numOverlayWidget != null) numOverlayWidget.setInnerHTML(num);
    }


    public static String getAmendmentNumFromView(final AmendmentController amendmentController) {
        return getAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()));
    }

    public static String getAmendmentNumFromExtendedView(final AmendmentController amendmentController) {
        return getAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()));
    }

    public static String getAmendmentNumFromModel(final AmendmentController amendmentController) {
        return getAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getModel().getBody()));
    }

    private static String getAmendmentNum(final OverlayWidget overlayWidget) {
        if (overlayWidget == null) throw new NullPointerException("Overlay widget cannot be null.");
        final OverlayWidget quotedStructure = OverlayUtil.xpathSingle("//akomaNtoso[0]/amendment[0]/amendmentBody[0]/amendmentContent[0]/block[2]/mod[0]/quotedStructure[1]", overlayWidget);
        final OverlayWidget num = OverlayUtil.findSingle("num", quotedStructure);
        return num != null ? num.getInnerHTML() : null;
    }
}
