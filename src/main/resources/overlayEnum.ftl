<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
package ${packageNameGenerator.getPackageName(overlayClass)};

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum ${overlayClass.name?cap_first} {

// FIELDS ------------------

<#list overlayClass.restriction.enumeration as enum>
    ${enum?upper_case}("${enum}")<#if enum_has_next>,</#if>
</#list>;
private final String value;

${overlayClass.className?cap_first}(String v) {
    value = v;
}

public String value() {
    return value;
}
}
