/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.event;

import com.bfr.client.selection.Selection;
import com.google.gwt.event.shared.GwtEvent;

/**
 * An event indicating that a selection of some UI text/html elements has been performed by the user.
 * Date: 24/06/12 20:14
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class SelectionEvent extends GwtEvent<SelectionEventHandler> {

    public static final Type<SelectionEventHandler> TYPE = new Type<SelectionEventHandler>();

    private final Selection selection;

    public SelectionEvent(Selection selection) {
        this.selection = selection;
    }

    @Override
    public Type<SelectionEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(SelectionEventHandler handler) {
        handler.onEvent(this);
    }

    public Selection getSelection() {
        return selection;
    }
}
