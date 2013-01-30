package org.nsesa.editor.gwt.an.client.ui.amendment;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentView;
import org.nsesa.editor.gwt.core.client.ui.amendment.DefaultAmendmentController;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;

import java.util.List;

/**
 * Date: 09/01/13 16:38
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentController extends DefaultAmendmentController {

    @Inject
    public AkomaNtoso20AmendmentController(ClientFactory clientFactory, AmendmentView amendmentView, AmendmentView amendmentExtendedView) {
        super(clientFactory, amendmentView, amendmentExtendedView);
    }

    @Override
    public String getOriginalContent() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidget());
        return quotedStructures.get(0).getInnerHTML();
    }

    @Override
    public String getOriginalContentFromModel() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidgetFromModel());
        return quotedStructures.get(0).getInnerHTML();
    }

    @Override
    public void setOriginalContent(final String originalContent) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidget());
        quotedStructures.get(0).setInnerHTML(originalContent);
    }

    @Override
    public String getAmendmentContent() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidget());
        return quotedStructures.get(1).getInnerHTML();
    }

    @Override
    public String getAmendmentContentFromModel() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidgetFromModel());
        return quotedStructures.get(1).getInnerHTML();
    }

    @Override
    public void setAmendmentContent(final String amendmentContent) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidget());
        quotedStructures.get(1).setInnerHTML(amendmentContent);
    }

    @Override
    public void setAmendmentNum(String num) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidget());
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(1));
        if (nums.size() > 0) nums.get(0).setInnerHTML(num);
    }

    @Override
    public void setOriginalNum(String num) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidget());
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(0));
        if (nums.size() > 0) nums.get(0).setInnerHTML(num);
    }

    @Override
    public String getAmendmentNum() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidget());
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(1));
        return nums.size() > 0 ? nums.get(0).getInnerHTML().trim() : null;
    }

    @Override
    public String getAmendmentNumFromModel() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidgetFromModel());
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(1));
        return nums.size() > 0 ? nums.get(0).getInnerHTML().trim() : null;
    }

    @Override
    public String getOriginalNum() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidget());
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(0));
        return nums.size() > 0 ? nums.get(0).getInnerHTML().trim() : null;
    }

    @Override
    public String getOriginalNumFromModel() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", asAmendableWidgetFromModel());
        final List<AmendableWidget> nums = OverlayUtil.find("num", quotedStructures.get(0));
        return nums.size() > 0 ? nums.get(0).getInnerHTML().trim() : null;
    }

}
