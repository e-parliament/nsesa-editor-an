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
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", overlay());
        return quotedStructures.get(0).getInnerHTML();
    }

    @Override
    public void setOriginalContent(final String originalContent) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", overlay());
        quotedStructures.get(0).setInnerHTML(originalContent);
    }

    @Override
    public String getAmendmentContent() {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", overlay());
        return quotedStructures.get(1).getInnerHTML();
    }

    @Override
    public void setAmendmentContent(final String amendmentContent) {
        final List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", overlay());
        quotedStructures.get(1).setInnerHTML(amendmentContent);
    }

    protected AmendableWidget overlay() {
        if (overlayAmendableWidget == null) {
            overlayAmendableWidget = documentController.getOverlayFactory().getAmendableWidget(view.getBody().getFirstChildElement());
        }
        return overlayAmendableWidget;
    }
}
