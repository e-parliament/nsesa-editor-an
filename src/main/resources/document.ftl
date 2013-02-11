<#--

    Copyright 2013 European Parliament

    Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
    You may not use this work except in compliance with the Licence.
    You may obtain a copy of the Licence at:

    http://joinup.ec.europa.eu/software/page/eupl

    Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the Licence for the specific language governing permissions and limitations under the Licence.

-->
<#-- Freemarker template to handle XML transformations for IE -->
<#macro element el debug=false>
    <#compress>
    <span class="widget ${el?node_name}<#compress><#if el.@class[0]??> ${el.@class}</#if></#compress>"
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