/*
 * Copyright 2011 John Kozura
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.bfr.client.selection;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.Text;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bounding box, and methods for finding the bounding box of
 * elements and ranges.
 *
 * @author John Kozura
 */
public class HtmlBBox {
    private int m_x, m_y, m_width, m_height;

    /**
     * Create a bounding box based on x/y and width/height
     *
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public HtmlBBox(int x, int y, int width, int height) {
        m_x = x;
        m_y = y;
        m_width = width;
        m_height = height;
    }

    /**
     * Create a location based on an element's bounding box
     *
     * @param ele Element to initialize bounding box with
     */
    public HtmlBBox(Element ele) {
        this(ele.getAbsoluteLeft(), ele.getAbsoluteTop(),
                ele.getOffsetWidth(), ele.getOffsetHeight());
    }

    /**
     * Expand this box by the given bounding box
     *
     * @param bb box to use to expand this one
     */
    public void expand(HtmlBBox bb) {
        if (bb != null) {
            m_x = Math.min(m_x, bb.getAbsoluteLeft());
            m_y = Math.min(m_y, bb.getAbsoluteTop());
            m_width = Math.max(getAbsoluteRight(), bb.getAbsoluteRight()) - m_x;
            m_height = Math.max(getAbsoluteBottom(),
                    bb.getAbsoluteBottom()) - m_y;
        }
    }

    /**
     * Create a bounding box the size of the given element
     *
     * @param ele Element to create bounding box around
     * @return a new bounding box
     */
    public static HtmlBBox getBoundingBox(Element ele) {
        return new HtmlBBox(ele);
    }

    /**
     * Create a bounding box the size of the given range
     *
     * @param range Range to create bounding box around
     * @return a new bounding box
     */
    public static HtmlBBox getBoundingBox(Range rng) {
        HtmlBBox res;

        if (rng.getStartPoint().getTextNode() ==
                rng.getEndPoint().getTextNode()) {
            res = getBoundingBox(rng.getStartPoint().getTextNode(),
                    rng.getStartPoint().getOffset(),
                    rng.getEndPoint().getOffset());
        } else {
            res = getBoundingBox(rng.getStartPoint(), true);
            res.expand(getBoundingBox(rng.getEndPoint(), false));

            // Make sure the range encompasses all of the text nodes within
            // the range as well
            List<Text> texts = rng.getSelectedTextElements();
            for (int i = 1; i < (texts.size() - 1); i++) {
                res.expand(getBoundingBox(texts.get(i)));
            }
        }
        return res;
    }

    /**
     * Create a bounding box the size of the given text node.  Note that this
     * temporarily modifies the document to surround this node with a Span.
     *
     * @param textNode Text to create bounding box around
     * @return a new bounding box
     */
    public static HtmlBBox getBoundingBox(Text textNode) {
        Element el = DOM.createSpan();
        surround(textNode, el);
        HtmlBBox res = new HtmlBBox(el);
        unSurround(el);
        return res;
    }

    /**
     * Create a bounding box around the single character at the offset given
     * within a text node.  If the offset is at the end of the text, the
     * bounding box is a point.  Temporarily modifies the document as indicated
     * in getBoundingBox(textNode, offset1, offset2)
     *
     * @param textNode Text node to find character in
     * @param offset   offset of the character
     * @return a new bounding box
     */
    public static HtmlBBox getBoundingBox(Text textNode, int offset) {
        return getBoundingBox(textNode, offset,
                (offset == textNode.getLength()) ? offset
                        : offset + 1);
    }

    /**
     * Create a bounding box the size of the text between the two offsets of
     * the given textNode.  Note that this temporarily modifies the document
     * to excise the sub-text into its own span element, which is then used
     * to generate the bounding box.
     *
     * @param textNode Text to create bounding box around
     * @param offset1  Starting offset to get bounding box from
     * @param offset2  Ending offset to get bounding box from
     * @return a new bounding box
     */
    public static HtmlBBox getBoundingBox(Text textNode,
                                          int offset1, int offset2) {
        HtmlBBox res;

        String text = textNode.getData();
        int len = text.length();
        if ((offset1 == 0) && (offset2 == len)) {
            // Shortcut
            return getBoundingBox(textNode);
        }
        if ((offset2 > len) || (offset1 > offset2)) {
            return null;
        }

        // If this is a cursor, we still need to outline one character
        boolean isCursor = (offset1 == offset2);
        boolean posRight = false;
        if (isCursor) {
            if (offset1 == len) {
                offset1--;
                posRight = true;
            } else {
                offset2++;
            }
        }

        // Create 2 or 3 spans of this text, so we can measure
        List<Element> nodes = new ArrayList<Element>(3);
        Element tmpSpan, measureSpan;
        if (offset1 > 0) {
            // First
            tmpSpan = DOM.createSpan();
            tmpSpan.setInnerHTML(text.substring(0, offset1));
            nodes.add(tmpSpan);
        }

        // Middle, the one we measure
        measureSpan = DOM.createSpan();
        measureSpan.setInnerHTML(text.substring(offset1, offset2));
        nodes.add(measureSpan);

        if (offset2 < (len - 1)) {
            // Last
            tmpSpan = DOM.createSpan();
            tmpSpan.setInnerHTML(text.substring(offset2 + 1));
            nodes.add(tmpSpan);
        }

        Node parent = textNode.getParentNode();

        for (Node node : nodes) {
            parent.insertBefore(node, textNode);
        }

        parent.removeChild(textNode);

        if (isCursor) {
            // Just make a 0-width version, depending on left or right
            res = new HtmlBBox(measureSpan.getAbsoluteLeft() +
                    (posRight ? measureSpan.getOffsetWidth() : 0),
                    measureSpan.getAbsoluteTop(),
                    0,
                    measureSpan.getOffsetHeight());
        } else {
            res = new HtmlBBox(measureSpan);
        }

        parent.insertBefore(textNode, nodes.get(0));

        for (Node node : nodes) {
            parent.removeChild(node);
        }

        return res;
    }

