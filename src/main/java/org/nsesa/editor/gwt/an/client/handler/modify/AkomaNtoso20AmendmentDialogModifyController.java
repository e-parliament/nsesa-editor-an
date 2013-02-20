/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.handler.modify;

import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.user.client.DOM;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.amendment.OverlayWidgetWalker;
import org.nsesa.editor.gwt.core.client.ui.drafting.DraftingController;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
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
        OverlayWidget overlayWidget = dialogContext.getOverlayWidget();

        final String languageIso = dialogContext.getDocumentController().getDocument().getLanguageIso();

        final AkomaNtoso akomaNtoso = new AkomaNtoso();
        final Amendment root = akomaNtoso.setAmendment(new Amendment());

        // meta
        final Identification identification = new Identification();
        final String formattedDate = DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.ISO_8601).format(new Date());
        identification.setFRBRWork(new FRBRWork() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
                addFRBRuri(new FRBRuri().valueAttr(s("TODO")));
                addFRBRdate(new FRBRdate().dateAttr(d(formattedDate)));
                addFRBRauthor(new FRBRauthor().hrefAttr(u("#refTodo")));
                setFRBRcountry(new FRBRcountry().valueAttr(s("TODO")));
            }
        });

        identification.setFRBRExpression(new FRBRExpression() {
            {
                setFRBRthis(new FRBRthis().valueAttr(s("TODO")));
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
                .addP(new P()).html(clientFactory.getClientContext().getLoggedInPerson().getUsername());

        // amendment body
        final AmendmentBody amendmentBody = root.setAmendmentBody(new AmendmentBody());

        amendmentBody
                .addAmendmentHeading(new AmendmentHeading())
                .addBlock(new Block()).html(locator.getLocation(overlayWidget, null, languageIso, true));

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
        final com.google.gwt.user.client.Element cloneOriginal = DOM.clone(overlayWidget.asWidget().getElement(), false);
        cloneOriginal.setInnerHTML(originalText);
        final OverlayWidget overlayedOriginal = overlayFactory.getAmendableWidget(cloneOriginal);
        quotedStructureOriginal.addOverlayWidget(overlayedOriginal);

        // amendment content
        final QuotedStructure quotedStructureAmendment = mod.addQuotedStructure(new QuotedStructure());
        final String amendmentText = view.getAmendmentContent();
        final com.google.gwt.user.client.Element clone = DOM.clone(overlayWidget.asWidget().getElement(), false);
        clone.setInnerHTML(amendmentText);
        final OverlayWidget overlayed = overlayFactory.getAmendableWidget(clone);
        modifyIdsIfNeeded(overlayed);
        quotedStructureAmendment.addOverlayWidget(overlayed);

        akomaNtoso.addOverlayWidget(root);
        dialogContext.getAmendment().setRoot(akomaNtoso);

        super.handleSave();
    }

    public void modifyIdsIfNeeded(final OverlayWidget root) {
        // we only need to modify the ids if we're a new amendment (not editing an existing one)
        if (dialogContext.getAmendmentController() == null) {
            // now we need to make sure that the new structure has new ids assigned
            root.walk(new OverlayWidgetWalker.OverlayWidgetVisitor() {
                @Override
                public boolean visit(OverlayWidget visited) {
                    if (visited.getOverlayElement().getId() != null && !"".equals(visited.getOverlayElement().getId().trim())) {
                        visited.getOverlayElement().setId(visited.getOverlayElement().getId() + "-mod");
                    }
                    return true;
                }
            });
        }
    }

    private <T extends OverlayWidget> T a(final String tag) {
        return (T) overlayFactory.getAmendableWidget(tag);
    }

    @Override
    public void setContext(DialogContext dialogContext) {
        super.setContext(dialogContext);

        view.resetBodyClass();
        view.addBodyClass(dialogContext.getOverlayWidget().getOverlayElement().getClassName());

        if (dialogContext.getAmendmentController() != null) {
            // get the location from the amendable widget, if it is passed
            view.setTitle("Edit amendment");
            final java.util.List<OverlayWidget> quotedStructures = OverlayUtil.find("quotedStructure", dialogContext.getAmendmentController().asAmendableWidget(dialogContext.getAmendmentController().getModel().getBody()));
            view.setAmendmentContent(quotedStructures.get(1).getOverlayElement().getFirstChildElement().getInnerHTML());
        } else {
            view.setTitle(locator.getLocation(dialogContext.getOverlayWidget(), clientFactory.getClientContext().getDocumentIso(), false));
            view.setAmendmentContent(dialogContext.getOverlayWidget().getInnerHTML());
        }
    }
}
