package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Num;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Heading;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subheading;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class BasehierarchyComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public BasehierarchyComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    public Num getNum() {
        Num result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Num".equalsIgnoreCase(widget.getType())) {
                result = (Num)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Num setNum(Num numElem) {
        Num result = getNum();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(numElem);

        return numElem;
    }
    public Heading getHeading() {
        Heading result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Heading".equalsIgnoreCase(widget.getType())) {
                result = (Heading)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Heading setHeading(Heading headingElem) {
        Heading result = getHeading();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(headingElem);

        return headingElem;
    }
    public Subheading getSubheading() {
        Subheading result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subheading".equalsIgnoreCase(widget.getType())) {
                result = (Subheading)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Subheading setSubheading(Subheading subheadingElem) {
        Subheading result = getSubheading();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(subheadingElem);

        return subheadingElem;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"num","subheading","heading"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

}

