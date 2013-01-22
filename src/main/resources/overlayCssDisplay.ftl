<#-- @ftlvariable name="overlayStyleFactory" type="org.nsesa.editor.app.xsd.model.CssOverlayStyle.CssOverlayFactory" -->
<#-- @ftlvariable name="styles" type="java.util.List<CssOverlayStyle>" -->
<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
<#-- @ftlvariable name="cssConfiguration" type="java.util.Map<String, Object>" -->
<#-- @ftlvariable name="colorGenerator" type="org.nsesa.editor.app.xsd.model.CssColorGenerator" -->

/*
* --------------------------------------------------------------------------
* Akoma Ntoso Display default stylesheet.
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
            <#if overlayClass.isDescendentOf("Inline") && (overlayClass.isElement() || overlayClass.isComplex())>
                <#if overlayStyle.values['background-color']??>
.akomaNtoso .${overlayStyle.name} {
    background-color:${overlayStyle.values['background-color']};
}
                <#else>
.akomaNtoso .${overlayStyle.name} {
    background-color:#${colorGenerator.nextColor(overlayStyle.name)};
}
                </#if>
            <#else>
.akomaNtoso .${overlayStyle.name}:before {
    content: "${overlayStyle.name}";
    display:block;
    text-align:right;
    color: #000000;
}
                <#if overlayStyle.values['border']??>
.akomaNtoso .${overlayStyle.name} {
    border:${overlayStyle.values['border']};
}
                <#else>
.akomaNtoso .${overlayStyle.name} {
    border:1px solid #${colorGenerator.nextColor(overlayStyle.name)};
}
                </#if>
            </#if>
        </#if>
    </#if>
    <#if overlayClass.children?size != 0 >
        <#list overlayClass.orderedChildren as child>
            <@generateCss overlayClass=child styles=styles/>
        </#list>
    </#if>
</#macro>