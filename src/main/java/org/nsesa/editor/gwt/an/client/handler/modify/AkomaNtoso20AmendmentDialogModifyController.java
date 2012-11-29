package org.nsesa.editor.gwt.an.client.handler.modify;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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

        final Amendment root = new AkomaNtoso().setAmendment(new Amendment());

        // preface
        root.setPreface(new Preface())
                .addContainer(new Container())
                        .addP(new P()).text(clientFactory.getClientContext().getPrincipal());

        // amendment body
        final AmendmentBody amendmentBody = root.setAmendmentBody(new AmendmentBody());

        amendmentBody
                .addAmendmentHeading(new AmendmentHeading())
                    .addBlock(new Block()).text(locator.getLocation(amendableWidget, "EN", true));

        // amendment content
        final AmendmentContent amendmentContent = amendmentBody
                .addAmendmentContent(new AmendmentContent());

        amendmentContent
                .addBlock(new Block()).nameAttr(s("versionTitle")).text("Text proposed by the Commission");
        amendmentContent
                .addBlock(new Block()).nameAttr(s("versionTitle")).text("Amendment");

        final Mod mod = amendmentContent
                .addBlock(new Block()).nameAttr(s("changeBlock"))
                    .addMod(new Mod());

        // original content
        final QuotedStructure quotedStructureOriginal = mod.addQuotedStructure(new QuotedStructure());
        final Panel temp = new SimplePanel();
        temp.getElement().setInnerHTML(contentPanelController.getView().getOriginalText());
        NodeList<Node> childNodes = temp.getElement().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            final Node node = childNodes.getItem(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                final AmendableWidget overlayed = overlayFactory.getAmendableWidget(Element.as(node));
                quotedStructureOriginal.addAmendableWidget(overlayed);
            }
        }

        // amendment content
        final QuotedStructure quotedStructureAmendment = mod.addQuotedStructure(new QuotedStructure());
        temp.getElement().setInnerHTML(view.getAmendmentContent());
        childNodes = temp.getElement().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            final Node node = childNodes.getItem(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                final AmendableWidget overlayed = overlayFactory.getAmendableWidget(Element.as(node));
                quotedStructureAmendment.addAmendableWidget(overlayed);
            }
        }

        amendment.setRoot(root);

        super.handleSave();
    }

    private <T extends AmendableWidget> T a(final String tag) {
        return (T) overlayFactory.getAmendableWidget(tag);
    }

    private StringSimpleType s(final String text) {
        StringSimpleType s = new StringSimpleType();
        s.setValue(text);
        return s;
    }
}
