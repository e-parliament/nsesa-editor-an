<#-- @ftlvariable name="overlayStyleFactory" type="org.nsesa.editor.app.xsd.model.CssOverlayStyle.CssOverlayFactory" -->
<#-- @ftlvariable name="styles" type="java.util.List<CssOverlayStyle>" -->
<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
<#-- @ftlvariable name="cssConfiguration" type="java.util.Map<String, Object>" -->
<#-- @ftlvariable name="colorGenerator" type="org.nsesa.editor.app.xsd.model.CssColorGenerator" -->

/*
* --------------------------------------------------------------------------
* Akoma Ntoso Draft Tool default stylesheet.
* Note: this file is generated!
* --------------------------------------------------------------------------
*/

<@generateCss overlayClass=overlayClass styles=styles/>

<#macro generateCss overlayClass styles>
    <#assign overlayStyle = overlayStyleFactory.create(overlayClass,styles)>
    <#assign withBanner = overlayStyle.name?? && overlayClass.children?size != 0>
    <#if withBanner>
    /*
    * --------------------------
    * ${overlayClass.name}
    * --------------------------
    */
    </#if>
    <#if overlayStyle.name??>
        <#if cssConfiguration['printEmptyCss'] || (overlayStyle.values?size != 0)>
            <@displayDrafting overlayStyle=overlayStyle overlayClass=overlayClass/>
        </#if>
    </#if>
    <#if overlayClass.children?size != 0 >
        <#list overlayClass.orderedChildren as child>
            <@generateCss overlayClass=child styles=styles/>
        </#list>
    </#if>
</#macro>

<#macro displayDrafting overlayStyle overlayClass>
.drafting-${overlayStyle.name} {
    display:block;
    background-color:<#if overlayStyle.values["background-color"]??>${overlayStyle.values["background-color"]};<#else>#${colorGenerator.getColor(overlayStyle.name)};</#if>
    color:<#if overlayStyle.values["color"]??>${overlayStyle.values["color"]};<#elseif overlayStyle.values["background-color"]??>#${colorGenerator.matchTextColor(overlayStyle.values["background-color"])};<#else>#${colorGenerator.getTextColor(overlayStyle.name)};</#if>
}
</#macro>
