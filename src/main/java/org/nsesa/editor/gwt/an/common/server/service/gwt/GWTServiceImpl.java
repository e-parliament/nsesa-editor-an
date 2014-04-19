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

import com.inspiresoftware.lib.dto.geda.adapter.ValueConverter;
import com.inspiresoftware.lib.dto.geda.assembler.Assembler;
import com.inspiresoftware.lib.dto.geda.assembler.DTOAssembler;
import com.inspiresoftware.lib.dto.geda.assembler.dsl.impl.DefaultDSLRegistry;
import org.nsesa.editor.gwt.core.client.service.gwt.GWTService;
import org.nsesa.editor.gwt.core.shared.ClientContext;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.nsesa.server.service.api.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.Principal;
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

    @Autowired
    PersonService personService;

    @Autowired
    ValueConverter groupConvertor;

    final Assembler personAssembler = DTOAssembler.newAssembler(PersonDTO.class, org.nsesa.server.dto.PersonDTO.class);

    @Override
    public ClientContext authenticate(final ClientContext clientContext) {
        final Principal principal = perThreadRequest.get().getUserPrincipal();

        if (principal == null) throw new SecurityException("No principal found? Is JAAS configured correctly?");

        org.nsesa.server.dto.PersonDTO backend = personService.getPersonByUsername(principal.getName());

        PersonDTO person = new PersonDTO();
        personAssembler.assembleDto(person, backend, getConvertors(), new DefaultDSLRegistry());

        clientContext.setLoggedInPerson(person);
        clientContext.setRoles(new String[]{"GUEST"});
        clientContext.setDocumentIDs(clientContext.getParameter(ClientContext.DOCUMENT_ID));
        return clientContext;
    }

    @Override
    public PersonDTO getPerson(ClientContext clientContext, String id) {
        final org.nsesa.server.dto.PersonDTO backend = personService.getPerson(id);
        if (backend != null) {
            PersonDTO person = new PersonDTO();
            personAssembler.assembleDto(person, backend, getConvertors(), new DefaultDSLRegistry());
            return person;
        }
        return null;
    }


    private Map<String, Object> getConvertors() {
        final Map<String, Object> map = new HashMap<String, Object>();
        map.put("groupConvertor", groupConvertor);
        return map;
    }
}
