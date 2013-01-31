package org.nsesa.editor.gwt.an.client.ui.amendment;

import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;

import java.util.List;

/**
 * Date: 31/01/13 11:48
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
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

    private static String getOriginalContent(final AmendableWidget amendableWidget) {
        if (amendableWidget == null) throw new NullPointerException("No Amendable Widget passed!");
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        return quotedStructures.get(0).getInnerHTML();
    }

    public static void setOriginalContentOnViews(final AmendmentController amendmentController, final String originalContent) {
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent);
    }

    public static void setOriginalContentOnModel(final AmendmentController amendmentController, final String originalContent) {
        setOriginalContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
    }

    private static void setOriginalContent(final AmendableWidget amendableWidget, final String originalContent) {
        if (amendableWidget == null) throw new NullPointerException("No Amendable Widget passed!");
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        quotedStructures.get(0).setInnerHTML(originalContent);
    }

    public static void setOriginalNumOnViews(final AmendmentController amendmentController, final String originalContent) {
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent);
    }

    public static void setOriginalNumOnModel(final AmendmentController amendmentController, final String originalContent) {
        setOriginalNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
    }

    private static void setOriginalNum(final AmendableWidget amendableWidget, final String num) {
        if (amendableWidget == null) throw new NullPointerException("No Amendable Widget passed!");
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(1));
        if (nums.size() > 0) nums.get(0).setInnerHTML(num);
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

    private static String getOriginalNum(final AmendableWidget amendableWidget) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(0));
        return (nums.size() > 0) ? nums.get(0).getInnerHTML() : null;
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

    private static String getAmendmentContent(final AmendableWidget amendableWidget) {
        if (amendableWidget == null) throw new NullPointerException("No Amendable Widget passed!");
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        return quotedStructures.get(1).getInnerHTML();
    }

    public static void setAmendmentContentOnViews(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent);
    }

    public static void setAmendmentContentOnModel(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentContent(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
    }

    private static void setAmendmentContent(final AmendableWidget amendableWidget, final String originalContent) {
        if (amendableWidget == null) throw new NullPointerException("No Amendable Widget passed!");
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        quotedStructures.get(1).setInnerHTML(originalContent);
    }

    public static void setAmendmentNumOnViews(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getExtendedView().getBody()), originalContent);
    }

    public static void setAmendmentNumOnModel(final AmendmentController amendmentController, final String originalContent) {
        setAmendmentNum(amendmentController.asAmendableWidget(amendmentController.getView().getBody()), originalContent);
    }

    private static void setAmendmentNum(final AmendableWidget amendableWidget, final String num) {
        if (amendableWidget == null) throw new NullPointerException("No Amendable Widget passed!");
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(1));
        if (nums.size() > 0) nums.get(0).setInnerHTML(num);
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

    private static String getAmendmentNum(final AmendableWidget amendableWidget) {
        if (amendableWidget == null) throw new NullPointerException("No Amendable Widget passed!");
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", amendableWidget);
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(1));
        return (nums.size() > 0) ? nums.get(0).getInnerHTML() : null;
    }
}
