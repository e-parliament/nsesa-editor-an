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
package org.nsesa.editor.gwt.an.common.server.convertor;

import com.inspiresoftware.lib.dto.geda.adapter.BeanFactory;
import com.inspiresoftware.lib.dto.geda.adapter.ValueConverter;
import org.nsesa.editor.gwt.core.shared.GroupDTO;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Philip Luppens on 23/03/14 22:45.
 * TODO Complete this class documentation.
 */
@Component("groupConvertor")
@Lazy
public class GroupConvertor implements ValueConverter {
    @Override
    public Object convertToDto(Object object, BeanFactory beanFactory) {
        if (object == null) return null;
        if (object instanceof org.nsesa.server.dto.PersonDTO) {
            Set<GroupDTO> shared = new HashSet<GroupDTO>();
            org.nsesa.server.dto.PersonDTO person = (org.nsesa.server.dto.PersonDTO) object;
            for (org.nsesa.server.dto.GroupDTO fromServer : person.getGroups()) {
                shared.add(new GroupDTO(fromServer.getGroupID(), fromServer.getName()));
            }
            return shared;
        }
        return null;
    }

    @Override
    public Object convertToEntity(Object object, Object oldEntity, BeanFactory beanFactory) {
        if (object instanceof PersonDTO) {
            Set<org.nsesa.server.dto.GroupDTO> shared = new HashSet<org.nsesa.server.dto.GroupDTO>();
            PersonDTO person = (PersonDTO) object;
            for (GroupDTO fromClient : person.getGroups()) {
                shared.add(new org.nsesa.server.dto.GroupDTO(fromClient.getGroupID(), fromClient.getName()));
            }
            return shared;
        }
        return null;
    }
}
