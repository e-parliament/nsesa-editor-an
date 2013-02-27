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
package org.nsesa.editor.app.xsd.model;

import org.junit.Before;
import org.junit.Test;
import org.nsesa.editor.app.xsd.OverlayGenerator;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * A test class for generator.
 * User: groza
 * Date: 15/11/12
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
public class AnOverlayGeneratorTest {

    private OverlayClass rootClass;

    @Before
    public void init() throws SAXException {
        final List<OverlayClass> result = new ArrayList<OverlayClass>();


        OverlayGenerator generator = new OverlayGenerator() {
            @Override
            public void print() {
                result.add(overlayClassGenerator.getResult());
            }
        };
        String schema = "akomantoso20.xsd";
        generator.parse(schema);
        generator.analyze();
        generator.print();
        rootClass = result.get(0);
    }

    @Test
    public void testSchemaNumber() throws SAXException {
        assertTrue(rootClass.getChildren().size() == 3);

    }

    @Test
    public void testOccurrence() throws SAXException {
        //find hierarchicalStructureComplex types
        List<OverlayClass> stack = new ArrayList<OverlayClass>(rootClass.getChildren());
        OverlayClass hierarchicalStructureClass = null;
        while (stack.size() != 0) {
            OverlayClass overlayClass = stack.remove(0);
            if (overlayClass.getName().equalsIgnoreCase("hierarchicalStructure")) {
                hierarchicalStructureClass = overlayClass;
                break;
            }
            stack.addAll(overlayClass.getChildren());
        }
        boolean foundCoverPage = false;
        if (hierarchicalStructureClass != null) {
            List<OverlayProperty> props = hierarchicalStructureClass.getAllNonAttributesProperties();
            for (OverlayProperty prop : props) {
                //for cover page min occurs is 0 and max occurs is 1
                if (prop.getName().equals("coverPage")) {
                    foundCoverPage = true;
                    assertEquals("Min occurs for cover page is 0", 0, prop.getMinOccurs().intValue());
                    assertEquals("Max occurs for cover page is 1", 1, prop.getMaxOccurs().intValue());
                    break;
                }
            }
        }
        if (!foundCoverPage) {
            throw new RuntimeException("Cover page element in hierarchicalStructure was not found");
        }

    }
}
