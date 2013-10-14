<?xml version="1.0" encoding="UTF-8"?>
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
        xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"
        xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
        xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"
        version="1.0">

    <xsl:template name="highlight">

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.class']) = 0
                  and count(//*[@text:style-name='syntax-highlight.class']) > 0">
            <style:style style:name="syntax-highlight.class" style:family="text">
                <style:text-properties fo:color="#445588"
                                       fo:font-weight="bold"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.function']) = 0
                  and count(//*[@text:style-name='syntax-highlight.function']) > 0">
            <style:style style:name="syntax-highlight.function" style:family="text">
                <style:text-properties fo:color="#990000"
                                       fo:font-weight="bold"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.tag']) = 0
                  and count(//*[@text:style-name='syntax-highlight.tag']) > 0">
            <style:style style:name="syntax-highlight.tag" style:family="text">
                <style:text-properties fo:color="#000080"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.attr']) = 0
                  and count(//*[@text:style-name='syntax-highlight.attr']) > 0">
            <style:style style:name="syntax-highlight.attr" style:family="text">
                <style:text-properties fo:color="#008080"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.builtin']) = 0
                  and count(//*[@text:style-name='syntax-highlight.builtin']) > 0">
            <style:style style:name="syntax-highlight.builtin" style:family="text">
                <style:text-properties fo:color="#999999"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.namespace']) = 0
                  and count(//*[@text:style-name='syntax-highlight.namespace']) > 0">
            <style:style style:name="syntax-highlight.namespace" style:family="text">
                <style:text-properties fo:color="#555555"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.exception']) = 0
                  and count(//*[@text:style-name='syntax-highlight.exception']) > 0">
            <style:style style:name="syntax-highlight.exception" style:family="text">
                <style:text-properties fo:color="#990000"
                                       fo:font-weight="bold"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.var']) = 0
                  and count(//*[@text:style-name='syntax-highlight.var']) > 0">
            <style:style style:name="syntax-highlight.var" style:family="text">
                <style:text-properties fo:color="#009999"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.builtin.pseudo']) = 0
                  and count(//*[@text:style-name='syntax-highlight.builtin.pseudo']) > 0">
            <style:style style:name="syntax-highlight.builtin.pseudo" style:family="text">
                <style:text-properties fo:color="#999999"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.string']) = 0
                  and count(//*[@text:style-name='syntax-highlight.string']) > 0">
            <style:style style:name="syntax-highlight.string" style:family="text">
                <style:text-properties fo:color="#bb8844"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.number']) = 0
                  and count(//*[@text:style-name='syntax-highlight.number']) > 0">
            <style:style style:name="syntax-highlight.number" style:family="text">
                <style:text-properties fo:color="#009999"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.comment']) = 0
                  and count(//*[@text:style-name='syntax-highlight.comment']) > 0">
            <style:style style:name="syntax-highlight.comment" style:family="text">
                <style:text-properties fo:color="#999988"
                                       fo:font-style="italic"/>
            </style:style>
        </xsl:if>

        <xsl:if test="count(//office:automatic-styles/style:style[@style:name = 'syntax-highlight.error']) = 0
                  and count(//*[@text:style-name='syntax-highlight.error']) > 0">
            <style:style style:name="syntax-highlight.error" style:family="text">
                <style:text-properties fo:color="#a61717"
                                       fo:background-color="#e3d2d2"/>
            </style:style>
        </xsl:if>

    </xsl:template>

</xsl:stylesheet>
