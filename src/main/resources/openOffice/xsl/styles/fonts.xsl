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
        xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
        xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
        version="1.0">

    <xsl:template name="fonts">

        <xsl:if test="count(//office:font-face-decls/style:font-face[@style:name = 'DejaVu Sans Mono']) = 0">
            <style:font-face style:name="DejaVu Sans Mono"
                             svg:font-family="&apos;DejaVu Sans Mono&apos;"
                             style:font-family-generic="modern" style:font-pitch="fixed"/>
        </xsl:if>

    </xsl:template>

</xsl:stylesheet>
