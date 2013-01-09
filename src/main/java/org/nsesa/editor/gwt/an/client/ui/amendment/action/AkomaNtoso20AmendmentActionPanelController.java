package org.nsesa.editor.gwt.an.client.ui.amendment.action;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.amendment.action.AmendmentActionPanelController;
import org.nsesa.editor.gwt.core.client.ui.amendment.action.AmendmentActionPanelView;

/**
 * Date: 09/01/13 15:49
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentActionPanelController extends AmendmentActionPanelController {
    @Inject
    public AkomaNtoso20AmendmentActionPanelController(ClientFactory clientFactory, AmendmentActionPanelView amendmentActionPanelView) {
        super(clientFactory, amendmentActionPanelView);
        addSeparator();
        addSeparator();
    }
}
