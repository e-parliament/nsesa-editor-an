<#ftl ns_prefixes={"D":"http://www.akomantoso.org/2.0", "html5":"http://www.w3.org/1999/xhtml"}>
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
<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<?mso-infoPathSolution solutionVersion="1.0.0.1" productVersion="11.0.6565" PIVersion="1.0.0.0" href="IPTemplate.xsn" name="urn:schemas-microsoft-com:office:infopath:IPTemplate:-myXSD-2006-02-07T11-26-51" ?><?mso-application progid="InfoPath.Document"?>
<my:myFields xmlns:my="http://schemas.microsoft.com/office/infopath/2003/myXSD/2006-02-07T11:26:51" xml:lang="en-us">
    <my:IPRT>
        <div
                xmlns="http://www.w3.org/1999/xhtml"
                >

        <#-- location -->
            <p>${amendment.akomaNtoso[0].amendment.amendmentBody[0].amendmentHeading[0].block[0]}</p>
            <table>
                <tr>
                    <td><h3>Proposed</h3></td>
                    <td><h3>Amendment</h3></td>
                </tr>
                <tr>
                    <td>
                    <#-- amendment body -->
                    <@transform amendment.akomaNtoso[0].amendment.amendmentBody[0].amendmentContent[0].block[2].mod[0].quotedStructure[0]/>
                    </td>
                    <td>
                    <@transform amendment.akomaNtoso[0].amendment.amendmentBody[0].amendmentContent[0].block[2].mod[0].quotedStructure[1]/>
                    </td>
                </tr>
            </table>
        </div>
    </my:IPRT>
</my:myFields>

<#macro transform am>
    <@compress single_line=true>
        <#if am?children?size gt 0><#t/>
            <#list am?children as child><#t/>
                <#if child?node_type == 'element'><#t/>
                <<@transformElement child/>><@transform child/><#t/></<@transformElement child/>>
                <#elseif child?node_type == "text"><#t/>
                ${child?string?xml}<#t/>
                </#if><#t/>
            </#list><#t/>
        </#if><#t/>
        <#lt/>
    </@compress>
</#macro>

<#macro transformElement el>
    <@compress single_line=true>
        <#switch el?node_name?lower_case>
            <#case "p">p<#break/>
            <#case "b">b<#break/>
            <#case "i">i<#break/>
            <#case "em">em<#break/>
            <#case "strong">strong<#break/>
            <#case "table">table<#break/>
            <#case "tr">tr<#break/>
            <#case "td">td<#break/>
            <#case "img">img<#break/>
            <#case "a">a<#break/>
            <#default>span
        </#switch>
    </@compress>
</#macro>