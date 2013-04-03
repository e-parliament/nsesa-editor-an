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
package org.nsesa.editor.gwt.an.common.server.service.gwt;

import org.nsesa.editor.gwt.core.client.service.gwt.GWTService;
import org.nsesa.editor.gwt.core.shared.ClientContext;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.nsesa.server.service.api.PersonService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Date: 24/06/12 19:57
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class GWTServiceImpl extends SpringRemoteServiceServlet implements GWTService {

    private PersonService personService;

    final static Map<String, PersonDTO> personDB = new HashMap<String, PersonDTO>(){
        {
            put("1", new PersonDTO("1", "mep1", "mep1", "MEP"));
            put("2", new PersonDTO("2", "mep2", "mep2", "MEP"));
            put("3", new PersonDTO("3", "mep3", "mep3", "MEP"));
        }
    };

    @Override
    public ClientContext authenticate(final ClientContext clientContext) {
        String username = clientContext.getParameter("u") != null ? clientContext.getParameter("u")[0] : null;
        org.nsesa.server.dto.PersonDTO backend;
        if (username != null) {
            // see if we can find a person by the username (will be created if it does not yet exist)
            backend = personService.getPersonByUsername(username);
        }
        else {
            // create a new person based on a random UUID username
            backend = personService.getPersonByUsername(UUID.randomUUID().toString());
        }

        PersonDTO person = fromBackend(backend);

        clientContext.setLoggedInPerson(person);
        clientContext.setRoles(new String[]{"GUEST"});
        clientContext.setDocumentIDs(clientContext.getParameter(ClientContext.DOCUMENT_ID));
        return clientContext;
    }

    @Override
    public PersonDTO getPerson(ClientContext clientContext, String id) {
        final org.nsesa.server.dto.PersonDTO backend = personService.getPerson(id);
        if (backend != null) {
            return fromBackend(backend);
        }
        return null;
    }

    private PersonDTO fromBackend(org.nsesa.server.dto.PersonDTO backend) {
        return new PersonDTO(backend.getPersonID(), backend.getUsername(), backend.getName(), backend.getLastName());
    }

    private org.nsesa.server.dto.PersonDTO toBackend(PersonDTO personDTO) {
        return new org.nsesa.server.dto.PersonDTO(
                personDTO.getId(),
                personDTO.getUsername(),
                personDTO.getName(),
                personDTO.getLastName());
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
