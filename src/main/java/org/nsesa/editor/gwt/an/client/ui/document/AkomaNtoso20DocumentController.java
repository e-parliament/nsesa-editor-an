package org.nsesa.editor.gwt.an.client.ui.document;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.an.client.AkomaNtoso20DocumentInjector;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.diffing.DiffingManager;
import org.nsesa.editor.gwt.core.client.ui.overlay.Creator;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.editor.client.ui.document.DocumentController;
import org.nsesa.editor.gwt.editor.client.ui.document.DocumentInjector;
import org.nsesa.editor.gwt.inline.client.ui.inline.InlineEditorController;

/**
 * Date: 10/01/13 11:23
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20DocumentController extends DocumentController {

    @Inject
    public AkomaNtoso20DocumentController(ClientFactory clientFactory, ServiceFactory serviceFactory, OverlayFactory overlayFactory, DiffingManager diffingManager, Locator locator, Creator creator, InlineEditorController inlineEditorController) {
        super(clientFactory, serviceFactory, overlayFactory, diffingManager, locator, creator, inlineEditorController);
    }

    @Override
    public DocumentInjector getInjector() {
        return GWT.create(AkomaNtoso20DocumentInjector.class);
    }
}
