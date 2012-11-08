package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CorePropertiesComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ExprPropertiesGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FRBRExpression extends CorePropertiesComplexType  {

// CONSTRUCTORS ------------------
public FRBRExpression(Element element) {
    super(element);
}

// FIELDS ------------------
private ExprPropertiesGroup exprProperties;

public ExprPropertiesGroup getExprProperties() {
return exprProperties;
}

public void setExprProperties(final ExprPropertiesGroup exprProperties) {
this.exprProperties = exprProperties;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"FRBRthis","FRBRalias","exprPropertiesGroup","componentInfo","FRBRuri","FRBRauthor","FRBRdate","preservation"};
    return  subtypes;
}
}

