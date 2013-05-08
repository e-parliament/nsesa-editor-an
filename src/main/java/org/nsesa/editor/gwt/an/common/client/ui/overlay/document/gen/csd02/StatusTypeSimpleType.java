package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

/**
* This is the list of allowed values for the status attribute. This is the list of possible reasons for a dscrepancy between the manifestation as it should be (e.g., a faithful representation of the content of an expression), and the manifestation as it actually is. Values should be interpreted as follows: - removed: the content of the element is present in the markup (manifestation) but is not present in the real content of the document (expression level) because it has been definitely removed (either ex tunc, as in annullments, or ex nunc, as in abrogations). - temporarily removed: the content of the element is present in the markup (manifestation) but is not present in the real content of the document (expression level) because it has been temporarily removed (e.g., for a temporary suspension or limitation of efficacy). - translated: the content of the element is present in the markup (manifestation) in a different form than in the real content of the document (expression level) because it has been translated into a different language (e.g., to match the rest of the document or because of other editorial decisions). - editorial: the content of the element is present in the markup (manifestation) but is not present in the real content of the document (expression level) because it has been inserted as an editorial process when creating the XML markup. - edited: the content of the element is different in the markup (manifestation) than in the real content of the document (expression level) because it has been amended (e.g., to remove scurrilous or offensive remarks). - verbatim: the content of the element is present in the markup (manifestation) is EXACTLY as it was in the real content of the document (expression level) because usual silent fixes and edits were NOT performed (e.g. to punctuation, grammatical errors or other usually non-debatable problems). - incomplete: the content of the element or the value of a required attribute is NOT present in the markup (manifestation), although it should, because the missing data is not known at the moment, but in the future it might become known. This is especially appropriate for documents in drafting phase (e.g., the publication date of the act while drafting the bill) - unknown: the content of the element or the value of a required attribute is NOT present in the markup (manifestation), although it should, because the author of the manifestation does not know it. - undefined: the content of the element or the value of a required attribute is NOT present in the markup (manifestation), because the information is not defined in the original document, or it doesn''t exist in some legal tradition (e.g. an anonymous speech cannot specify the attribute by, or some publications do not record the numbering of the items, etc.) - ignored: the content of the element or the value of a required attribute is NOT present in the markup (manifestation) because the information exists but the author of the manifestation is not interested in reporting it (e.g., omitted parts of the document due to editorial reasons, etc.)* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
*/
public enum StatusTypeSimpleType {

// FIELDS ------------------

REMOVED("removed"),
TEMPORARILYREMOVED("temporarilyRemoved"),
TRANSLATED("translated"),
EDITORIAL("editorial"),
EDITED("edited"),
VERBATIM("verbatim"),
INCOMPLETE("incomplete"),
UNKNOWN("unknown"),
UNDEFINED("undefined"),
IGNORED("ignored")
;
private final String value;

/**
* Create an instance of StatusTypeSimpleType class with the given String
*/
StatusTypeSimpleType(String v) {
value = v;
}

/**
* Return the value of the instance
* @return value as String
*/
public String value() {
return value;
}

/**
* Return an Enum based on the given input text or null if it does not fit
* @param text the String representation of the enum
* @return StatusTypeSimpleType or <code>null</code>
*/
public static StatusTypeSimpleType fromString(String text) {
if (text == null) return null;
for (StatusTypeSimpleType en : StatusTypeSimpleType.values()) {
if(text.equalsIgnoreCase(en.value())) {
return en;
}
}
return null;
}
}
