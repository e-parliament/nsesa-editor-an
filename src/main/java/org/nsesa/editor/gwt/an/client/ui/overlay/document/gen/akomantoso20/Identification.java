package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class Identification extends AmendableWidgetImpl {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "identification");
        span.setClassName("widget identification");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Identification() {
        super(create());
        setType("identification");
    }

    public Identification(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType sourceAttr;

    public FRBRWork getFRBRWork() {
        FRBRWork result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRWork".equalsIgnoreCase(widget.getType())) {
                result = (FRBRWork) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRWork setFRBRWork(FRBRWork FRBRWorkElem) {
        FRBRWork result = getFRBRWork();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRWorkElem);

        return FRBRWorkElem;
    }

    public FRBRExpression getFRBRExpression() {
        FRBRExpression result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRExpression".equalsIgnoreCase(widget.getType())) {
                result = (FRBRExpression) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRExpression setFRBRExpression(FRBRExpression FRBRExpressionElem) {
        FRBRExpression result = getFRBRExpression();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRExpressionElem);

        return FRBRExpressionElem;
    }

    public FRBRManifestation getFRBRManifestation() {
        FRBRManifestation result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRManifestation".equalsIgnoreCase(widget.getType())) {
                result = (FRBRManifestation) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRManifestation setFRBRManifestation(FRBRManifestation FRBRManifestationElem) {
        FRBRManifestation result = getFRBRManifestation();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRManifestationElem);

        return FRBRManifestationElem;
    }

    public FRBRItem getFRBRItem() {
        FRBRItem result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FRBRItem".equalsIgnoreCase(widget.getType())) {
                result = (FRBRItem) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public FRBRItem setFRBRItem(FRBRItem FRBRItemElem) {
        FRBRItem result = getFRBRItem();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(FRBRItemElem);

        return FRBRItemElem;
    }

    public AnyURISimpleType getSourceAttr() {
        if (sourceAttr == null) {
            sourceAttr = new AnyURISimpleType();
            sourceAttr.setValue(getElement().getAttribute("source"));
        }

        return sourceAttr;
    }

    //DSL Style get value
    public AnyURISimpleType sourceAttr() {
        return getSourceAttr();
    }

    public void setSourceAttr(final AnyURISimpleType sourceAttr) {
        this.sourceAttr = sourceAttr;
    }

    //DSL Style set value
    public Identification sourceAttr(final AnyURISimpleType sourceAttr) {
        setSourceAttr(sourceAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"FRBRManifestation", "FRBRWork", "FRBRItem", "FRBRExpression"};
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
        attrs.put("source", getSourceAttr() != null ? getSourceAttr().getValue() : null);
        return attrs;
    }
}

