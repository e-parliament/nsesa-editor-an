/*
 * Copyright 2010 John Kozura
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

import com.bfr.client.selection.impl.RangeImpl;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a text range in a Document, everything between two RangeEndPoints.
 * Works with both a (browser dependent) javascript range object, and with
 * the java RangeEndPoint objects, building one or the other as needed on
 * demand.
 *
 * @author John Kozura
 */
public class Range {
    // For use in compareBoundaryPoint, which end points to compare
    public static final short START_TO_START = 0;
    public static final short START_TO_END = 1;
    public static final short END_TO_END = 2;
    public static final short END_TO_START = 3;

    private static RangeImpl c_impl =
            (RangeImpl) GWT.create(RangeImpl.class);

    /**
     * Returns the next adjacent text node in the given direction.  Will move
     * down the hierarchy, then through siblings, then up, looking for the first
     * text node.
     * <p/>
     * This could be non-statically included in the Node class
     *
     * @param current An element to start the search from, can be any type
     *                of node.
     * @param forward whether to search forward or backward
     * @return the next (previous) text node, or null if no more
     */
    public static Text getAdjacentTextElement(Node current, boolean forward) {
        Text res = getAdjacentTextElement(current, null, forward, false);
        return res;
    }

    /**
     * Returns the next adjacent text node in the given direction.  Will move
     * down the hierarchy (if traversingUp is not set), then through siblings,
     * then up (but not past topMostNode), looking for the first node
     * <p/>
     * This could be non-statically included in the Node class
     *
     * @param current      An element to start the search from, can be any type
     *                     of node.
     * @param topMostNode  A node that this will traverse no higher than
     * @param forward      whether to search forward or backward
     * @param traversingUp if true, will not look at the children of this element
     * @return the next (previous) text node, or null if no more
     */
    public static Text getAdjacentTextElement(Node current,
                                              Node topMostNode,
                                              boolean forward,
                                              boolean traversingUp) {
        Text res = null;
        Node node;

        // If traversingUp, then the children have already been processed
        if (!traversingUp) {
            if (current.getChildCount() > 0) {
                node = forward ? current.getFirstChild()
                        : current.getLastChild();

                if (node.getNodeType() == Node.TEXT_NODE) {
                    res = (Text) node;
                } else {
                    // Depth first traversal, the recursive call deals with
                    // siblings
                    res = getAdjacentTextElement(node, topMostNode,
                            forward, false);
                }
            }
        }

        if (res == null) {
            node = forward ? current.getNextSibling()
                    : current.getPreviousSibling();
            // Traverse siblings
            if (node != null) {
                if (node.getNodeType() == Node.TEXT_NODE) {
                    res = (Text) node;
                } else {
                    // Depth first traversal, the recursive call deals with
                    // siblings
                    res = getAdjacentTextElement(node, topMostNode,
                            forward, false);
                }
            }
        }

        // Go up and over if still not found
        if ((res == null) && (current != topMostNode)) {
            node = current.getParentNode();
            // Stop at document (technically could stop at "html" tag)
            if ((node != null) && (node.getNodeType() != Node.DOCUMENT_NODE)) {
                res = getAdjacentTextElement(node, topMostNode,
                        forward, true);
            }
        }

        return res;
    }

    /**
     * Returns all text nodes between (and including) two arbitrary text nodes.
     * Caller must ensure startNode comes before endNode.
     *
     * @param startNode start node to traverse
     * @param endNode   end node to finish traversal
     * @return A list of all text nodes between these two text nodes
     */
    public static List<Text> getSelectedTextElements(Text startNode,
                                                     Text endNode) {
        List<Text> res = new ArrayList<Text>();

        Text current = startNode;
        while ((current != null) && (current != endNode)) {
            res.add(current);

            current = getAdjacentTextElement(current, null, true, false);
        }

        if (current == null) {
            // With the old way this could have been backwards, but should not
            // happen now, so this is an error
            res = null;
        } else {
            res.add(current);
        }
        return res;
    }

    // Starting point of this range
    private RangeEndPoint m_startPoint;

    // Ending point of this range
    private RangeEndPoint m_endPoint;