    /**
     * Create a bounding box around the single character at the rangeEndPoint
     * given.  If the offset is at the end of the text, the
     * bounding box is a point.  Temporarily modifies the document as indicated
     * in getBoundingBox(textNode, offset1, offset2)
     *
     * @param endPoint End point to find character in
     * @return a new bounding box
     */
    public static HtmlBBox getBoundingBox(RangeEndPoint endPoint) {
        return getBoundingBox(endPoint.getTextNode(), endPoint.getOffset());
    }

    /**
     * Create a bounding box around the text of the rangeEndPoint specified,
     * either to the end or the beginning of the endPoint's text node.
     * Temporarily modifies the document as indicated in
     * getBoundingBox(textNode, offset1, offset2)
     *
     * @param endPoint End point to find character in
     * @param asStart  Whether to get text from here to end (true) or from start
     *                 to here (false)
     * @return a new bounding box
     */
    public static HtmlBBox getBoundingBox(RangeEndPoint endPoint,
                                          boolean asStart) {
        return getBoundingBox(endPoint.getTextNode(),
                asStart ? endPoint.getOffset() : 0,
                asStart ? endPoint.getTextNode().getLength()
                        : endPoint.getOffset());
    }

    /**
     * Create a bounding box around a widget.
     *
     * @param wid Widget to get bounding box of
     * @return a new bounding box
     */
    public static HtmlBBox getBoundingBox(Widget wid) {
        return getBoundingBox(wid.getElement());
    }

    /**
     * Some random DOM utility functions
     */

    /**
     * Determine the index of a node within its parent
     *
     * @param child A node to determine the index of
     * @return index of the node, or -1 on failure
     */
    public static int getChildIndex(Node child) {
        int res = -1;
        Node parent = child.getParentNode();
        if (parent != null) {
            for (int i = 0; i < parent.getChildCount(); i++) {
                if (child == parent.getChild(i)) {
                    res = i;
                    break;
                }
            }
        }
        return res;
    }

    /**
     * Move all children of this element up into its place, and remove the
     * element.
     *
     * @param parent element to replace with its children
     */
    public static void unSurround(Element parent) {
        Node superParent = parent.getParentNode();
        Node child;
        while ((child = parent.getFirstChild()) != null) {
            parent.removeChild(child);
            superParent.insertBefore(child, parent);
        }
        superParent.removeChild(parent);
    }

    /**
     * Move a node inside of a parent element, maintaining it within the DOM
     *
     * @param toChild   Node to make into a child
     * @param newParent Element to make into a parent in its place
     */
    public static void surround(Node toChild, Element newParent) {
        toChild.getParentElement().insertBefore(newParent, toChild);
        newParent.appendChild(toChild);
    }


    public int getAbsoluteLeft() {
        return m_x;
    }

    public int getAbsoluteTop() {
        return m_y;
    }

    public int getAbsoluteRight() {
        return m_x + m_width;
    }

    public int getAbsoluteBottom() {
        return m_y + m_height;
    }

    public int getOffsetWidth() {
        return m_width;
    }

    public int getOffsetHeight() {
        return m_height;
    }

    public int getCenterX() {
        return m_x + m_width / 2;
    }

    public int getCenterY() {
        return m_y + m_height / 2;
    }

    @Override
    public boolean equals(Object o) {
        try {
            HtmlBBox cmp = (HtmlBBox) o;

            return (cmp.getAbsoluteLeft() == m_x) &&
                    (cmp.getAbsoluteTop() == m_y) &&
                    (cmp.getOffsetHeight() == m_height) &&
                    (cmp.getOffsetWidth() == m_width);
        } catch (Exception ex) {
        }

        return false;
    }
}