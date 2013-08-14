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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.Akomantoso20OverlayLocalizableResource;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.Csd02OverlayLocalizableResource;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayLocalizableResource;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

/**
 * An overlay resource that supports both AN 2.0 and 3.0 via the namespace.
 * Date: 12/08/13 15:07
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
public class CompositeOverlayLocalizableResource extends DefaultOverlayLocalizableResource {
    private final Akomantoso20OverlayLocalizableResource akomantoso20OverlayLocalizableResource;
    private final Csd02OverlayLocalizableResource csd02OverlayLocalizableResource;

    @Inject
    public CompositeOverlayLocalizableResource(Akomantoso20OverlayLocalizableResource akomantoso20OverlayLocalizableResource, Csd02OverlayLocalizableResource csd02OverlayLocalizableResource) {
        this.akomantoso20OverlayLocalizableResource = akomantoso20OverlayLocalizableResource;
        this.csd02OverlayLocalizableResource = csd02OverlayLocalizableResource;
    }

    @Override
    public String getName(final OverlayWidget widget) {
        if (widget.getNamespaceURI().equals(akomantoso20OverlayLocalizableResource.getNamespaceURI()))
            return akomantoso20OverlayLocalizableResource.getName(widget);
        else if (widget.getNamespaceURI().equals(csd02OverlayLocalizableResource.getNamespaceURI()))
            return csd02OverlayLocalizableResource.getName(widget);
        return super.getName(widget);
    }

    @Override
    public String getDescription(final OverlayWidget widget) {
        if (widget.getNamespaceURI().equals(akomantoso20OverlayLocalizableResource.getNamespaceURI()))
            return akomantoso20OverlayLocalizableResource.getDescription(widget);
        else if (widget.getNamespaceURI().equals(csd02OverlayLocalizableResource.getNamespaceURI()))
            return csd02OverlayLocalizableResource.getDescription(widget);
        return super.getDescription(widget);
    }
}
