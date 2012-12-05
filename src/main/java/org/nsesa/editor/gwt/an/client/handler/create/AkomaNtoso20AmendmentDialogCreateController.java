package org.nsesa.editor.gwt.an.client.handler.create;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.amendment.AmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateView;

/**
 * Date: 05/12/12 14:36
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDialogCreateController extends AmendmentDialogCreateController {

    @Inject
    public AkomaNtoso20AmendmentDialogCreateController(final ClientFactory clientFactory,
                                                       final AmendmentDialogCreateView view,
                                                       final Locator locator,
                                                       final OverlayFactory overlayFactory,
                                                       final AmendmentInjectionPointFinder amendmentInjectionPointFinder
    ) {
        super(clientFactory, view, locator, overlayFactory, amendmentInjectionPointFinder);
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

        // empty block
        mod.addQuotedStructure(new QuotedStructure()).text("");

        // amendment content
        final QuotedStructure quotedStructureAmendment = mod.addQuotedStructure(new QuotedStructure());
        amendableWidget.getAmendableElement().setInnerHTML(view.getAmendmentContent());
        final AmendableWidget overlayed = overlayFactory.getAmendableWidget(amendableWidget.getAmendableElement());
        quotedStructureAmendment.addAmendableWidget(overlayed);

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
