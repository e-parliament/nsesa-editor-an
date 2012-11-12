package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.DebateBodyTypeComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class DebateBody extends DebateBodyTypeComplexType  {

// CONSTRUCTORS ------------------
public DebateBody(Element element) {
    super(element);
}

// FIELDS ------------------

/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"petitions","administrationOfOath","communication","debateSection","noticesOfMotion","questions","resolutions","papers","personalStatements","proceduralMotions","oralStatements","rollCall","address","nationalInterest","writtenStatements","declarationOfVote","pointOfOrder","adjournment","prayers","ministerialStatements"};
    return  subtypes;
}
}

