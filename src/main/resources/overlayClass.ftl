<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
package ${packageNameGenerator.getPackageName(overlayClass)};

<#list overlayClass.getImports(packageNameGenerator) as import>
import ${import};
</#list>
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
<#if overlayClass.complex || overlayClass.element || overlayClass.hasWildCardProperties()>
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
</#if>
<#if overlayClass.element>
import com.google.gwt.user.client.DOM;
</#if>

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ${overlayClass.className?cap_first} <#if overlayClass.parent?? && (overlayClass.parent.complex || overlayClass.parent.element || overlayClass.parent.simple)>extends ${overlayClass.parent.className?cap_first}<#else><#if overlayClass.complex || overlayClass.element>extends AmendableWidgetImpl</#if></#if>  <#if overlayClass.interfaces??>implements <#list overlayClass.interfaces as interface>${interface.getSimpleName()}<#if interface_has_next>, </#if></#list> </#if>{

// CONSTRUCTORS ------------------
<#if overlayClass.element>
    public ${overlayClass.className?cap_first}() {
        super(DOM.createElement("${overlayClass.className}"));
    }
</#if>

<#if overlayClass.complex || overlayClass.element>
    public ${overlayClass.className?cap_first}(Element element) {
        super(element);
    }
</#if>
<#if overlayClass.simple>
    public ${overlayClass.className?cap_first}() {
    super();
    }
</#if>

// FIELDS ------------------
<#if overlayClass.complex || overlayClass.element>
    <#list overlayClass.properties as property>
    <#if property.attribute>
        <@generateField property=property/>
    </#if>
</#list>
</#if>
<#if overlayClass.simple>
    <#list overlayClass.properties as property>
            <@generateField property=property/>
    </#list>
</#if>
<#if overlayClass.complex || overlayClass.element>
<#list overlayClass.properties as property>
    <#if property.attribute>
    public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
        if (<@propertyName property = property/> == null) {
            <#if property.baseClass?? && !property.baseClass.enumeration>
            <@propertyName property = property/> = new ${property.className?cap_first}();
            <@propertyName property = property/>.setValue(amendableElement.getAttribute("${property.name}"));
            <#elseif property.baseClass?? && property.baseClass.enumeration>
            <@propertyName property = property/> = ${property.className?cap_first}.fromString(amendableElement.getAttribute("${property.name}"));
            <#elseif !property.wildCard>
            <@propertyName property = property/> = amendableElement.getAttribute("${property.name}");
            <#else>
            //hmm nothing to do here
            </#if>
        }

        return <@propertyName property = property/>;
    }
    public void set<@propertyNameCap property = property/>(final <@propertyClassName property=property/> <@propertyName property = property/>) {
        this.<@propertyName property = property/> = <@propertyName property = property/>;
    }
    <#else>
    <#if property.collection>
    public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
        <@propertyClassName property=property/> result = new ArrayList<<@elementClassName property=property/>>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("<@elementClassName property=property/>".equalsIgnoreCase(widget.getType())) {
                result.add((<@elementClassName property=property/>)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    <#else>
    public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
        <@propertyClassName property=property/> result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("<@propertyClassName property=property/>".equalsIgnoreCase(widget.getType())) {
                result = (<@propertyClassName property=property/>)widget;
                break;
            }
        }
        return result;
    }
    </#if>
    </#if>
</#list>
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
    <#assign delimiter = "">
        return new String[]{<#list overlayClass.allowedSubTypes as child>${delimiter}"${child}"<#assign delimiter = ","></#list>};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        <#list overlayClass.properties as property>
            <#if property.attribute>
        attrs.put("<@propertyName property=property/>", <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>()<#if property.baseClass?? && property.baseClass.enumeration>.value()<#elseif property.baseClass?? && property.baseClass.simple>.getValue()<#elseif property.wildCard && !property.attribute>.getContent()<#else>.toString()</#if>);
            </#if>
        </#list>

        return attrs;
    }

</#if>
<#if overlayClass.simple>
    <#list overlayClass.properties as property>
    public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
        return <@propertyName property = property/>;
    }
    public void set<@propertyNameCap property = property/>(final <@propertyClassName property=property/> <@propertyName property = property/>) {
        this.<@propertyName property = property/> = <@propertyName property = property/>;
    }
    </#list>
</#if>
}

<#macro propertyClassName property><#compress>
    <#assign propName="AmendableWidgetImpl">
    <#if property.wildCard>
        <#if property.attribute>
            <#assign propName="String">
        <#else>
            <#assign propName="AmendableWidgetImpl">
        </#if>
    <#else>
        <#assign propName=property.className?cap_first>
    </#if>
    <#if property.collection>
    java.util.List<${propName}>
    <#else>
    ${propName}
    </#if>
</#compress></#macro>

<#macro elementClassName property><#compress>
    <#assign propName="AmendableWidgetImpl">
    <#if property.wildCard>
        <#if property.attribute>
            <#assign propName="String">
        <#else>
            <#assign propName="AmendableWidgetImpl">
        </#if>
    <#else>
        <#assign propName=property.className?cap_first>
    </#if>
    ${propName}
</#compress></#macro>

<#macro propertyName property><#compress>
    <#if property.javaName == "class">
    className
    <#elseif property.javaName == "extends">
    extendz
    <#elseif property.javaName == "for">
    forURI
    <#elseif property.javaName == "new">
    newEl
    <#else>
        <#if property.collection><@pl property=property/><#else>${property.javaName}</#if>
    </#if>
</#compress></#macro>

<#macro propertyNameCap property><#compress>
    <#if property.javaName == "class">
    ClassName
    <#else>
        <#if property.collection><@plural propertyName=property.javaName?cap_first/><#else>${property.javaName?cap_first}</#if>
    </#if>
</#compress></#macro>

<#macro generateField property>
    private <@propertyClassName property=property/> <#if property.collection><@pl property=property/> = new ArrayList<<#if property.wildCard && !property.attribute>AmendableWidgetImpl>();<#elseif property.wildCard && property.attribute> String>()<#else>${property.className?cap_first}>();</#if><#else><@propertyName property = property/>;</#if>
</#macro>

<#macro pl property><#compress>
    <@plural propertyName=property.javaName/>
</#compress></#macro>

<#macro plural propertyName><#compress>
    <#if propertyName?ends_with("y")>${propertyName?substring(0, propertyName?length - 1)}ies<#elseif propertyName?ends_with("s")>${propertyName}es<#else>${propertyName}s</#if>
</#compress></#macro>