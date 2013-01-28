package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Components;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AmendmentList;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.OfficialGazette;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DocumentCollection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Act;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Bill;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DebateReport;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Debate;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Amendment;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Judgement;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Doc;
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

public class AkomaNtosoTypeComplexType extends AmendableWidgetImpl  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "akomaNtosoTypeComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget akomaNtosoTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

public AkomaNtosoTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------

            public Components getComponents() {
                Components result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Components".equalsIgnoreCase(widget.getType())) {
            result = (Components)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Components setComponents(Components componentsElem) {
                    Components result = getComponents();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(componentsElem);

                return componentsElem;
            }
            public AmendmentList getAmendmentList() {
                AmendmentList result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AmendmentList".equalsIgnoreCase(widget.getType())) {
            result = (AmendmentList)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public AmendmentList setAmendmentList(AmendmentList amendmentListElem) {
                    AmendmentList result = getAmendmentList();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(amendmentListElem);

                return amendmentListElem;
            }
            public OfficialGazette getOfficialGazette() {
                OfficialGazette result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OfficialGazette".equalsIgnoreCase(widget.getType())) {
            result = (OfficialGazette)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public OfficialGazette setOfficialGazette(OfficialGazette officialGazetteElem) {
                    OfficialGazette result = getOfficialGazette();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(officialGazetteElem);

                return officialGazetteElem;
            }
            public DocumentCollection getDocumentCollection() {
                DocumentCollection result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocumentCollection".equalsIgnoreCase(widget.getType())) {
            result = (DocumentCollection)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public DocumentCollection setDocumentCollection(DocumentCollection documentCollectionElem) {
                    DocumentCollection result = getDocumentCollection();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(documentCollectionElem);

                return documentCollectionElem;
            }
            public Act getAct() {
                Act result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Act".equalsIgnoreCase(widget.getType())) {
            result = (Act)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Act setAct(Act actElem) {
                    Act result = getAct();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(actElem);

                return actElem;
            }
            public Bill getBill() {
                Bill result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Bill".equalsIgnoreCase(widget.getType())) {
            result = (Bill)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Bill setBill(Bill billElem) {
                    Bill result = getBill();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(billElem);

                return billElem;
            }
            public DebateReport getDebateReport() {
                DebateReport result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateReport".equalsIgnoreCase(widget.getType())) {
            result = (DebateReport)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public DebateReport setDebateReport(DebateReport debateReportElem) {
                    DebateReport result = getDebateReport();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(debateReportElem);

                return debateReportElem;
            }
            public Debate getDebate() {
                Debate result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Debate".equalsIgnoreCase(widget.getType())) {
            result = (Debate)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Debate setDebate(Debate debateElem) {
                    Debate result = getDebate();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(debateElem);

                return debateElem;
            }
            public Amendment getAmendment() {
                Amendment result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Amendment".equalsIgnoreCase(widget.getType())) {
            result = (Amendment)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Amendment setAmendment(Amendment amendmentElem) {
                    Amendment result = getAmendment();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(amendmentElem);

                return amendmentElem;
            }
            public Judgement getJudgement() {
                Judgement result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Judgement".equalsIgnoreCase(widget.getType())) {
            result = (Judgement)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Judgement setJudgement(Judgement judgementElem) {
                    Judgement result = getJudgement();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(judgementElem);

                return judgementElem;
            }
            public Doc getDoc() {
                Doc result = null;
            for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Doc".equalsIgnoreCase(widget.getType())) {
            result = (Doc)widget;
            break;
            }
            }
            return result;
            }
            //DSL Style get value already exists

            //DSL Style set value
            public Doc setDoc(Doc docElem) {
                    Doc result = getDoc();
                // remove the child of the same type if exist
                if (result != null) {
                this.removeAmendableWidget(result);
                }
                this.addAmendableWidget(docElem);

                return docElem;
            }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{"act","amendment","amendmentList","bill","components","debate","debateReport","doc","documentCollection","judgement","officialGazette"};
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
return attrs;
}
}

