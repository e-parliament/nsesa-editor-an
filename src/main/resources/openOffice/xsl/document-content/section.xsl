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


    <xsl:template name="section" match="h:h1|h:h2|h:h3|h:h4|h:h5|h:h6">

        <!-- compute level of section -->
        <xsl:variable name="level">
            <xsl:value-of select="substring-after(local-name(.),'h') - $heading_minus_level"/>
        </xsl:variable>

        <xsl:comment>
            <xsl:text>section level </xsl:text><xsl:value-of select="$level"/>
        </xsl:comment>

        <text:h>
            <xsl:attribute name="text:style-name">
                <xsl:text>Heading_20_</xsl:text>
                <xsl:value-of select="$level"/>
            </xsl:attribute>
            <xsl:attribute name="text:outline-level">
                <xsl:value-of select="$level"/>
            </xsl:attribute>

            <xsl:apply-templates mode="inparagraph"/>

        </text:h>

    </xsl:template>


</xsl:stylesheet>
