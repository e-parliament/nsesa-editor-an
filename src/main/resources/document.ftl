<#--

    Copyright 2013 European Parliament

    Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
    You may not use this work except in compliance with the Licence.
    You may obtain a copy of the Licence at:

    http://joinup.ec.europa.eu/software/page/eupl

    Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the Licence for the specific language governing permissions and limitations under the Licence.

-->
<#-- Freemarker template to handle XML transformations for IE -->
<#macro element el debug=false>
    <@compress single_line=true>
    <<@elementName el=el/> class="widget ${el?node_name} <#if el.@class[0]??> ${el.@class}</#if>"
        <#list el.@@ as attr><#if attr?node_name?lower_case != "xmlns">${attr?node_name}="${attr}" </#if></#list>
    data-type="${el?node_name}"
    data-ns="${el?node_namespace}"><#t/>
        <#if el?children?size gt 0><#t/>
            <#list el?children as child><#t/>
                <#if child?node_type == 'element'><#t/>
                    <@element el=child debug=debug/><#t/>
                <#elseif child?node_type == "text"><#t/>${child?string?xml?replace("&apos;", "&#39;")}</#if></#list></#if></<@elementName el=el/>><#lt/>
    </@compress>
</#macro>
<#macro elementName el>
    <@compress single_line=true>
        <#assign native_element_node_names = ["table", "thead", "tfoot", "tbody", "tr", "td","img"] />
        <#if native_element_node_names?seq_contains(el?node_name?string?lower_case)>${el?node_name?string?lower_case}
        <#else>span</#if>
    </@compress>
</#macro>
<@compress single_line=true>
    <#list doc?children as child><#if child?node_type == 'element'><@element child/></#if></#list>
</@compress>