<#-- @ftlvariable name="overlayClasses" type="java.util.List<OverlayClass>" -->
<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->

package ${packageNameGenerator.getPackageName(overlayClass)};

import com.google.gwt.i18n.client.Messages;

/**
* Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayMessages.ftl</tt>.
*/

public interface ${overlayClass.className?cap_first} extends Messages {
<#list overlayClasses as cl>
    @Key("name.${cl.className}")
    String name${cl.className?cap_first}();
    @Key("description.${cl.className}")
    String description${cl.className?cap_first}();
</#list>
}
