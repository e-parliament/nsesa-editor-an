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
package org.nsesa.editor.app.xsd.model;

import org.junit.Before;
import org.junit.Test;
import org.nsesa.editor.app.xsd.FileClassOverlayGenerator;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertTrue;

/**
 * A test class for <code>FileClassOverlayGenerator</code>.
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 * Date: 15/11/12 11:02
 */
public class AnFileClassOverlayGeneratorTest {

    private final List<OverlayClass> genClasses = new ArrayList<OverlayClass>();

    @Before
    public void init() throws SAXException {
        final List<OverlayClass> result = new ArrayList<OverlayClass>();


        FileClassOverlayGenerator classGenerator = new FileClassOverlayGenerator("", "") {
            public void print() {
                genClasses.addAll(getFlatListWithNoGroups(overlayClassGenerator.getResult()));

            }
        };

        String schema = "akomantoso20.xsd";
        classGenerator.parse(schema);
        classGenerator.analyze();
        classGenerator.print();
    }
    @Test
    public void testConstructorWithRequiredAttributes() throws SAXException {
        //find entity type
        OverlayClass entityClass = null;
        for (OverlayClass overlayClass : genClasses) {
            if (overlayClass.getName().equalsIgnoreCase("entity") &&
                    overlayClass.getNamespaceURI().equals("http://www.akomantoso.org/2.0")) {
                entityClass = overlayClass;
                break;
            }
        }
        boolean foundClass = false;
        //public Entity(StringSimpleType nameAttr, IDSimpleType idAttr, AnyURISimpleType refersToAttr) {
        if (entityClass != null) {
            foundClass = true;
            List<OverlayProperty> list = entityClass.getAllFlatAttributesProperties();
            Map<String, OverlayProperty> reqAttrs = new HashMap<String, OverlayProperty>();
            for(OverlayProperty prop : list) {
                if (prop.isRequired()) {
                    reqAttrs.put(prop.getName(), prop);
                }
            }
            assertTrue(reqAttrs.containsKey("name"));
            assertTrue(reqAttrs.containsKey("id"));
            assertTrue(reqAttrs.containsKey("refersTo"));
        }
        if (!foundClass) {
            throw new RuntimeException("Entity class was not found");
        }

    }

}
