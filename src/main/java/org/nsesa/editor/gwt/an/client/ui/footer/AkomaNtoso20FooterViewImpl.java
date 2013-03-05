package org.nsesa.editor.gwt.an.client.ui.footer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.editor.client.ui.footer.FooterView;

/**
 * Date: 04/03/13 17:40
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20FooterViewImpl extends Composite implements FooterView {
    interface MyUiBinder extends UiBinder<Widget, AkomaNtoso20FooterViewImpl> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @Inject
    public AkomaNtoso20FooterViewImpl() {
        final Widget widget = uiBinder.createAndBindUi(this);
        initWidget(widget);
    }
}
