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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.PopupStructureComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NCNameSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* the element extractStructure is a popup element containing a full structure used as an extract from another document or position. Attribute quote is used to specify the quote character used in the original; no quote attribute implies that the quote is left in the text; quote="" implies that there is no quote character. Attribute for is used in a mmod or rmod to point to the id of the corresponding ref element.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class ExtractStructure extends PopupStructureComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new BlockList())
,        new StructureIndicator.DefaultElement(1,1,new Tblock())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Ul())
,        new StructureIndicator.DefaultElement(1,1,new Ol())
,        new StructureIndicator.DefaultElement(1,1,new Table())
,        new StructureIndicator.DefaultElement(1,1,new P())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Foreign())
,        new StructureIndicator.DefaultElement(1,1,new Block())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new AdministrationOfOath())
,        new StructureIndicator.DefaultElement(1,1,new RollCall())
,        new StructureIndicator.DefaultElement(1,1,new Prayers())
,        new StructureIndicator.DefaultElement(1,1,new OralStatements())
,        new StructureIndicator.DefaultElement(1,1,new WrittenStatements())
,        new StructureIndicator.DefaultElement(1,1,new PersonalStatements())
,        new StructureIndicator.DefaultElement(1,1,new MinisterialStatements())
,        new StructureIndicator.DefaultElement(1,1,new Resolutions())
,        new StructureIndicator.DefaultElement(1,1,new NationalInterest())
,        new StructureIndicator.DefaultElement(1,1,new DeclarationOfVote())
,        new StructureIndicator.DefaultElement(1,1,new Communication())
,        new StructureIndicator.DefaultElement(1,1,new Petitions())
,        new StructureIndicator.DefaultElement(1,1,new Papers())
,        new StructureIndicator.DefaultElement(1,1,new NoticesOfMotion())
,        new StructureIndicator.DefaultElement(1,1,new Questions())
,        new StructureIndicator.DefaultElement(1,1,new Address())
,        new StructureIndicator.DefaultElement(1,1,new ProceduralMotions())
,        new StructureIndicator.DefaultElement(1,1,new PointOfOrder())
,        new StructureIndicator.DefaultElement(1,1,new Adjournment())
,        new StructureIndicator.DefaultElement(1,1,new DebateSection())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new Div())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Container())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Clause())
,        new StructureIndicator.DefaultElement(1,1,new Section())
,        new StructureIndicator.DefaultElement(1,1,new Part())
,        new StructureIndicator.DefaultElement(1,1,new Paragraph())
,        new StructureIndicator.DefaultElement(1,1,new Chapter())
,        new StructureIndicator.DefaultElement(1,1,new Title())
,        new StructureIndicator.DefaultElement(1,1,new Article())
,        new StructureIndicator.DefaultElement(1,1,new Book())
,        new StructureIndicator.DefaultElement(1,1,new Tome())
,        new StructureIndicator.DefaultElement(1,1,new Division())
,        new StructureIndicator.DefaultElement(1,1,new List())
,        new StructureIndicator.DefaultElement(1,1,new Point())
,        new StructureIndicator.DefaultElement(1,1,new Indent())
,        new StructureIndicator.DefaultElement(1,1,new Alinea())
,        new StructureIndicator.DefaultElement(1,1,new Subsection())
,        new StructureIndicator.DefaultElement(1,1,new Subpart())
,        new StructureIndicator.DefaultElement(1,1,new Subparagraph())
,        new StructureIndicator.DefaultElement(1,1,new Subchapter())
,        new StructureIndicator.DefaultElement(1,1,new Subtitle())
,        new StructureIndicator.DefaultElement(1,1,new Subclause())
,        new StructureIndicator.DefaultElement(1,1,new Sublist())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Hcontainer())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Content())
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new SpeechGroup())
,        new StructureIndicator.DefaultElement(1,1,new Speech())
,        new StructureIndicator.DefaultElement(1,1,new Question())
,        new StructureIndicator.DefaultElement(1,1,new Answer())
,        new StructureIndicator.DefaultElement(1,1,new Other())
,        new StructureIndicator.DefaultElement(1,1,new Scene())
,        new StructureIndicator.DefaultElement(1,1,new Narrative())
,        new StructureIndicator.DefaultElement(1,1,new Summary())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Formula())
,        new StructureIndicator.DefaultElement(1,1,new Recitals())
,        new StructureIndicator.DefaultElement(1,1,new Citations())
,        new StructureIndicator.DefaultElement(1,1,new LongTitle())
,        new StructureIndicator.DefaultElement(1,1,new Recital())
,        new StructureIndicator.DefaultElement(1,1,new Citation())
,        new StructureIndicator.DefaultElement(1,1,new ComponentRef())
,        new StructureIndicator.DefaultElement(1,1,new DocumentRef())
,        new StructureIndicator.DefaultElement(1,1,new Intro())
,        new StructureIndicator.DefaultElement(1,1,new Wrap())
,        new StructureIndicator.DefaultElement(1,1,new Heading())
,        new StructureIndicator.DefaultElement(1,1,new Subheading())
,        new StructureIndicator.DefaultElement(1,1,new Num())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "extractStructure");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget extractStructure");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>ExtractStructure</code> object and set up its type
*/
public ExtractStructure() {
super(create());
setType("extractStructure");
}

