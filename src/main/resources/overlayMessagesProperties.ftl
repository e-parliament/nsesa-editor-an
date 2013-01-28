<#-- @ftlvariable name="overlayClasses" type="java.util.List<OverlayClass>" -->
<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
<#list overlayClasses as cl>

name.${cl.className}=${cl.name}
description.${cl.className}=<#if cl.comments??>${cl.comments?replace("\n", " ")?replace("\t", " ")?replace("'", "''")?replace("\\s+"," ", "r")}<#else></#if>
</#list>
