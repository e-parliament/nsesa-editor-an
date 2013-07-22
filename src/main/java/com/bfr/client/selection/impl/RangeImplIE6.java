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
package com.bfr.client.selection.impl;

import com.bfr.client.selection.Range;
import com.bfr.client.selection.RangeEndPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.Text;

/**
 * IE implementation of range, which emulates the methods of the W3C standard.
 * IE's range object doesn't have any methods for directly getting/setting
 * the end points to structural elements of the DOM, so we have to incrementally
 * search/modify ranges to intiut this.
 *
 * @author John Kozura
 */
public class RangeImplIE6 extends RangeImpl {
    private static final String[] BOUNDARY_STRINGS =
            {
                    "StartToStart", "StartToEnd", "EndToEnd", "EndToStart"
            };

    // Used for deleting/replacing values of a range
    private static final String REPLACING_STRING = "DeL3EteTh1s";

    private static Document m_lastDocument = null;

    private static Element m_testElement;

    @Override
    public native JSRange cloneRange(JSRange range)
    /*-{
        return range.duplicate();
    }-*/;

    @Override
    public int compareBoundaryPoint(JSRange range, JSRange compare, short how) {
        return compareBoundaryPoint(range, compare, BOUNDARY_STRINGS[how]);
    }

    public native int compareBoundaryPoint(JSRange range,
                                           JSRange compare,
                                           String how)
    /*-{
        return range.compareEndPoints(how, compare);
    }-*/;

    /**
     * For IE, do this by copying the HTML string
     *
     * @see com.bfr.client.selection.impl.RangeImpl#copyContents(com.bfr.client.selection.impl.RangeImpl.JSRange, com.google.gwt.dom.client.Element)
     */
    @Override
    public void copyContents(JSRange range, Element copyInto) {
        copyInto.setInnerHTML(getHtmlText(range));
    }

    @Override
    public native RangeImpl.JSRange createFromDocument(Document doc)
    /*-{
        return doc.body.createTextRange();
    }-*/;

    @Override
    public JSRange createRange(Document doc,
                               Text startPoint,
                               int startOffset,
                               Text endPoint,
                               int endOffset) {
    /*
    * IE code to make this work - create a range on the start and the end
	* point, then move the end point to include the second
	*/
        JSRange res = createRangeOnText(startPoint, startOffset);
        if (startPoint == endPoint) {
            // Shortcut if the start and end texts are the same
            moveEndCharacter(res, endOffset - startOffset);
        } else {
            JSRange endRange = createRangeOnText(endPoint, endOffset);
            moveRangePoint(res, endRange, BOUNDARY_STRINGS[Range.END_TO_END]);
        }

        return res;
    }

    /**
     * IE has no function for doing this with a range vs with a selection, so
     * instead use pasteHTML, then remove the resulting element.
     *
     * @see com.bfr.client.selection.impl.RangeImpl#deleteContents(com.bfr.client.selection.impl.RangeImpl.JSRange)
     */
    @Override
    public void deleteContents(JSRange range) {
        Text txt = placeholdRange(range);
        if (txt != null) {
            txt.removeFromParent();
        }
    }

    @Override
    public void extractContents(JSRange range, Element copyInto) {
        copyContents(range, copyInto);
        deleteContents(range);
    }

    @Override
    public void fillRangePoints(Range range) {
        JSRange selRange = range._getJSRange();
        if (selRange == null) {
            return;
        }
        RangeEndPoint start = getRangeEndPoint(range, selRange, true);
        RangeEndPoint end = getRangeEndPoint(range, selRange, false);

        canonicalize(start, end);

        range._setRange(start, end);
    }

