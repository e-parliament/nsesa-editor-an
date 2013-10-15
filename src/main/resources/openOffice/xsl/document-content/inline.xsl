<?xml version="1.0" encoding="utf-8"?>
<!--

    xhtml2odt - XHTML to ODT XML transformation.
    Copyright (C) 2009 Aurelien Bompard
    Inspired by the work on docbook2odt, by Roman Fordinal
    http://open.comsultia.com/docbook2odf/

    License: LGPL v2.1 or later <http://www.gnu.org/licenses/lgpl-2.1.html>

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
    MA  02110-1301  USA

-->
<xsl:stylesheet
        xmlns:h="http://www.w3.org/1999/xhtml"
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"
        version="1.0">


    <xsl:template match="h:em|h:i"/>
    <xsl:template match="h:em|h:i" mode="inparagraph">
        <text:span text:style-name="emphasis">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:strong|h:b"/>
    <xsl:template match="h:strong|h:b" mode="inparagraph">
        <text:span text:style-name="strong">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:sup"/>
    <xsl:template match="h:sup" mode="inparagraph">
        <text:span text:style-name="sup">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:sub"/>
    <xsl:template match="h:sub" mode="inparagraph">
        <text:span text:style-name="sub">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:code|h:tt|h:samp|h:kbd"/>
    <xsl:template match="h:code|h:tt|h:samp|h:kbd" mode="inparagraph">
        <text:span text:style-name="Teletype">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:br">
        <text:line-break/>
    </xsl:template>
    <xsl:template match="h:br" mode="inparagraph">
        <text:line-break/>
    </xsl:template>

    <xsl:template match="h:del"/>
    <xsl:template match="h:del" mode="inparagraph">
        <text:span text:style-name="strike">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:abbr|h:acronym"/>
    <xsl:template match="h:abbr|h:acronym" mode="inparagraph">
        <xsl:apply-templates mode="inparagraph"/>
        <xsl:variable name="footnotenum"
                      select="count(preceding::h:abbr) + count(preceding::h:acronym) + 1"/>
        <text:note text:note-class="footnote">
            <xsl:attribute name="text:id">
                <xsl:text>ftn</xsl:text>
                <xsl:value-of select="$footnotenum"/>
            </xsl:attribute>
            <text:note-citation>
                <xsl:value-of select="$footnotenum"/>
            </text:note-citation>
            <text:note-body>
                <text:p text:style-name="Footnote">
                    <xsl:value-of select="@title"/>
                </text:p>
            </text:note-body>
        </text:note>
    </xsl:template>

    <xsl:template match="h:big"/>
    <xsl:template match="h:big" mode="inparagraph">
        <text:span text:style-name="big">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:small"/>
    <xsl:template match="h:small" mode="inparagraph">
        <text:span text:style-name="small">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:cite|h:dfn|h:var"/>
    <xsl:template match="h:cite|h:dfn|h:var" mode="inparagraph">
        <text:span text:style-name="Citation">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:q"/>
    <xsl:template match="h:q" mode="inparagraph">
        <xsl:text>"</xsl:text>
        <xsl:apply-templates mode="inparagraph"/>
        <xsl:text>"</xsl:text>
    </xsl:template>

    <xsl:template match="h:ins"/>
    <xsl:template match="h:ins" mode="inparagraph">
        <text:span text:style-name="underline">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>

    <xsl:template match="h:u"/>
    <xsl:template match="h:u" mode="inparagraph">
        <text:span text:style-name="underline">
            <xsl:apply-templates mode="inparagraph"/>
        </text:span>
    </xsl:template>


</xsl:stylesheet>
