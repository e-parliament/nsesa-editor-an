<#-- @ftlvariable name="overlayClasses" type="java.util.List<OverlayClass>" -->
<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
package ${overlayClass.packageName};

<#list overlayClass.imports as import>
import ${import}.*;
</#list>
import com.google.gwt.dom.client.Element;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;

/**
* This file is generated.
*/
public class ${overlayClass.name?cap_first} extends DefaultOverlayFactory {

@Inject
public ${overlayClass.name?cap_first}(final OverlayStrategy overlayStrategy) {
super(overlayStrategy);
}

public AmendableWidget toAmendableWidget(final Element element) {
if ("".equals(element.getTagName())) {
throw new IllegalArgumentException("Empty element or null passed.");
}

<#list overlayClasses as cl>
else if ("${cl.name}".equalsIgnoreCase(element.getTagName())) {
return new ${cl.name?cap_first}(element);
}
</#list>

// nothing found
return null;
}
}