    /**
     * Place to put any final checks and corrections to result in a consistent
     * cursor.  Either of the range points passed may be modified by this
     * function.
     *
     * @param start Start range point to check
     * @param end   End range point to check
     */
    private void canonicalize(RangeEndPoint start, RangeEndPoint end) {
        if (start != null) {
            // This checks if the cursor is at the end of one text range, and
            // the beginning of the next, as IE will do this for adjacent nodes..
            if ((start.getTextNode() != null) &&
                    (start.getTextNode().getNextSibling() == end.getTextNode()) &&
                    (start.getTextNode().getLength() == start.getOffset()) &&
                    (end.getOffset() == 0)) {
                end.setTextNode(start.getTextNode(), false);
            }
        }
    }

    @Override
    public native Element getCommonAncestor(JSRange range)
    /*-{
        return range.parentElement();
    }-*/;

    @Override
    public native String getHtmlText(JSRange range)
    /*-{
        return range.htmlText;
    }-*/;

    @Override
    public native String getText(JSRange range)
    /*-{
        return range.text;
    }-*/;

    /**
     * For IE, do this by copying the contents, then creating a dummy element
     * and replacing it with this element.
     *
     * @see com.bfr.client.selection.impl.RangeImpl#surroundContents(com.bfr.client.selection.impl.RangeImpl.JSRange, com.google.gwt.dom.client.Element)
     */
    @Override
    public void surroundContents(JSRange range, Element copyInto) {
        copyContents(range, copyInto);
        Text txt = placeholdRange(range);
        if (txt != null) {
            txt.getParentElement().replaceChild(copyInto, txt);
        }
    }

    private native void collapseRange(JSRange range, boolean start)
    /*-{
        range.collapse(start);
    }-*/;

    /**
     * Create a 0-width js range on the first text element of this parent.
     *
     * @param parent
     * @return
     */
    private native JSRange createRangeOnFirst(Element parent)
    /*-{
        var res = parent.ownerDocument.body.createTextRange();
        res.moveToElementText(parent);
        res.collapse(true);
        return res;
    }-*/;

    /**
     * Create a new range with a range that has its start and end point within
     * the given text and at the given offset.  This emulates capabilities of
     * the W3C standard..
     *
     * @param setText
     * @param offset
     * @return
     */
    private JSRange createRangeOnText(Text setText, int offset) {
        Element parent = setText.getParentElement();
        JSRange res = createRangeOnFirst(parent);
        Element testElement = getTestElement(parent.getOwnerDocument());

        // Can't directly select the text, but we can select a fake element
        // before it, then move the selection...
        try {
            parent.insertBefore(testElement, setText);
            moveToElementText(res, testElement);
            moveCharacter(res, offset);
        } finally {
            // Ensure the test element gets removed from the document
            testElement.removeFromParent();
        }

        return res;
    }