    // The document this range is contained within.
    private Document m_document;

    // The javascript rendering of this range
    private RangeImpl.JSRange m_range;

    // The points as they were last time m_range was computed
    private RangeEndPoint m_lastStartPoint;
    private RangeEndPoint m_lastEndPoint;

    /**
     * Creates an empty range on this document
     *
     * @param doc Document to create an empty range in
     */
    public Range(Document doc) {
        setDocument(doc);
    }

    /**
     * Creates a range that encompasses the given element
     *
     * @param element Element to create a range around
     */
    public Range(Element element) {
        setRange(element);
    }

    /**
     * Creates a range that is a cursor at the given location
     *
     * @param cursorPoint a single point to make a cursor range
     */
    public Range(RangeEndPoint cursorPoint) {
        setCursor(cursorPoint);
    }

    /**
     * Create a range that extends between the given points.  Caller must
     * ensure that end comes after start
     *
     * @param startPoint start point of the new range
     * @param endPoint   end point of the new range
     */
    public Range(RangeEndPoint startPoint, RangeEndPoint endPoint) {
        setRange(startPoint, endPoint);
    }

    /**
     * Internal method for creating a range from a JS object
     *
     * @param document
     * @param rangeObj
     */
    Range(Document document, RangeImpl.JSRange rangeObj) {
        m_document = document;
        m_range = rangeObj;
    }

    /**
     * Internal function for retrieving the range, external callers should NOT
     * USE THIS
     *
     * @return
     */
    public RangeImpl.JSRange _getJSRange() {
        return m_range;
    }

    /**
     * Internal call to set the range, which skips some checks and settings;
     * this SHOULD NOT be used externally.
     *
     * @param startPoint
     * @param endPoint
     */
    public void _setRange(RangeEndPoint startPoint, RangeEndPoint endPoint) {
        m_document = startPoint == null ? null :
                startPoint.getNode().getOwnerDocument();
        m_startPoint = startPoint;
        m_endPoint = endPoint;
    }

    /**
     * Collapses the range into a cursor, either to the start or end point
     *
     * @param start if true, cursor is the start point, otherwise the end point
     */
    public void collapse(boolean start) {
        if (m_range != null) {
            c_impl.collapse(m_range, start);
            m_startPoint = null;
        } else if (start) {
            m_endPoint = m_startPoint;
        } else {
            m_startPoint = m_endPoint;
        }
    }

    /**
     * Compares an endpoint of this range with an endpoint in another range,
     * returning -1, 0, or 1 depending whether the comparison endpoint comes
     * before, at, or after this endpoint.  how is a constant determining which
     * endpoints to compare, for example Range.START_TO_START.
     *
     * @param compare Range to compare against this one.
     * @param how     constant indicating which endpoints to compare
     * @return -1, 0, or 1 indicating relative order of the endpoints
     */
    public int compareBoundaryPoint(Range compare, short how) {
        ensureRange();
        compare.ensureRange();

        return c_impl.compareBoundaryPoint(m_range, getJSRange(), how);
    }

    /**
     * Make a copy of the contents of this range, into the given element.  All
     * tags required to make the range complete will be included
     *
     * @param copyInto an element to copy the contents into, ie
     *                 DOM.createSpanElement()
     */
    public void copyContents(Element copyInto) {
        ensureRange();
        c_impl.copyContents(m_range, copyInto);
    }

    /**
     * Remove the contents of this range from the DOM.
     */
    public void deleteContents() {
        ensureRange();
        c_impl.deleteContents(m_range);
    }

    public boolean equals(Object obj) {
        boolean res = false;

        try {
            Range cmp = (Range) obj;

            ensureEndPoints();
            cmp.ensureEndPoints();
            res = (cmp == this) ||
                    (m_startPoint.equals(cmp.getStartPoint()) &&
                            m_endPoint.equals(cmp.getEndPoint()));
        } catch (Exception ex) {
        }

        return res;
    }

    /**
     * Place the contents of this range into a new SPAN element, removing them
     * from the DOM.  All tags required to make the range complete will be
     * included.  This does not preserve the element object ids of the contents.
     *
     * @return a new SPAN element unattached to the DOM, containing the range
     *         contents.
     */
    public Element extractContents() {
        Element res = m_document.createSpanElement();
        extractContents(res);
        return res;
    }

