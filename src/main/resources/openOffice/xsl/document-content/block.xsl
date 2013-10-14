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


    <xsl:template match="h:blockquote">
        <!-- special formatting is defined in paragraph -->
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="h:hr">
        <text:p text:style-name="Horizontal_20_Line"/>
    </xsl:template>
    <xsl:template match="h:hr" mode="inparagraph"/>

    <!--
        Preformatted paragraphs management
    -->
    <xsl:template match="h:pre">
        <text:p text:style-name="Preformatted_20_Text">
            <xsl:apply-templates mode="inparagraph"/>
        </text:p>
        <!-- The Preformatted_20_Text style has a margin-bottom of 0, so we add an
             empty line here -->
        <text:p text:style-name="Text_20_body"/>
    </xsl:template>
    <xsl:template match="h:pre" mode="inparagraph"/>

    <xsl:template match="h:pre//text()" mode="inparagraph">
        <!-- Don't generate the last line break before the </pre> -->
        <xsl:variable name="content">
            <xsl:choose>
                <xsl:when test="contains(., '&#10;')
                            and position() = last()
                            and substring(., string-length(.)) = '&#10;'">
                    <xsl:value-of select="substring(., 1, string-length(.)-1)"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="."/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- Now call the main template, which will handle the line-breaking -->
        <xsl:call-template name="pre.line">
            <xsl:with-param name="content" select="$content"/>
        </xsl:call-template>
    </xsl:template>

    <!--
        this template splits newline-separated pararagraphs into multiple
        paragraphs
    -->
    <xsl:template name="pre.line">
        <xsl:param name="content"/>
        <xsl:choose>
            <!-- This line-breaking manipulation is classical, e.g.:
                 http://skew.org/xml/stylesheets/linefeed2br/
            -->
            <xsl:when test="contains($content, '&#10;')">
                <!-- split in two -->
                <xsl:call-template name="pre.line">
                    <xsl:with-param name="content" select="substring-before($content, '&#10;')"/>
                </xsl:call-template>
                <text:line-break/>
                <xsl:call-template name="pre.line">
                    <xsl:with-param name="content" select="substring-after($content, '&#10;')"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <!-- here we're on a single line, call pre.line.single to preserve
                     spaces -->
                <xsl:call-template name="pre.line.single">
                    <xsl:with-param name="content" select="string($content)"/>
                </xsl:call-template>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <!-- This template escapes adjacent spaces -->
    <xsl:template name="pre.line.single">
        <xsl:param name="content"/>
        <xsl:choose>
            <xsl:when test="contains($content, '  ')">
                <xsl:call-template name="pre.line.single">
                    <xsl:with-param name="content" select="substring-before($content, '  ')"/>
                </xsl:call-template>
                <text:s text:c="2"/>
                <xsl:call-template name="pre.line.single">
                    <xsl:with-param name="content" select="substring-after($content, '  ')"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:when test="contains($content, '&#9;')">
                <xsl:call-template name="pre.line.single">
                    <xsl:with-param name="content" select="substring-before($content, '&#9;')"/>
                </xsl:call-template>
                <text:tab/>
                <xsl:call-template name="pre.line.single">
                    <xsl:with-param name="content" select="substring-after($content, '&#9;')"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="string($content)"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>


    <xsl:template match="h:address">
        <!-- special formatting is defined in paragraph -->
        <xsl:call-template name="paragraph"/>
    </xsl:template>
    <xsl:template match="h:address" mode="inparagraph"/>

    <xsl:template match="h:center">
        <!-- special formatting is defined in paragraph -->
        <xsl:call-template name="paragraph"/>
    </xsl:template>
    <xsl:template match="h:center" mode="inparagraph"/>

</xsl:stylesheet>
