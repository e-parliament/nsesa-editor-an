package org.nsesa.editor.gwt.an.client.handler.create;

import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.amendment.AmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.core.client.ui.drafting.DraftingController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.AmendmentDialogAwareController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.create.AmendmentDialogCreateView;

import java.util.ArrayList;

import static org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20XMLUtil.*;

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
                                                       final DraftingController draftingController,
                                                       final AmendmentInjectionPointFinder amendmentInjectionPointFinder
    ) {
        super(clientFactory, view, locator, overlayFactory, draftingController, amendmentInjectionPointFinder, new ArrayList<AmendmentDialogAwareController>());
    }

    @Override
    public void handleSave() {

        final String languageIso = dialogContext.getDocumentController().getDocument().getLanguageIso();

        final AmendableWidget parentAmendableWidget = dialogContext.getParentAmendableWidget();
        final AmendableWidget amendableWidget = dialogContext.getAmendableWidget();

        final AkomaNtoso akomaNtoso = new AkomaNtoso();
        final Amendment root = akomaNtoso.setAmendment(new Amendment());

        // meta
        final Identification identification = new Identification();
        final String formattedDate = DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.ISO_8601).format(new java.util.Date());
        identification.setFRBRWork(new FRBRWork() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri( new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                setFRBRcountry(new FRBRcountry().valueAttr(s("TODO")));
            }
        });

        identification.setFRBRExpression(new FRBRExpression() {
            {
                setFRBRthis( new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                addFRBRlanguage(new FRBRlanguage().languageAttr(l(languageIso)));
            }
        });

        identification.setFRBRManifestation(new FRBRManifestation() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
            }
        });

        root.setMeta(new Meta()).setIdentification(identification);

        // preface
        root.setPreface(new Preface())
                .addContainer(new Container())
                .addP(new P()).html(clientFactory.getClientContext().getPrincipal());

        // amendment body
        final AmendmentBody amendmentBody = root.setAmendmentBody(new AmendmentBody());

        amendmentBody
                .addAmendmentHeading(new AmendmentHeading())
                .addBlock(new Block()).html(locator.getLocation(parentAmendableWidget, amendableWidget, languageIso, true));

        // amendment content
        final AmendmentContent amendmentContent = amendmentBody
                .addAmendmentContent(new AmendmentContent());

        amendmentContent
                .addBlock(new Block()).nameAttr(s("versionTitle")).html("Text proposed by ...");
        amendmentContent
                .addBlock(new Block()).nameAttr(s("versionTitle")).html("Amendment");

        final Mod mod = amendmentContent
                .addBlock(new Block()).nameAttr(s("changeBlock"))
                .addMod(new Mod());

        // empty block
        mod.addQuotedStructure(new QuotedStructure()).html("");

        // amendment content
        final QuotedStructure quotedStructureAmendment = mod.addQuotedStructure(new QuotedStructure());
        final Element clone = DOM.clone(amendableWidget.asWidget().getElement(), false);
        clone.setInnerHTML(view.getAmendmentContent());
        final AmendableWidget overlayed = overlayFactory.getAmendableWidget(clone);
        quotedStructureAmendment.addAmendableWidget(overlayed);

        akomaNtoso.addAmendableWidget(root);
        dialogContext.getAmendment().setRoot(akomaNtoso);

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

    @Override
    public void setContext(DialogContext dialogContext) {
        super.setContext(dialogContext);
        view.resetBodyClass();
        view.addBodyClass(dialogContext.getAmendableWidget().getAmendableElement().getClassName());

        if (dialogContext.getAmendmentController() != null) {
            // get the location from the amendable widget, if it is passed
            view.setTitle("Edit amendment");
            final java.util.List<AmendableWidget> quotedStructures = OverlayUtil.find("quotedStructure", dialogContext.getAmendmentController().asAmendableWidget(dialogContext.getAmendmentController().getModel().getBody()));
            view.setAmendmentContent(quotedStructures.get(1).getAmendableElement().getFirstChildElement().getInnerHTML());
        } else {
            view.setTitle(locator.getLocation(dialogContext.getAmendableWidget(), clientFactory.getClientContext().getDocumentIso(), false));
            view.setAmendmentContent("");
        }
    }
}