    /**
     * Place the contents of this range into the given element, removing them
     * from the DOM.  All tags required to make the range complete will be
     * included.  This does not preserve the element object ids of the contents.
     *
     * @param copyInto an element to extract the contents into, ie
     *                 DOM.createSpanElement()
     */
    public void extractContents(Element copyInto) {
        ensureRange();
        c_impl.extractContents(m_range, copyInto);
    }

    /**
     * Get the element that is the lowest common ancestor of both ends of the
     * range.  In other words, the smallest element that includes the range.
     *
     * @return the element that completely encompasses this range
     */
    public Element getCommonAncestor() {
        ensureRange();
        return c_impl.getCommonAncestor(m_range);
    }

    /**
     * Gets a single point of the cursor location if this is a cursor, otherwise
     * returns null.
     *
     * @return the single point if this is a cursor and not a selection
     */
    public RangeEndPoint getCursor() {
        return isCursor() ? m_startPoint : null;
    }

    /**
     * Get the DOM Document this range is within
     *
     * @return document this range is in
     */
    public Document getDocument() {
        return m_document;
    }

    /**
     * Get the end point of the range.  Not a copy, so changing this alters
     * the range.
     *
     * @return the end point object
     */
    public RangeEndPoint getEndPoint() {
        ensureEndPoints();
        return m_endPoint;
    }

    /**
     * Gets an HTML string represnting all elements enclosed by this range.
     *
     * @return An html string of this range
     */
    public String getHtmlText() {
        ensureRange();
        return c_impl.getHtmlText(m_range);
    }

    /**
     * Get the JS object representing this range.  Since it is highly browser
     * dependent, it is not recommended to operate on this
     *
     * @return JavaScriptObject representing this range
     */
    public RangeImpl.JSRange getJSRange() {
        ensureRange();
        return m_range;
    }

    /**
     * Returns a list of all text elements that are part of this range, in order.
     *
     * @return all elements in this range
     */
    public List<Text> getSelectedTextElements() {
        return getSelectedTextElements(m_startPoint.getTextNode(),
                m_endPoint.getTextNode());
    }

    /**
     * Get the start point of the range.  Not a copy, so changing this alters
     * the range.
     *
     * @return the start point object
     */
    public RangeEndPoint getStartPoint() {
        ensureEndPoints();
        return m_startPoint;
    }

    /**
     * Gets the plain text that is enclosed by this range
     *
     * @return A string of the text in this range
     */
    public String getText() {
        ensureRange();
        return c_impl.getText(m_range);
    }

    /**
     * Returns whether this is a cursor, ie the start and end point are equal
     *
     * @return true if start == end
     */
    public boolean isCursor() {
        ensureEndPoints();
        return m_startPoint.equals(m_endPoint);
    }

    /**
     * Minimize the number of text nodes included in this range.  If the start
     * point is at the end of a text node, move it to the beginning of the
     * next text node; vice versa for the end point.  The result should ensure
     * no text nodes with 0 included characters.
     */
    public void minimizeTextNodes() {
        ensureEndPoints();
        m_startPoint.minimizeBoundaryTextNodes(true);
        m_endPoint.minimizeBoundaryTextNodes(false);
    }

    /**
     * TODO NOT IMPLEMENTED YET
     * Move the end points to encompass a boundary type, such as a word.
     *
     * @param topMostNode a Node not to traverse above, or null
     * @param type        unit to move boundary by, such as RangeEndPoint.MOVE_WORD
     */
    public void moveToBoundary(Node topMostNode, short type) {
        ensureEndPoints();
        m_startPoint.move(false, topMostNode, null, type, 1);
        m_endPoint.move(true, topMostNode, null, type, 1);
    }

    /**
     * Sets the range to a point cursor.
     *
     * @param cursorPoint A single endpoint to create a cursor range at
     */
    public void setCursor(RangeEndPoint cursorPoint) {
        setRange(cursorPoint, cursorPoint);
    }

