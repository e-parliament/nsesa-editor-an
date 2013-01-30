package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.VersionTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CoverPage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Preface;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.CollectionBody;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Conclusions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Attachments;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class CollectionStructureComplexType extends AmendableWidgetImpl  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Meta(), new Occurrence(1,1));
            put(new CoverPage(), new Occurrence(0,1));
            put(new Preface(), new Occurrence(0,1));
            put(new CollectionBody(), new Occurrence(1,1));
            put(new Conclusions(), new Occurrence(0,1));
            put(new Attachments(), new Occurrence(0,1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "collectionStructureComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget collectionStructureComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public CollectionStructureComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private VersionTypeSimpleType containsAttr;

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
    public CollectionStructureComplexType containsAttr(final VersionTypeSimpleType containsAttr) {
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
    public CollectionBody getCollectionBody() {
        CollectionBody result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("CollectionBody".equalsIgnoreCase(widget.getType())) {
                result = (CollectionBody)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public CollectionBody setCollectionBody(CollectionBody collectionBodyElem) {
        CollectionBody result = getCollectionBody();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(collectionBodyElem);

        return collectionBodyElem;
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
    /**
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return ALLOWED_SUB_TYPES;
    }

/**
    * Returns the namespace URI of this amendable widget.
    */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("contains", getContainsAttr() != null ? getContainsAttr().value() : null);
        return attrs;
    }
}

