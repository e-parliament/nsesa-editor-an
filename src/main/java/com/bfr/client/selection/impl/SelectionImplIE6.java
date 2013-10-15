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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;

/**
 * IE implementation of selection, which emulates the methods of the W3C
 * standard.
 *
 * @author John Kozura
 */
public class SelectionImplIE6 extends SelectionImpl {
    @Override
    public native void clear(JSSel selection)
    /*-{
        selection.empty();
    }-*/;

    /**
     * Get the range, and double check that it is actually parented by this
     * document.  If not, then return null.  Also uses duplicate to ensure that
     * the range is decoupled from the selection.
     *
     * @see com.bfr.client.selection.impl.SelectionImpl#getJSRange(com.google.gwt.dom.client.Document, com.bfr.client.selection.impl.SelectionImpl.JSSel)
     */
    @Override
    public native RangeImpl.JSRange getJSRange(Document doc, JSSel selection)
    /*-{
        var res = selection.createRange();

        var parent = res.parentElement();
        if (parent.ownerDocument == doc) {
            return res.duplicate();
        }
        return null;
    }-*/;

    @Override
    public native JSSel getSelection(JavaScriptObject window)
    /*-{
        return window.document.selection;
    }-*/;

    @Override
    public native boolean isEmpty(JSSel selection)
    /*-{
        return selection.type == "None";
    }-*/;

    @Override
    public native void setJSRange(JSSel selection, RangeImpl.JSRange range)
    /*-{
        range.select();
    }-*/;
}