    /**
     * Get the IE start or end point of the given range, have to search for it
     * to find it properly.
     *
     * @param range    used to get the document
     * @param selRange the selection we are getting the point of
     * @param start    whether to get the start or end point
     * @return RangeEndPoint representing this, or null on error
     */
    private RangeEndPoint getRangeEndPoint(Range range,
                                           JSRange selRange,
                                           boolean start) {
        RangeEndPoint res = null;

        // Create a cursor at either the beginning or end of the range, to
        // get that point's immediate parent
        JSRange checkRange = cloneRange(selRange);
        collapseRange(checkRange, start);
        Element parent = getCommonAncestor(checkRange);

        String compareFcn =
                BOUNDARY_STRINGS[start ? Range.START_TO_START : Range.END_TO_END];

        Node compNode;

        // Test element we move around the document to check relative selection
        Element testElement = getTestElement(range.getDocument());

        try {
            // Move the test element backwards past nodes until we are in front
            // of the desired range endpoint
            for (compNode = parent.getLastChild();
                 compNode != null;
                 compNode = testElement.getPreviousSibling()) {
                parent.insertBefore(testElement, compNode);
                moveToElementText(checkRange, testElement);
                if (compareBoundaryPoint(checkRange, selRange, compareFcn) <= 0) {
                    break;
                }
            }

            if (compNode == null) {
                // Sometimes selection at beginning of a span causes a fail
                compNode = testElement.getNextSibling();
            }

            if (compNode == null) {
            } else if (compNode.getNodeType() == Node.ELEMENT_NODE) {
                // We only represent text elements right now, so if this is not
                // then go find one.  Check if the desired selection is at the
                // beginning or end of this element, first select the entire
                // element to determine whether the endpoint is at the
                // beginning or the end of it, ie whether to look forward or
                // backward.
                testElement.removeFromParent();
                moveToElementText(checkRange, (Element) compNode);
                int cmp = compareBoundaryPoint(checkRange, selRange,
                        compareFcn);
                boolean dir = (cmp == 0) ? !start : (cmp < 0);
                Text closest = Range.getAdjacentTextElement(compNode, parent,
                        dir, true);
                if (closest == null) {
                    dir = !dir;
                    closest = Range.getAdjacentTextElement(compNode, parent,
                            dir, true);
                }

                if (closest != null) {
                    // Found a text node in one direction or the other
                    res = new RangeEndPoint(closest,
                            dir ? 0 : closest.getLength());
                }
            } else {
                // Get the proper offset, move the end of the check range to the
                // boundary of the actual range and get its length
                moveRangePoint(checkRange, selRange,
                        BOUNDARY_STRINGS[start ? Range.END_TO_START
                                : Range.END_TO_END]);
                res = new RangeEndPoint((Text) compNode,
                        getText(checkRange).length());
            }
        } catch (Exception ex) {
            GWT.log("Failed to find IE selection", ex);
        } finally {
            // Make sure this gets removed from the document no matter what
            testElement.removeFromParent();
        }

        return (res == null) ? new RangeEndPoint() : res;
    }

    private Element getTestElement(Document document) {
        // Create an element to search for the cursor with, cache it so we
        // don't create a ton of these unnecessarily
        if (document != m_lastDocument) {
            m_lastDocument = document;
            m_testElement = m_lastDocument.createDivElement();
        }
        return m_testElement;
    }

    /**
     * Move both the start and end point of this range
     */
    private native int moveCharacter(JSRange range, int chars)
    /*-{
        return range.move("character", chars);
    }-*/;

    /**
     * Move just the end point of this range
     */
    private native int moveEndCharacter(JSRange range, int chars)
    /*-{
        return range.moveEnd("character", chars);
    }-*/;

    private native void moveRangePoint(JSRange range,
                                       JSRange moveTo,
                                       String how)
    /*-{
        range.setEndPoint(how, moveTo);
    }-*/;

    private native void moveToElementText(JSRange range, Element element)
    /*-{
        range.moveToElementText(element);
    }-*/;

    private native void placeholdPaste(JSRange range, String str)
    /*-{
        range.pasteHTML(str);
    }-*/;

    /**
     * Since there's no good delete for an arbitrary range, simply replace it
     * with this text that nobody would use, then go find it so we can
     * delete or replace it in other functions.  This depends on IE creating a
     * single text element that includes exactly this string (and no user also
     * has this exact text on their page..)
     * <p/>
     * An alternative but far more complicated method would be to try to do
     * this via setting the selection, doing the delete/replace, and then
     * restoring the selection.
     *
     * @param range The range to replace with a text node
     * @return the text node that replaced the contents of range
     */
    private Text placeholdRange(JSRange range) {
        // Paranoid, include a random number to reduce chance this string
        // would occur in the text..
        String replaceString = REPLACING_STRING +
                (int) (Integer.MAX_VALUE * Math.random());

        Element parent = getCommonAncestor(range);
        placeholdPaste(range, replaceString);

        Text res;
        for (res = Range.getAdjacentTextElement(parent, true);
             res != null;
             res = Range.getAdjacentTextElement(res, true)) {
            if (replaceString.equals(res.getData())) {
                break;
            }
        }
        return res;
    }
}
