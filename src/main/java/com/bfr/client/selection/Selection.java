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
import com.bfr.client.selection.impl.SelectionImpl;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;

/**
 * A selection within a particular document.  Holds the singleton for a
 * particlar document/window for getting and setting the selection.
 *
 * @author John Kozura
 */
public final class Selection {
    public static final String START_NODE = "startContainer";
    public static final String START_OFFSET = "startOffset";
    public static final String END_NODE = "endContainer";
    public static final String END_OFFSET = "endOffset";
    public static final String IS_COLLAPSED = "isCollapsed";

    /**
     * Clears or removes any current text selection.
     */
    public static void clearAnySelectedText() {
        getSelection().clear();
    }

    /**
     * Convenience for getting the range for the current browser selection
     *
     * @return A range object representing the browser window's selection
     */
    public static Range getBrowserRange() {
        return getSelection().getRange();
    }

    /**
     * Returns the selection for a given window, for instance an iframe
     *
     * @return The singleton instance
     */
    static public Selection getSelection(JavaScriptObject window) {
        SelectionImpl.JSSel jsSel = c_impl.getSelection(window);
        Selection res = new Selection();
        res.m_selection = jsSel;
        res.m_document = getDocument(window);
        return res;
    }

    public static native Document getDocument(JavaScriptObject window)
    /*-{
        return window.document;
    }-*/;

    private SelectionImpl.JSSel m_selection;

    private Document m_document;

    /**
     * The browser aware support that takes care of browser difference nasties.
     */
    private static SelectionImpl c_impl =
            (SelectionImpl) GWT.create(SelectionImpl.class);

    /**
     * Returns the document Selection singleton
     *
     * @return The singleton instance
     */
    static public Selection getSelection() {
        return Selection.getSelection(getWindow());
    }

    static SelectionImpl getImpl() {
        return Selection.c_impl;
    }

    static native private JavaScriptObject getWindow()
    /*-{
        return $wnd;
    }-*/;

    protected Selection() {
        super();
    }

    /**
     * Clears any current selection.
     */
    public void clear() {
        Selection.getImpl().clear(m_selection);
    }

    /**
     * Gets the parent document associated with this selection.  Could be
     * different from the browser document if, for example this is the selection
     * within an iframe.
     *
     * @return parent document of this selection
     */
    public Document getDocument() {
        return m_document;
    }

    /**
     * Get the javascript object representing the selection.  Since this is
     * browser dependent object, should probably not use this.
     *
     * @return a JavaScriptObject representing this selection
     */
    public SelectionImpl.JSSel getJSSelection() {
        return m_selection;
    }

    /**
     * Gets the range associated with the given selection.  The endpoints are
     * captured immediately, so any changes to the selection will not affect
     * the returned range.  In some browsers (IE) this can return NULL if
     * nothing is selected in the document.
     *
     * @return A range object capturing the current selection
     */
    public Range getRange() {
        Range res = null;
        RangeImpl.JSRange jsRange = c_impl.getJSRange(m_document, m_selection);
        if (jsRange != null) {
            res = new Range(m_document, jsRange);
            res.ensureEndPoints();
        }
        return res;
    }

    /**
     * Tests if anything is currently being selected
     *
     * @return True if empty false otherwise
     */
    public boolean isEmpty() {
        return Selection.getImpl().isEmpty(m_selection);
    }

    /**
     * Takes a range object and pushes it to be the new selection.  The range
     * must be parented by the same window/document as the selection.  The range
     * remains separate from the selection after this operation; any changes to
     * the range are not reflected in the selection, and vice versa.
     *
     * @param newSelection What the selection should be
     */
    public void setRange(Range newSelection) {
        if (newSelection.getDocument() == m_document) {
            c_impl.setJSRange(m_selection, newSelection.getJSRange());
        }
    }
}
