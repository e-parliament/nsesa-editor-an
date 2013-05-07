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
<!DOCTYPE html>
<html lang="EN">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <link rel="stylesheet" href="${editorUrl}/css/editor.css" media="screen"/>
    <link rel="stylesheet" href="${editorUrl}/css/document.css" media="screen"/>
    <link rel="stylesheet" href="${editorUrl}/css/amendment.css" media="screen"/>
    <link rel="stylesheet" href="${editorUrl}/css/akomaNtoso-all.css" media="screen"/>
    <link rel="stylesheet" href="${editorUrl}/css/akomaNtoso-visual-colors.css" media="screen"/>
    <link rel="stylesheet" href="${editorUrl}/css/akomaNtoso-override.css" media="screen"/>
    <link rel="stylesheet" href="${editorUrl}/css/akomaNtoso30-all.css" media="screen"/>
    <link rel="stylesheet" href="${editorUrl}/css/akomaNtoso30-visual-colors.css" media="screen"/>
    <link rel="stylesheet" href="${editorUrl}/css/akomaNtoso30-override.css" media="screen"/>

</head>
<body>
<div class="amendments">
    <div class="amendmentHolder">
        <div>

<#macro element el debug=false>
    <@compress single_line=true>
    <span class="widget ${el?node_name} <#if el.@class[0]??> ${el.@class}</#if>"
        <#list el.@@ as attr><#if attr?node_name?lower_case != "xmlns">${attr?node_name}="${attr}" </#if></#list>
            type="${el?node_name}"
            ns="${el?node_namespace}"><#t/>
        <#if el?children?size gt 0><#t/>
            <#list el?children as child><#t/>
                <#if child?node_type == 'element'><#t/>
                    <@element el=child debug=debug/><#t/>
                <#elseif child?node_type == "text"><#t/>
                ${child?string?xml}<#t/>
                </#if><#t/>
            </#list><#t/>
        </#if><#t/>
    </span><#lt/>
    </@compress>
</#macro>
<@compress single_line=true>
    <#list amendment?children as child><#if child?node_type == 'element'><@element child/></#if></#list>
</@compress>
        </div>
    </div>
</div>
</body>
</html>