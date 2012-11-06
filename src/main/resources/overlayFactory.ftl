<#-- @ftlvariable name="overlayClasses" type="java.util.List<OverlayClass>" -->
<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
package ${packageNameGenerator.getPackageName(overlayClass)};

<#list overlayClasses as cl>
import ${packageNameGenerator.getPackageName(cl)}.${cl.className?cap_first};
</#list>
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import com.google.gwt.dom.client.Element;

/**
* This file is generated.
*/
public class ${overlayClass.name?cap_first} extends DefaultOverlayFactory  {

    @Inject
    public ${overlayClass.name?cap_first}(final OverlayStrategy overlayStrategy) {
        super(overlayStrategy);
    }

    public AmendableWidget toAmendableWidget(final Element element) {
        if ("".equals(element.getNodeName())) {
            throw new IllegalArgumentException("Empty element or null passed.");
        }

        <#list overlayClasses as cl>
        else if ("${cl.name}".equalsIgnoreCase(element.getNodeName())) {
            return new ${cl.className?cap_first}(element);
        }
        </#list>

        // nothing found
        return null;
    }
}