    /**
     * Sets just the end point of the range.  New endPoint must reside within
     * the same document as the current startpoint, and must occur after it.
     *
     * @param startPoint New start point for this range
     */
    public void setEndPoint(RangeEndPoint endPoint) {
        assert ((m_startPoint != null) ||
                (endPoint.getNode().getOwnerDocument() == m_document));
        m_endPoint = endPoint;
        m_range = null;
    }

    /**
     * Sets the range to encompass the given element.  May not work around
     * non-text containing elements.
     *
     * @param element Element to surround by this range
     * @return whether a range can be placed around this element.
     */
    public boolean setRange(Element element) {
        Text firstText = getAdjacentTextElement(element, element, true, false);
        Text lastText = getAdjacentTextElement(element, element, false, false);

        if ((firstText == null) || (lastText == null)) {
            return false;
        }

        setRange(new RangeEndPoint(firstText, 0),
                new RangeEndPoint(lastText, lastText.getLength()));

        return true;
    }

    /**
     * Set the range to be between the two given points.  Both points must be
     * within the same document, and end must come after start.
     *
     * @param startPoint Start point to set the range to
     * @param endPoint   End point to set the range to
     */
    public void setRange(RangeEndPoint startPoint, RangeEndPoint endPoint) {
        assert (startPoint.getNode().getOwnerDocument() ==
                endPoint.getNode().getOwnerDocument());

        _setRange(startPoint, endPoint);
        m_range = null;
    }

    /**
     * Sets just the start point of the range.  New startPoint must reside within
     * the same document as the current endpoint, and must occur before it.
     *
     * @param startPoint New start point for this range
     */
    public void setStartPoint(RangeEndPoint startPoint) {
        assert ((m_endPoint != null) &&
                (startPoint.getNode().getOwnerDocument() == m_document));

        m_startPoint = startPoint;
        m_range = null;
    }

    /**
     * Surround all of the contents of the range with a new SPAN element, which
     * replaces the content in the DOM.  All tags required to make the range
     * complete are included in the child content.  This does not preserve the
     * element object ids of the contents.  The range will surround the new
     * element after this operation.
     *
     * @return The new span element that now surround the contents
     */
    public Element surroundContents() {
        Element res = m_document.createSpanElement();
        surroundContents(res);
        return res;
    }

    /**
     * Surround all of the contents of the range with the given element, which
     * replaces the content in the DOM.  All tags required to make the range
     * complete are included in the child content.  This does not preserve the
     * element object ids of the contents.  The range will surround this
     * element after this operation.
     *
     * @param copyInto an element to place the contents into, which will replace
     *                 them in the DOM after this operation
     */
    public void surroundContents(Element copyInto) {
        ensureRange();
        c_impl.surroundContents(m_range, copyInto);
        setRange(copyInto);
    }

    /**
     * Ensure the end points exists and are consisent with the javascript range
     */
    void ensureEndPoints() {
        if ((m_startPoint == null) || (m_endPoint == null)) {
            c_impl.fillRangePoints(this);
            setupLastEndpoints();
        }
    }

    /**
     * Ensure the javascript range exists and is consistent with the end points
     */
    void ensureRange() {
        if (rangeNeedsUpdate()) {
            m_range = c_impl.createRange(m_document,
                    m_startPoint.getTextNode(),
                    m_startPoint.getOffset(),
                    m_endPoint.getTextNode(),
                    m_endPoint.getOffset());
            setupLastEndpoints();
        }
    }

    private boolean rangeNeedsUpdate() {
        return (m_range == null) ||
                ((m_startPoint != null) &&
                        ((m_lastStartPoint == null) ||
                                !m_lastStartPoint.equals(m_startPoint) ||
                                (m_lastEndPoint == null) ||
                                !m_lastEndPoint.equals(m_endPoint)));
    }

    private void setupLastEndpoints() {
        m_lastStartPoint = new RangeEndPoint(m_startPoint);
        m_lastEndPoint = new RangeEndPoint(m_endPoint);
    }

    /**
     * Set the document this range is contained within
     *
     * @param doc document to set
     */
    private void setDocument(Document doc) {
        if (m_document != doc) {
            m_document = doc;
            m_range = c_impl.createFromDocument(doc);
        }
    }
}
