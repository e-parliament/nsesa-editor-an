<#-- Freemarker template to handle XML transformations for IE -->
<#macro element el debug=false>
    <#compress>
    <span class="widget ${el?node_name} <#if el.@class[0]??>${el.@class}</#if>"
        <#list el.@@ as attr><#if attr?node_name?lower_case != "xmlns">${attr?node_name}="${attr}" </#if></#list>
            type="${el?node_name}"
            ns="${el?node_namespace}"
            >
        <#if el?children?size gt 0>
            <#list el?children as child>
                <#if child?node_type == 'element'>
                    <@element el=child debug=debug/>
                <#elseif child?node_type == "text">
                    ${child?string?xml}
                </#if>
            </#list>
        </#if>
    </span>
    </#compress>
</#macro>
<#list doc?children as child>
    <#if child?node_type == 'element'>
        <@element child/>
    </#if>
</#list>