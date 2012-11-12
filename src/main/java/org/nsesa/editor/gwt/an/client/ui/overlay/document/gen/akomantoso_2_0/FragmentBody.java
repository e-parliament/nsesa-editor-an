package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.FragmentBodyTypeComplexType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class FragmentBody extends FragmentBodyTypeComplexType  {

// CONSTRUCTORS ------------------
public FragmentBody(Element element) {
    super(element);
}

// FIELDS ------------------

/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"tome","subparagraph","paragraph","subsection","debateSection","div","resolutions","personalStatements","oralStatements","title","chapter","division","rollCall","alinea","declarationOfVote","adjournment","petitions","subchapter","administrationOfOath","indent","communication","noticesOfMotion","subclause","questions","papers","list","sublist","section","proceduralMotions","point","article","subpart","address","nationalInterest","container","writtenStatements","hcontainer","book","subtitle","pointOfOrder","prayers","ministerialStatements","part","clause"};
    return  subtypes;
}
}

