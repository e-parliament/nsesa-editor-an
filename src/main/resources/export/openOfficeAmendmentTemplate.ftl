<#ftl ns_prefixes={"D":"urn:oasis:names:tc:opendocument:xmlns:office:1.0",
"am":"http://org.nsesa.editor/an/2013/1/amendment",
"text":"urn:oasis:names:tc:opendocument:xmlns:text:1.0",
"style":"urn:oasis:names:tc:opendocument:xmlns:style:1.0",
"table":"urn:oasis:names:tc:opendocument:xmlns:table:1.0"}>
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
<?xml version="1.0" encoding="UTF-8"?>
<office:document-content xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
                         xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
                         xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"
                         xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0"
                         xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"
                         xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
                         office:version="1.2">
    <office:scripts/>
    <office:font-face-decls>
        <style:font-face style:name="Lucida Sans1" svg:font-family="'Lucida Sans'" style:font-family-generic="swiss"/>
        <style:font-face style:name="Times New Roman" svg:font-family="'Times New Roman'"
                         style:font-family-generic="roman" style:font-pitch="variable"/>
        <style:font-face style:name="Arial" svg:font-family="Arial" style:font-family-generic="swiss"
                         style:font-pitch="variable"/>
        <style:font-face style:name="Lucida Sans" svg:font-family="'Lucida Sans'" style:font-family-generic="system"
                         style:font-pitch="variable"/>
        <style:font-face style:name="SimSun" svg:font-family="SimSun" style:font-family-generic="system"
                         style:font-pitch="variable"/>
    </office:font-face-decls>
    <office:automatic-styles>
        <style:style style:name="table-default" style:family="table">
            <style:table-properties style:width="6.6931in" table:align="margins"/>
        </style:style>

        <style:style style:name="table-default.cell-A1" style:family="table-cell">
            <style:table-cell-properties fo:padding="0.0382in" fo:border-left="0.0007in solid #000000"
                                         fo:border-right="none" fo:border-top="0.0007in solid #000000"
                                         fo:border-bottom="0.0007in solid #000000"/>
        </style:style>
        <style:style style:name="table-default.cell-C1" style:family="table-cell">
            <style:table-cell-properties fo:padding="0.0382in" fo:border="0.0007in solid #000000"/>
        </style:style>
        <style:style style:name="table-default.cell-A2" style:family="table-cell">
            <style:table-cell-properties fo:padding="0.0382in" fo:border-left="0.0007in solid #000000"
                                         fo:border-right="none" fo:border-top="0.0007in solid #000000"
                                         fo:border-bottom="0.0007in solid #000000"/>
        </style:style>
        <style:style style:name="table-default.cell-C2" style:family="table-cell">
            <style:table-cell-properties fo:padding="0.0382in" fo:border="0.0007in solid #000000"/>
        </style:style>
        <style:style style:name="table-default.cell-A3" style:family="table-cell">
            <style:table-cell-properties fo:padding="0.0382in" fo:border-left="0.0007in solid #000000"
                                         fo:border-right="none" fo:border-top="0.0007in solid #000000"
                                         fo:border-bottom="0.0007in solid #000000"/>
        </style:style>
        <style:style style:name="table-default.cell-C3" style:family="table-cell">
            <style:table-cell-properties fo:padding="0.0382in" fo:border="0.0007in solid #000000"/>
        </style:style>

    </office:automatic-styles>
    <office:body>
        <office:text>
            <text:sequence-decls>
                <text:sequence-decl text:display-outline-level="0" text:name="Illustration"/>
                <text:sequence-decl text:display-outline-level="0" text:name="Table"/>
                <text:sequence-decl text:display-outline-level="0" text:name="Text"/>
                <text:sequence-decl text:display-outline-level="0" text:name="Drawing"/>
            </text:sequence-decls>
        <#list doc?children as child>
            <#list child?children as grandChild>
                <#list grandChild?children as grandGrandChild>
                    <@t grandGrandChild/>
                </#list>
            </#list>
        </#list>
            <text:p text:style-name="Standard">Hello world!</text:p>
        </office:text>
    </office:body>
</office:document-content>
<#macro t am>
${am["@@markup"]}
</#macro>