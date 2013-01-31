package org.nsesa.editor.gwt.an.client.ui.amendment;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ui.amendment.AmendmentView;
import org.nsesa.editor.gwt.core.client.ui.amendment.DefaultAmendmentController;

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

}
