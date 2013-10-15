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
        version="1.0">

    <xsl:template match="h:div">
        <xsl:apply-templates/>
    </xsl:template>
    <xsl:template match="h:div" mode="inparagraph">
        <xsl:apply-templates mode="inparagraph"/>
    </xsl:template>

    <xsl:template match="h:html">
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="h:head"/>

    <xsl:template match="h:body">
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="h:span"/>
    <xsl:template match="h:span" mode="inparagraph">
        <xsl:choose>
            <xsl:when test="translate(@style,' ','') != ''">
                <!-- leave the style handling to xsl/styles.xsl -->
                <xsl:copy>
                    <xsl:copy-of select="@*"/>
                    <xsl:apply-templates mode="inparagraph"/>
                </xsl:copy>
            </xsl:when>
            <xsl:otherwise>
                <xsl:apply-templates mode="inparagraph"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template match="h:script"/>
    <xsl:template match="h:noscript"/>

    <xsl:template match="h:object"/>

    <xsl:template match="h:form"/>

</xsl:stylesheet>
