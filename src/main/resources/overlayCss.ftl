<#-- @ftlvariable name="overlayStyleFactory" type="org.nsesa.editor.app.xsd.model.CssOverlayStyle.CssOverlayFactory" -->
<#-- @ftlvariable name="styles" type="java.util.List<CssOverlayStyle>" -->
<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->

<@generateCss overlayClass=overlayClass styles=styles/>

<#macro generateCss overlayClass styles>
    <#assign overlayStyle = overlayStyleFactory.create(overlayClass,styles)>
    <#assign withBanner = overlayStyle.name?? && overlayClass.children?size != 0>
    <#if withBanner>
    /****************************************/
    /** ${overlayClass.name} **/
    /****************************************/
    </#if>
    <#if overlayStyle.name??>
        ${overlayStyle.name} {
            <#assign m = overlayStyle.values>
            <#assign keys = m?keys>
            <#list keys as key>
                ${key}:${m[key]};
            </#list>
        }
    </#if>
    <#if overlayClass.children?size != 0 >
        <#list overlayClass.orderedChildren as child>
                 <@generateCss overlayClass=child styles=styles/>
        </#list>
    </#if>
</#macro>