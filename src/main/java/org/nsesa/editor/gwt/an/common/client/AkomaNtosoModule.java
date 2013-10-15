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
package org.nsesa.editor.gwt.an.common.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtosoCreator;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.AkomaNtosoOverlaySnippetFactory;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.CompositeLocator;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.CompositeOverlayFactory;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.Akomantoso20OverlayFactory;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.Csd02OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.*;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlaySnippetFactory;

/**
 * Date: 30/04/13 11:42
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtosoModule extends AbstractGinModule {
    @Override
    protected void configure() {

        bind(OverlayFactory.class).to(CompositeOverlayFactory.class).in(Singleton.class);
        bind(OverlayFactory.class).annotatedWith(Names.named("akomantoso20")).to(Akomantoso20OverlayFactory.class).in(Singleton.class);
        bind(OverlayFactory.class).annotatedWith(Names.named("akomantoso30")).to(Csd02OverlayFactory.class).in(Singleton.class);

        bind(Transformer.class).annotatedWith(Names.named("html")).to(HTMLTransformer.class).in(Singleton.class);
        bind(Transformer.class).annotatedWith(Names.named("xml")).to(DefaultTransformer.class).in(Singleton.class);

        bind(Locator.class).to(CompositeLocator.class).in(Singleton.class);
        bind(Creator.class).to(AkomaNtosoCreator.class).in(Singleton.class);
//        bind(Creator.class).to(SimpleCreator.class).in(Singleton.class);

        bindConstant().annotatedWith(Names.named("caretPositionClassName")).to("caretPosition");

        bind(OverlaySnippetFactory.class).to(AkomaNtosoOverlaySnippetFactory.class).in(Singleton.class);
    }
}
