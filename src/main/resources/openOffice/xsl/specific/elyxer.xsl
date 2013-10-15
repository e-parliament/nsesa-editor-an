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


    <!-- Text -->
    <xsl:template match="h:div[@id='globalWrapper']//h:div[@class='Standard']">
        <xsl:call-template name="paragraph"/>
    </xsl:template>
    <xsl:template match="h:div[@id='globalWrapper']//h:div[@class='Addsec']">
        <xsl:call-template name="paragraph"/>
    </xsl:template>
    <xsl:template match="h:div[@id='globalWrapper']//h:div[@class='Description']">
        <xsl:call-template name="paragraph"/>
    </xsl:template>

    <!-- Title and Subtitle -->
    <xsl:template match="h:div[@id='globalWrapper']//h:div[@class='Subject']">
        <text:p text:style-name="Title">
            <xsl:apply-templates mode="inparagraph"/>
        </text:p>
    </xsl:template>
    <xsl:template match="h:div[@id='globalWrapper']//h:div[@class='Subtitle']">
        <text:p text:style-name="Subtitle">
            <xsl:apply-templates mode="inparagraph"/>
        </text:p>
    </xsl:template>

    <!-- Footnotes -->
    <xsl:template match="h:span[@class='FootOuter']" mode="inparagraph">
        <text:note text:note-class="footnote">
            <xsl:apply-templates mode="inparagraph"/>
        </text:note>
    </xsl:template>
    <xsl:template match="h:span[@class='SupFootMarker']" mode="inparagraph"/>
    <xsl:template match="h:span[@class='HoverFoot']" mode="inparagraph">
        <text:note-body>
            <text:p text:style-name="Footnote">
                <xsl:apply-templates mode="inparagraph"/>
            </text:p>
        </text:note-body>
    </xsl:template>

</xsl:stylesheet>
