package org.nsesa.editor.gwt.an.client.handler.modify;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyView;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.author.AuthorPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.content.ContentPanelController;

import java.util.Arrays;

/**
 * Date: 23/11/12 10:14
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDialogModifyController extends AmendmentDialogModifyController {

    final AuthorPanelController authorPanelController;
    final ContentPanelController contentPanelController;

    @Inject
    public AkomaNtoso20AmendmentDialogModifyController(final ClientFactory clientFactory,
                                                       final AmendmentDialogModifyView view,
                                                       final Locator locator,
                                                       final OverlayFactory overlayFactory,
                                                       final AuthorPanelController authorPanelController,
                                                       final ContentPanelController contentPanelController
    ) {
        super(clientFactory, view, locator, overlayFactory, Arrays.asList(contentPanelController, authorPanelController));
        this.authorPanelController = authorPanelController;
        this.contentPanelController = contentPanelController;
    }

    @Override
    public void handleSave() {
        // TODO: just testing ...
        AmendableWidget root = as("amendment");

        // preface
        AmendableWidget p = as("p");
        p.setContent(clientFactory.getClientContext().getPrincipal());
        AmendableWidget container = as("container");
        container.addAmendableWidget(p);
        AmendableWidget preface = as("preface");
        preface.addAmendableWidget(container);
        root.addAmendableWidget(preface);

        // amendment body

        AmendableWidget amendmentBody = as("amendmentBody");
        root.addAmendableWidget(amendmentBody);

        AmendableWidget amendmentHeading = as("amendmentHeading");
        AmendableWidget amendedActBlock = as("block");
        amendedActBlock.setContent(locator.getLocation(amendableWidget, "EN", true));
        amendmentHeading.addAmendableWidget(amendedActBlock);
        amendmentBody.addAmendableWidget(amendmentHeading);

        // amendment content
        AmendableWidget amendmentContent = as("amendmentContent");
        amendmentBody.addAmendableWidget(amendmentContent);

        AmendableWidget blockCommission = as("block");
        blockCommission.setContent("Text proposed by the Commission");
        amendmentContent.addAmendableWidget(blockCommission);
        AmendableWidget blockAmendment = as("block");
        blockAmendment.setContent("Amendment");
        amendmentContent.addAmendableWidget(blockAmendment);

        AmendableWidget changeBlock = as("block");
        amendmentContent.addAmendableWidget(changeBlock);

        AmendableWidget mod = as("mod");
        changeBlock.addAmendableWidget(mod);

        AmendableWidget quotedStructureOriginal = as("quotedStructure");
        // NOTE: this should come from the original panel - just for demonstration
        Panel temp = new SimplePanel();
        temp.getElement().setInnerHTML(contentPanelController.getView().getOriginalText());
        NodeList<Node> childNodes = temp.getElement().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            final Node node = childNodes.getItem(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                final AmendableWidget overlayed = overlayFactory.getAmendableWidget(Element.as(node));
                quotedStructureOriginal.addAmendableWidget(overlayed);
            }
        }
        mod.addAmendableWidget(quotedStructureOriginal);

        AmendableWidget quotedStructureAmendment = as("quotedStructure");
        temp.getElement().setInnerHTML(view.getAmendmentContent());
        childNodes = temp.getElement().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            final Node node = childNodes.getItem(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                final AmendableWidget overlayed = overlayFactory.getAmendableWidget(Element.as(node));
                quotedStructureAmendment.addAmendableWidget(overlayed);
            }
        }
        mod.addAmendableWidget(quotedStructureAmendment);

        amendment.setRoot(root);

        super.handleSave();
    }

    private AmendableWidget as(final String tag) {
        return overlayFactory.getAmendableWidget(tag);
    }
}
