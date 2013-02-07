package org.nsesa.editor.gwt.an.client.handler.modify;

import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.client.DOM;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.drafting.DraftingController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.author.AuthorPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.meta.MetaPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyView;

import java.util.Date;
import java.util.logging.Logger;

import static org.nsesa.editor.gwt.an.client.ui.overlay.document.AkomaNtoso20XMLUtil.*;

/**
 * Date: 23/11/12 10:14
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDialogModifyController extends AmendmentDialogModifyController {

    private static final Logger LOG = Logger.getLogger(AkomaNtoso20AmendmentDialogModifyController.class.getName());

    final AuthorPanelController authorPanelController;
    final MetaPanelController metaPanelController;
    final ContentPanelController contentPanelController;

    @Inject
    public AkomaNtoso20AmendmentDialogModifyController(final ClientFactory clientFactory,
                                                       final AmendmentDialogModifyView view,
                                                       final Locator locator,
                                                       final OverlayFactory overlayFactory,
                                                       final DraftingController draftingController,
                                                       final AuthorPanelController authorPanelController,
                                                       final ContentPanelController contentPanelController,
                                                       final MetaPanelController metaPanelController
    ) {
        super(clientFactory, view, locator, overlayFactory, draftingController);
        this.authorPanelController = authorPanelController;
        this.contentPanelController = contentPanelController;
        this.metaPanelController = metaPanelController;

        addChildControllers(contentPanelController, authorPanelController, metaPanelController);
    }

    @Override
    public void handleSave() {
        AmendableWidget amendableWidget = dialogContext.getAmendableWidget();

        final String languageIso = dialogContext.getDocumentController().getDocument().getLanguageIso();

        final AkomaNtoso akomaNtoso = new AkomaNtoso();
        final Amendment root = akomaNtoso.setAmendment(new Amendment());

        // meta
        final Identification identification = new Identification();
        final String formattedDate = DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.ISO_8601).format(new Date());
        identification.setFRBRWork(new FRBRWork() {
            {
                setFRBRthis((FRBRthis) new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri((FRBRuri) new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                setFRBRcountry((FRBRcountry) new FRBRcountry().valueAttr(s("TODO")));
            }
        });

        identification.setFRBRExpression(new FRBRExpression() {
            {
                setFRBRthis((FRBRthis) new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri((FRBRuri) new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                addFRBRlanguage(new FRBRlanguage().languageAttr(l(languageIso)));
            }
        });

        identification.setFRBRManifestation(new FRBRManifestation() {
            {
                setFRBRthis((FRBRthis) new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri((FRBRuri) new FRBRuri().valueAttr(s("TODO")));
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
                .addBlock(new Block()).html(locator.getLocation(amendableWidget, null, languageIso, true));

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

        // original content
        final QuotedStructure quotedStructureOriginal = mod.addQuotedStructure(new QuotedStructure());

        final String originalText = contentPanelController.getView().getOriginalText();
        final com.google.gwt.user.client.Element cloneOriginal = DOM.clone(amendableWidget.asWidget().getElement(), false);
        cloneOriginal.setInnerHTML(originalText);
        final AmendableWidget overlayedOriginal = overlayFactory.getAmendableWidget(cloneOriginal);
        quotedStructureOriginal.addAmendableWidget(overlayedOriginal);

        // amendment content
        final QuotedStructure quotedStructureAmendment = mod.addQuotedStructure(new QuotedStructure());
        final String amendmentText = view.getAmendmentContent();
        final com.google.gwt.user.client.Element clone = DOM.clone(amendableWidget.asWidget().getElement(), false);
        clone.setInnerHTML(amendmentText);
        final AmendableWidget overlayed = overlayFactory.getAmendableWidget(clone);
        quotedStructureAmendment.addAmendableWidget(overlayed);

        akomaNtoso.addAmendableWidget(root);
        dialogContext.getAmendment().setRoot(akomaNtoso);

        super.handleSave();
    }

    private <T extends AmendableWidget> T a(final String tag) {
        return (T) overlayFactory.getAmendableWidget(tag);
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
            view.setAmendmentContent(dialogContext.getAmendableWidget().getInnerHTML());
        }
    }
}
