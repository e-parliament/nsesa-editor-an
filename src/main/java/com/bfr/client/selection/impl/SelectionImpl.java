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

import com.bfr.client.selection.Selection;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;

/**
 * Generic implementation of the Selection object, using the W3C standard
 * implemented by Firefox, Safari, and Opera.
 *
 * @author John Kozura
 */
public class SelectionImpl {
    public static class JSSel extends JavaScriptObject {
        protected JSSel() {
        }
    }

    /**
     * Reads an object's property as a boolean value.
     *
     * @param object
     * @param propertyName
     * @return
     */
    private native static boolean getBoolProp(JavaScriptObject object,
                                              String propertyName)
    /*-{
        return !!object[propertyName];
    }-*/;

    /**
     * Clear any selection
     *
     * @param selection
     */
    native public void clear(JSSel selection)
    /*-{
        selection.removeAllRanges();
    }-*/;

    /**
     * Get the JS range representing the current selection.  This should be
     * a range parented by the given document, otherwise NULL is returned.
     *
     * @param doc       document that must be the parent of the selection
     * @param selection selection object to fetch the range for
     * @return A JS object representing the range
     */
    public native RangeImpl.JSRange getJSRange(Document doc, JSSel selection)
    /*-{
        var res = null;
        try {
            res = selection.getRangeAt(0);
        }
        catch (e) {
        }
        return res;
    }-*/;

    /**
     * Get the selection object used for a particular window.
     *
     * @param window a DOM window to get selection for
     * @return The JavaScriptObject for the selection
     */
    public native JSSel getSelection(JavaScriptObject window)
    /*-{
        return window.getSelection();
    }-*/;

    /**
     * Return whether this is an empty selection (ie a cursor)..
     *
     * @param selection
     * @return
     */
    public boolean isEmpty(JSSel selection) {
        return getBoolProp(selection, Selection.IS_COLLAPSED);
    }


    /**
     * Set the document's selection to equal the extends of the given JS range.
     *
     * @param selection JS selection to change
     * @param range     JS range to set the selection to
     */
    public native void setJSRange(JSSel selection, RangeImpl.JSRange range)
    /*-{
        // delete all ranges then recreate...
        selection.removeAllRanges();
        selection.addRange(range);
    }-*/;

}
