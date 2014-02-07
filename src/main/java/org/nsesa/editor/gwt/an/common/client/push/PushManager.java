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
package org.nsesa.editor.gwt.an.common.client.push;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.inject.Singleton;
import org.atmosphere.gwt20.client.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Date: 05/08/13 21:53
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Singleton
public class PushManager {

    private static final Logger logger = Logger.getLogger(PushManager.class.getName());

    private final AtmosphereRequestConfig rpcRequestConfig;
    private final AtmosphereRequest rpcRequest;

    public PushManager() {
        RPCSerializer rpc_serializer = GWT.create(RPCSerializer.class);

        rpcRequestConfig = AtmosphereRequestConfig.create(rpc_serializer);
        rpcRequestConfig.setUrl(GWT.getModuleBaseURL() + "../atmosphere");
        rpcRequestConfig.setTransport(AtmosphereRequestConfig.Transport.WEBSOCKET);
        rpcRequestConfig.setFallbackTransport(AtmosphereRequestConfig.Transport.LONG_POLLING);
        rpcRequestConfig.setOpenHandler(new AtmosphereOpenHandler() {
            @Override
            public void onOpen(AtmosphereResponse response) {
                logger.info("RPC Connection opened");
            }
        });
        rpcRequestConfig.setReopenHandler(new AtmosphereReopenHandler() {
            @Override
            public void onReopen(AtmosphereResponse response) {
                logger.info("RPC Connection reopened");
            }
        });
        rpcRequestConfig.setCloseHandler(new AtmosphereCloseHandler() {
            @Override
            public void onClose(AtmosphereResponse response) {
                logger.info("RPC Connection closed");
            }
        });
        rpcRequestConfig.setMessageHandler(new AtmosphereMessageHandler() {
            @Override
            public void onMessage(AtmosphereResponse response) {
                List<SimpleRPCEvent> messages = response.getMessages();
                for (SimpleRPCEvent event : messages) {
                    logger.info("----> received message through RPC: " + event.getData());
                }
            }
        });
        Atmosphere atmosphere = Atmosphere.create();
        rpcRequest = atmosphere.subscribe(rpcRequestConfig);
    }

    public void send(final SimpleRPCEvent event) {
        try {
            rpcRequest.push(event);
        } catch (SerializationException ex) {
            logger.log(Level.SEVERE, "Failed to serialize message", ex);
        }
    }
}
