package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen;

import com.google.inject.Inject;
import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayLocalizableResource;
import com.google.gwt.i18n.client.Messages;
import java.util.logging.Logger;
import java.util.Map;
/**
* Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayLocalizableResource.ftl</tt>.
*/
public class XmlschemaOverlayLocalizableResource extends DefaultOverlayLocalizableResource {
    private static XmlschemaOverlayMessages MESSAGES = GWT.create(XmlschemaOverlayMessages.class);

    @Override
    public String getName(final AmendableWidget widget) {
        if (widget == null) {
            throw new IllegalArgumentException("Null widget passed.");
        }
        else {
            return widget.getType();
        }
    }

    @Override
    public String getDescription(final AmendableWidget widget) {
        if (widget == null) {
            throw new IllegalArgumentException("Null widget passed.");
        }
        else {
            return widget.getType();
        }
    }

}