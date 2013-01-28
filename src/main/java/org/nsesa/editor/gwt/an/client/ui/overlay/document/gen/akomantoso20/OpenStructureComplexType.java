package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.VersionTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CoverPage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Preface;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Preamble;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MainBody;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Conclusions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Attachments;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class OpenStructureComplexType extends AmendableWidgetImpl  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "openStructureComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget openStructureComplexType");
return span;
}

// CONSTRUCTORS ------------------

public OpenStructureComplexType(Element element) {
super(element);
}

// FIELDS ------------------
private VersionTypeSimpleType containsAttr;
private StringSimpleType nameAttr;

        public VersionTypeSimpleType getContainsAttr() {
        if (containsAttr == null) {
                containsAttr = VersionTypeSimpleType.fromString(getElement().getAttribute("contains"));
        }

        return containsAttr;
        }
        //DSL Style get value
        public VersionTypeSimpleType containsAttr() {
        return  getContainsAttr();
        }

        public void setContainsAttr(final VersionTypeSimpleType containsAttr) {
        this.containsAttr = containsAttr;
        }
        //DSL Style set value
        public OpenStructureComplexType containsAttr(final VersionTypeSimpleType containsAttr) {
        setContainsAttr(containsAttr);
        return this;
        }
            public Meta getMeta() {
                Meta result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Meta".equalsIgnoreCase(widget.getType())) {
            result = (Meta)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Meta setMeta(Meta metaElem) {
                    Meta result = getMeta();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(metaElem);

                return metaElem;
            }
            public CoverPage getCoverPage() {
                CoverPage result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("CoverPage".equalsIgnoreCase(widget.getType())) {
            result = (CoverPage)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public CoverPage setCoverPage(CoverPage coverPageElem) {
                    CoverPage result = getCoverPage();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(coverPageElem);

                return coverPageElem;
            }
            public Preface getPreface() {
                Preface result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Preface".equalsIgnoreCase(widget.getType())) {
            result = (Preface)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Preface setPreface(Preface prefaceElem) {
                    Preface result = getPreface();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(prefaceElem);

                return prefaceElem;
            }
            public Preamble getPreamble() {
                Preamble result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Preamble".equalsIgnoreCase(widget.getType())) {
            result = (Preamble)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Preamble setPreamble(Preamble preambleElem) {
                    Preamble result = getPreamble();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(preambleElem);

                return preambleElem;
            }
            public MainBody getMainBody() {
                MainBody result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MainBody".equalsIgnoreCase(widget.getType())) {
            result = (MainBody)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public MainBody setMainBody(MainBody mainBodyElem) {
                    MainBody result = getMainBody();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(mainBodyElem);

                return mainBodyElem;
            }
            public Conclusions getConclusions() {
                Conclusions result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Conclusions".equalsIgnoreCase(widget.getType())) {
            result = (Conclusions)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Conclusions setConclusions(Conclusions conclusionsElem) {
                    Conclusions result = getConclusions();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(conclusionsElem);

                return conclusionsElem;
            }
            public Attachments getAttachments() {
                Attachments result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Attachments".equalsIgnoreCase(widget.getType())) {
            result = (Attachments)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Attachments setAttachments(Attachments attachmentsElem) {
                    Attachments result = getAttachments();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(attachmentsElem);

                return attachmentsElem;
            }
        public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
                nameAttr = new StringSimpleType();
                nameAttr.setValue(getElement().getAttribute("name"));
        }

        return nameAttr;
        }
        //DSL Style get value
        public StringSimpleType nameAttr() {
        return  getNameAttr();
        }

        public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
        }
        //DSL Style set value
        public OpenStructureComplexType nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"attachments","conclusions","coverPage","mainBody","meta","preamble","preface"};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("contains", getContainsAttr() != null ? getContainsAttr().value() : null);
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
return attrs;
}
}

