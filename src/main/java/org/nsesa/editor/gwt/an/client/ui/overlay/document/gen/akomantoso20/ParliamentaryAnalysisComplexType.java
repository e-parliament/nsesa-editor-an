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
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The complex type parliamentaryAnalysis is a list of all the parliamentary analysis elements that can be used on the analysis of a debate
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class ParliamentaryAnalysisComplexType extends OverlayWidgetImpl {
    /**
     * Stores a map of allowed sub types coming from xsd structure
     */
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new QuorumVerification(), new Occurrence(1, 1));
            put(new Voting(), new Occurrence(1, 1));
            put(new Recount(), new Occurrence(1, 1));
        }
    };


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "parliamentaryAnalysisComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget parliamentaryAnalysisComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>ParliamentaryAnalysisComplexType</code> object with the given DOM element
     */
    public ParliamentaryAnalysisComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
     * Return <code>java.util.List<QuorumVerification></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<QuorumVerification> getQuorumVerifications() {
        java.util.List<QuorumVerification> result = new ArrayList<QuorumVerification>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("QuorumVerification".equalsIgnoreCase(widget.getType())) {
                result.add((QuorumVerification) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<QuorumVerification></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<QuorumVerification> getQuorumVerificationList() {
        return getQuorumVerifications();
    }

    /**
     * Add <code>java.util.List<QuorumVerification></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public QuorumVerification addQuorumVerification(QuorumVerification quorumVerificationElem) {
        this.addOverlayWidget(quorumVerificationElem);
        return quorumVerificationElem;
    }

    /**
     * Return <code>java.util.List<Voting></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Voting> getVotings() {
        java.util.List<Voting> result = new ArrayList<Voting>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Voting".equalsIgnoreCase(widget.getType())) {
                result.add((Voting) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Voting></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Voting> getVotingList() {
        return getVotings();
    }

    /**
     * Add <code>java.util.List<Voting></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Voting addVoting(Voting votingElem) {
        this.addOverlayWidget(votingElem);
        return votingElem;
    }

    /**
     * Return <code>java.util.List<Recount></code> property
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Recount> getRecounts() {
        java.util.List<Recount> result = new ArrayList<Recount>();
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Recount".equalsIgnoreCase(widget.getType())) {
                result.add((Recount) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    /**
     * Return <code>java.util.List<Recount></code> property in DSL way
     *
     * @return The property as unmodifiable list
     */
    public java.util.List<Recount> getRecountList() {
        return getRecounts();
    }

    /**
     * Add <code>java.util.List<Recount></code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Recount addRecount(Recount recountElem) {
        this.addOverlayWidget(recountElem);
        return recountElem;
    }

//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
    }

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public ParliamentaryAnalysisComplexType html(String s) {
        super.html(s);
        return this;
    }
}

