/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.server.service.gwt;

import org.joda.time.DateTime;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTService;
import org.nsesa.editor.gwt.core.shared.ClientContext;

/**
 * Date: 24/06/12 19:57
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class GWTServiceImpl extends SpringRemoteServiceServlet implements GWTService {
    @Override
    public ClientContext authenticate(final ClientContext clientContext) {
        clientContext.setPrincipal("user-" + new DateTime().getMillis());
        clientContext.setRoles(new String[]{"USER", "ADMIN"});
        clientContext.setDocumentIDs(clientContext.getParameter(ClientContext.DOCUMENT_ID));
        return clientContext;
    }
}
