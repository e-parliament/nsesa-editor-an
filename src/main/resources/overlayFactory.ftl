<#-- @ftlvariable name="overlayClasses" type="java.util.List<OverlayClass>" -->
<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
package ${packageNameGenerator.getPackageName(overlayClass)};

<#list overlayClasses as cl>
import ${packageNameGenerator.getPackageName(cl)}.${cl.className?cap_first};
</#list>
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import com.google.gwt.dom.client.Element;
import java.util.logging.Logger;
import java.util.Map;
/**
* Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayFactory.ftl</tt>.
*/
public class ${overlayClass.name?cap_first} extends DefaultOverlayFactory  {

    private final static Logger LOG = Logger.getLogger(${overlayClass.name?cap_first}.class.getName());

    @Inject
    public ${overlayClass.name?cap_first}(final OverlayStrategy overlayStrategy) {
        super(overlayStrategy);
    }

    @Override
    public AmendableWidget toAmendableWidget(final Element element, final String namespaceURI) {
        String prefix = null;
        String nodeName = null;
        if (element.getNodeName().contains(":")) {
            final String[] prefixAndName = element.getNodeName().split(":");
            prefix = prefixAndName[0];
            nodeName = prefixAndName[1];
        }
        else {
            nodeName = element.getNodeName();
        }

        if ("".equals(nodeName)) {
            throw new IllegalArgumentException("Empty element or null passed.");
        }
        else if (nodeName.startsWith("/")) {
            // assume IE8
            LOG.warning("A node with a name starting with a slash was passed. Enjoy IE8!");
            return null;
        }
<#list overlayClasses as cl>
        else if ("${cl.name}".equalsIgnoreCase(nodeName)) {
            return new ${cl.className?cap_first}(element);
        }
</#list>
        // nothing found
        LOG.warning("Could not find overlay element (nodename: " + nodeName + " in namespace URI '" + namespaceURI + "')");
        return null;
    }
}