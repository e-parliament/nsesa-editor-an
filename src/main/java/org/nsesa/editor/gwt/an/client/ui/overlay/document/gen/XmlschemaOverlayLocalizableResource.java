package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen;

import com.google.inject.Inject;
import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayLocalizableResource;
import com.google.gwt.i18n.client.Messages;
import java.util.logging.Logger;
import java.util.Map;
/**
* An implementation of <code>OverlayLocalizableResource</code> interface by getting the localizable information
* from GWT properties files.
* Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayLocalizableResource.ftl</tt>.
*/
public class XmlschemaOverlayLocalizableResource extends DefaultOverlayLocalizableResource {
private static XmlschemaOverlayMessages MESSAGES = GWT.create(XmlschemaOverlayMessages.class);

@Override
public String getName(final OverlayWidget widget) {
if (widget == null) {
throw new IllegalArgumentException("Null widget passed.");
}
else {
return widget.getType();
}
}

@Override
public String getDescription(final OverlayWidget widget) {
if (widget == null) {
throw new IllegalArgumentException("Null widget passed.");
}
else {
return widget.getType();
}
}

}