/**
* Constructor with required attributes
*/
public ExtractStructure(IDSimpleType idAttr) {
this();
setIdAttr(idAttr);
}


/**
* Create a <code>ExtractStructure</code> object with the given DOM element
*/
public ExtractStructure(Element element) {
super(element);
}

// FIELDS ------------------
    private StringSimpleType startQuoteAttr;
    private StringSimpleType endQuoteAttr;

        /**
        * Return <code>startQuoteAttr</code> property
        * @return startQuoteAttr
        */
        public StringSimpleType getStartQuoteAttr() {
        if (startQuoteAttr == null) {
                startQuoteAttr = new StringSimpleType();
                startQuoteAttr.setValue(getElement().getAttribute("startQuote"));
        }

        return startQuoteAttr;
        }
        /**
        * Return <code>startQuoteAttr</code> property in DSL way
        * @return startQuoteAttr
        */
        public StringSimpleType startQuoteAttr() {
        return  getStartQuoteAttr();
        }
        /**
        * Set <code>startQuoteAttr</code> property
        * @param startQuoteAttr the new value
        */
        public void setStartQuoteAttr(final StringSimpleType startQuoteAttr) {
        this.startQuoteAttr = startQuoteAttr;
        getElement().setAttribute("startQuote",startQuoteAttr.getValue());
        }
        /**
        * Set <code>startQuoteAttr</code> property in DSL way
        * @param startQuoteAttr the new value
        * @return <code>ExtractStructure</code> instance
        */
        public ExtractStructure startQuoteAttr(final StringSimpleType startQuoteAttr) {
        setStartQuoteAttr(startQuoteAttr);
        return this;
        }
        /**
        * Return <code>endQuoteAttr</code> property
        * @return endQuoteAttr
        */
        public StringSimpleType getEndQuoteAttr() {
        if (endQuoteAttr == null) {
                endQuoteAttr = new StringSimpleType();
                endQuoteAttr.setValue(getElement().getAttribute("endQuote"));
        }

        return endQuoteAttr;
        }
        /**
        * Return <code>endQuoteAttr</code> property in DSL way
        * @return endQuoteAttr
        */
        public StringSimpleType endQuoteAttr() {
        return  getEndQuoteAttr();
        }
        /**
        * Set <code>endQuoteAttr</code> property
        * @param endQuoteAttr the new value
        */
        public void setEndQuoteAttr(final StringSimpleType endQuoteAttr) {
        this.endQuoteAttr = endQuoteAttr;
        getElement().setAttribute("endQuote",endQuoteAttr.getValue());
        }
        /**
        * Set <code>endQuoteAttr</code> property in DSL way
        * @param endQuoteAttr the new value
        * @return <code>ExtractStructure</code> instance
        */
        public ExtractStructure endQuoteAttr(final StringSimpleType endQuoteAttr) {
        setEndQuoteAttr(endQuoteAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>spaceAttr</code> property in DSL way
        * @param spaceAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> ExtractStructure</code> instance
        */
        public ExtractStructure periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
}

@Override
public LinkedHashMap<String, String> getAttributes() {
final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("startQuote", getStartQuoteAttr() != null ? getStartQuoteAttr().getValue() : null);
        attrs.put("endQuote", getEndQuoteAttr() != null ? getEndQuoteAttr().getValue() : null);
return attrs;
}

@Override
public StructureIndicator getStructureIndicator() {
    return STRUCTURE_INDICATOR;
}

/**
* DSL Style for html method
*/
@Override
public ExtractStructure html(String s) {
    super.html(s);
    return this;
}
}

