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
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        version="1.0">


    <xsl:param name="debug"></xsl:param>

    <!-- URL of the converted page -->
    <xsl:param name="url">http://localhost</xsl:param>

    <!-- in the text to convert, heading tags start below this level
         (0 for h1, 1 for h2, etc.) -->
    <xsl:param name="heading_minus_level">0</xsl:param>

    <!-- default image size -->
    <xsl:param name="img_default_width">8cm</xsl:param>
    <xsl:param name="img_default_height">6cm</xsl:param>

    <!-- images smaller that this will be placed inline (e.g. smileys) -->
    <xsl:param name="img_inline_threshold">2</xsl:param>

</xsl:stylesheet>

