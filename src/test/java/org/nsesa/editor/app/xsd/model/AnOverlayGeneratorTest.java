package org.nsesa.editor.app.xsd.model;

import org.junit.Before;
import org.junit.Test;
import org.nsesa.editor.app.xsd.OverlayGenerator;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

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
    public void init()  throws SAXException {
        final List<OverlayClass> result = new ArrayList<OverlayClass>();

        OverlayGenerator generator = new OverlayGenerator() {
            @Override
            public void print() {
                result.add(overlayClassGenerator.getResult());
            }
        };
        String[] schemas = {"xml.xsd", "akomantoso20.xsd"};
        generator.parse(schemas);
        generator.analyze();
        generator.print();
        rootClass = result.get(0);
    }

    @Test
    public void testSchemaNumber()  throws SAXException {
        assertTrue(rootClass.getChildren().size() == 3);

    }

}
