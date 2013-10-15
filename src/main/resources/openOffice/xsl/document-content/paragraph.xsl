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


    <xsl:template match="h:p">
        <xsl:call-template name="paragraph"/>
    </xsl:template>
    <xsl:template match="h:p" mode="inparagraph">
        <xsl:apply-templates mode="inparagraph"/>
    </xsl:template>

    <xsl:template name="paragraph">
        <xsl:choose>
            <xsl:when test="
            child::h:ul|
            child::h:ol|
            child::h:blockquote|
            child::h:pre |
            child::h:dl |
            child::h:div
            ">
                <xsl:for-each select="
                    child::h:ul |
                    child::h:ol |
                    child::h:blockquote |
                    child::h:pre |
                    child::h:dl |
                    child::h:div
                    ">
                    <!-- Paragraph with the text before -->
                    <xsl:if test="preceding-sibling::node()">
                        <xsl:call-template name="paragraph-content">
                            <xsl:with-param name="subject" select="preceding-sibling::node()"/>
                        </xsl:call-template>
                    </xsl:if>
                    <!-- Create the block-type element -->
                    <xsl:apply-templates select="."/>
                    <!-- Paragraph with the text after -->
                    <xsl:if test="following-sibling::node()">
                        <xsl:call-template name="paragraph-content">
                            <xsl:with-param name="subject" select="following-sibling::node()"/>
                        </xsl:call-template>
                    </xsl:if>
                </xsl:for-each>
            </xsl:when>
            <xsl:otherwise>
                <xsl:call-template name="paragraph-content">
                    <xsl:with-param name="subject" select="node()"/>
                </xsl:call-template>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>


    <xsl:template name="paragraph-content">

        <xsl:param name="subject"/>

        <text:p>

            <xsl:attribute name="text:style-name">
                <xsl:choose>
                    <!-- those two seem unnecessary, it's handled in lists.xsl -->
                    <xsl:when test="$subject/parent::h:ul">
                        <xsl:text>list-item-bullet</xsl:text>
                    </xsl:when>
                    <xsl:when test="$subject/parent::h:ol">
                        <xsl:text>list-item-number</xsl:text>
                    </xsl:when>
                    <xsl:when test="$subject/../parent::h:blockquote">Quotations</xsl:when>
                    <xsl:when test="contains(@style,'text-align:') and contains(@style,'left')">left</xsl:when>
                    <xsl:when test="contains(@style,'text-align:') and contains(@style,'center')">center</xsl:when>
                    <xsl:when test="contains(@style,'text-align:') and contains(@style,'right')">right</xsl:when>
                    <xsl:when test="contains(@style,'text-align:') and contains(@style,'justify')">justify</xsl:when>
                    <xsl:when test="$subject/self::h:address or (name($subject) = '' and $subject/parent::h:address)">
                        Sender
                    </xsl:when>
                    <xsl:when test="$subject/self::h:center or (name($subject) = '' and $subject/parent::h:center)">
                        center
                    </xsl:when>
                    <xsl:when test="$subject/self::h:th or (name($subject) = '' and $subject/parent::h:th)">
                        Table_20_Heading
                    </xsl:when>
                    <xsl:when test="$subject/self::h:td or (name($subject) = '' and $subject/parent::h:td)">
                        Table_20_Contents
                    </xsl:when>
                    <xsl:when test="$subject/self::h:dt or (name($subject) = '' and $subject/parent::h:dt)">
                        Definition_20_Term
                    </xsl:when>
                    <xsl:when test="$subject/self::h:dd or (name($subject) = '' and $subject/parent::h:dd)">
                        Definition_20_Description
                    </xsl:when>
                    <xsl:otherwise>Text_20_body</xsl:otherwise>
                </xsl:choose>
            </xsl:attribute>

            <xsl:for-each select="$subject">
                <xsl:choose>
                    <xsl:when test="name() = ''">
                        <!-- text node -->
                        <xsl:value-of select="string()"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:apply-templates select="." mode="inparagraph"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:for-each>

        </text:p>

    </xsl:template>


</xsl:stylesheet>
