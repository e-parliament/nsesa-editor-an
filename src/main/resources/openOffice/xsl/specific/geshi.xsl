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


    <xsl:template match="h:pre[@class]">
        <xsl:choose>
            <xsl:when test="not(child::h:ol)">
                <text:p text:style-name="Preformatted_20_Text">
                    <xsl:apply-templates mode="inparagraph"/>
                </text:p>
            </xsl:when>
            <xsl:otherwise>
                <xsl:apply-templates mode="inparagraph"/>
            </xsl:otherwise>
        </xsl:choose>
        <!-- The Preformatted_20_Text style has a margin-bottom of 0, so we add an
             empty line here -->
        <text:p text:style-name="Text_20_body"/>
    </xsl:template>

    <xsl:template match="h:pre/h:ol" mode="inparagraph">
        <text:list text:style-name="Numbering_20_1">
            <xsl:apply-templates mode="inparagraph"/>
        </text:list>
    </xsl:template>

    <xsl:template match="h:pre/h:ol/h:li" mode="inparagraph">
        <text:list-item>
            <xsl:apply-templates mode="inparagraph"/>
        </text:list-item>
    </xsl:template>

    <xsl:template match="h:pre/h:ol/h:li/h:div" mode="inparagraph">
        <text:p text:style-name="Source_20_Code_20_Numbered">
            <xsl:apply-templates mode="inparagraph"/>
        </text:p>
    </xsl:template>

    <xsl:template match="h:pre/h:ol/h:li/h:div//text()" mode="inparagraph">
        <xsl:call-template name="pre.line.single">
            <xsl:with-param name="content" select="."/>
        </xsl:call-template>
    </xsl:template>

</xsl:stylesheet>
