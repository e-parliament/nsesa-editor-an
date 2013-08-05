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
package org.nsesa.editor.gwt.an.common.server.service.gwt;

/**
 * Date: 05/08/13 21:23
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
/*
 * Copyright 2013 Jeanfrancois Arcand
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

import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.DefaultBroadcasterFactory;
import org.atmosphere.gwt20.shared.Constants;
import org.atmosphere.handler.AbstractReflectorAtmosphereHandler;
import org.slf4j.Logger;

import java.io.IOException;

/**
 * Atmosphere handler for GWT - based on the example provided by Atmosphere's gwt20-rpc sample.
 */
public class GwtRpcAtmosphereHandler extends AbstractReflectorAtmosphereHandler {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(GwtRpcAtmosphereHandler.class);
    private static final String BROADCASTER_ID = "gwtAtmosphereBroadcaster";

    @Override
    public void onRequest(AtmosphereResource ar) throws IOException {
        if (ar.getRequest().getMethod().equals("GET")) {
            doGet(ar);
        } else if (ar.getRequest().getMethod().equals("POST")) {
            doPost(ar);
        }
    }

    public void doGet(AtmosphereResource ar) {

        // lookup the broadcaster, if not found create it. Name is arbitrary
        ar.setBroadcaster(DefaultBroadcasterFactory.getDefault().lookup(BROADCASTER_ID, true));

        ar.suspend();
    }

    /**
     * receive push message from client
     */
    public void doPost(AtmosphereResource ar) {
        Object msg = ar.getRequest().getAttribute(Constants.MESSAGE_OBJECT);
        if (msg != null) {
            LOG.info("received RPC post: " + msg.toString());
            // for demonstration purposes we will broadcast the message to all connections
            DefaultBroadcasterFactory.getDefault().lookup(BROADCASTER_ID).broadcast(msg);
        }
    }


    @Override
    public void destroy() {

    }

}
