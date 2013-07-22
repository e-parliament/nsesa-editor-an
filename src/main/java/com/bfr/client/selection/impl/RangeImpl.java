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
import com.bfr.client.selection.Selection;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.Text;

/**
 * Generic implementation of the Range object, using the W3C standard
 * implemented by Firefox, Safari, and Opera.
 *
 * @author John Kozura
 */
public class RangeImpl {
    // For convenience of maintaining JS range objects
    public static class JSRange extends JavaScriptObject {
        protected JSRange() {
        }
    }

    /**
     * Reads an object's property as an integer value.
     *
     * @param object       The object
     * @param propertyName The name of the property being read
     * @return The value
     */
    public native static int getIntProp(JavaScriptObject object,
                                        String propertyName) 
    /*-{
        var value = object[ propertyName ];
        return value;
    }-*/;

    /**
     * Reads an object given a property and returns it as a JavaScriptObject
     *
     * @param object
     * @param propertyName
     * @return the object
     */
    private native static JavaScriptObject getProperty(JavaScriptObject object,
                                                       String propertyName)
    /*-{
        var value = object[ propertyName ];
        return value || null;
    }-*/;

    ;

    /**
     * Make a copy of the given js range; the new JS range is decoupled from any
     * changes.
     *
     * @param range a js range to copy
     * @return a full copy of the range
     */
    public native JSRange cloneRange(JSRange range)
    /*-{
        return range.cloneRange();
    }-*/;

    /**
     * Collapse a JS range object to the start or end point
     *
     * @param range js range to collapse
     * @param start if true, collapse to start, otherwise to end
     */
    public native void collapse(JSRange range, boolean start)
    /*-{
        range.collapse(start);
    }-*/;

    /**
     * Compare endpoints of 2 ranges, returning -1, 0, or 1 depending on whether
     * the compare endpoint comes before, at, or after the range endpoint.
     *
     * @param range   range to compare against
     * @param compare range to compare
     * @param how     a constant to choose which endpoint of each range to compare,
     *                i.e. Range.START_TO_END
     * @return -1, 0, or 1 depending on order of the 2 ranges
     */
    public native int compareBoundaryPoint(JSRange range,
                                           JSRange compare,
                                           short how)
    /*-{
        return range.compareBoundaryPoints(compare, how);
    }-*/;

    /**
     * Copy the contents of the range into the given element, including any
     * tags needed to make it complete.  The DOM is not changed.
     *
     * @param range    js range to copy contents out of.
     * @param copyInto an element to copy these contents into
     */
    public native void copyContents(JSRange range, Element copyInto)
    /*-{
        copyInto.appendChild(range.cloneContents());
    }-*/;

    /**
     * Create an empty JS range from a document
     *
     * @param doc DOM document
     * @return a new empty JS range
     */
    public native JSRange createFromDocument(Document doc)
    /*-{
        return doc.createRange();
    }-*/;

    /**
     * Create a JS range with the given endpoints
     *
     * @param startPoint  Start text of the selection
     * @param startOffset offset into start text
     * @param endPoint    End text of the selection
     * @param endOffset   offset into end text
     * @return A javascript object of this range
     */
    public native JSRange createRange(Document doc,
                                      Text startPoint,
                                      int startOffset,
                                      Text endPoint,
                                      int endOffset)
    /*-{
        var range = doc.createRange();

        range.setStart(startPoint, startOffset);
        range.setEnd(endPoint, endOffset);

        return range;
    }-*/;

    /**
     * Remove the contents of the js range from the DOM
     *
     * @param range js range to remove
     */
    public native void deleteContents(JSRange range)
    /*-{
        range.deleteContents();
    }-*/;

    /**
     * Extract the contents of the range into the given element, removing them
     * from the DOM.  Any tags needed to make the contents complete are included.
     * Element object ids are not maintained.
     *
     * @param range    js range to extract contents from
     * @param copyInto an element to extract these contents into
     */
    public native void extractContents(JSRange range, Element copyInto)
    /*-{
        copyInto.appendChild(range.extractContents());
    }-*/;

    /**
     * Fill the start and end point of a Range object, using the javascript
     * range.
     *
     * @param fillRange range object to set the endpoints of
     */
    public void fillRangePoints(Range fillRange) {
        JSRange jsRange = fillRange._getJSRange();

        Node startNode = getProperty(jsRange, Selection.START_NODE).cast();
        int startOffset = getIntProp(jsRange, Selection.START_OFFSET);
        RangeEndPoint startPoint = findTextPoint(startNode, startOffset);

        Node endNode = getProperty(jsRange, Selection.END_NODE).cast();
        int endOffset = getIntProp(jsRange, Selection.END_OFFSET);
        RangeEndPoint endPoint = findTextPoint(endNode, endOffset);

        fillRange._setRange(startPoint, endPoint);

    }

    /**
     * Get lowest common ancestor element of the given js range
     *
     * @param range js range to get ancestor element of
     * @return the lowest element that completely encompasses the range
     */
    public native Element getCommonAncestor(JSRange range)
    /*-{
        return range.commonAncestorContainer;
    }-*/;

    /**
     * Get the complete html fragment enclosed by this range.  Ensures that all
     * opening and closing tags are included.
     *
     * @param range js range to get the html of
     * @return an html string of the range
     */
    public native String getHtmlText(JSRange range)
    /*-{
        var parent = range.startContainer.ownerDocument.createElement("span");
        this.@com.bfr.client.selection.impl.RangeImpl::copyContents(Lcom/bfr/client/selection/impl/RangeImpl$JSRange;Lcom/google/gwt/dom/client/Element;)(range, parent);
        return parent.innerHTML;
    }-*/;

    /**
     * Get the pure text that is included in a js range
     *
     * @param range js range to get the text of
     * @return string of the range's text
     */
    public native String getText(JSRange range)
    /*-{
        return range.toString();
    }-*/;

    /**
     * Surround the contents of the range with the given element, and put the
     * element in their place.  Any tags needed to make the contents complete
     * are included.  Element object ids are not maintained.
     *
     * @param range    js range to surround with this element
     * @param copyInto element to surround the range's contents with
     */
    public native void surroundContents(JSRange range, Element copyInto)
    /*-{
        copyInto.appendChild(range.extractContents());
        range.insertNode(copyInto);
    }-*/;

    /**
     * If the found range is not on a text node, this finds the cooresponding
     * text node to where the selection is.  If it is on a text node, just
     * directly creates the endpoint from it.
     *
     * @param node   node returned as an endpoint of a range
     * @param offset offset returned to the endpoint of a range
     * @return A range end point with a proper (or null) text node
     */
    private RangeEndPoint findTextPoint(Node node, int offset) {
        RangeEndPoint res;
        if (node.getNodeType() == Node.TEXT_NODE) {
            res = new RangeEndPoint((Text) node, offset);
        } else {
            // search backwards unless this is after the last node
            boolean dir = offset >= node.getChildCount();
            Node child = (node.getChildCount() == 0) ? node :
                    node.getChild(dir ? offset - 1 : offset);
            // Get the previous/next text node
            Text text = Range.getAdjacentTextElement(child, dir);
            if (text == null) {
                // If we didn't find a text node in the preferred direction,
                // try the other direction
                dir = !dir;
                text = Range.getAdjacentTextElement(child, dir);
            }
            res = new RangeEndPoint(text, dir);
        }
        return res;
    }
}
