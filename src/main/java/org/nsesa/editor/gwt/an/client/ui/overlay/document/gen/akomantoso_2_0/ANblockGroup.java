package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockList;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Toc;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Tblock;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
/**
* This file is generated.
*/
public class ANblockGroup   {

// CONSTRUCTORS ------------------

// FIELDS ------------------
private BlockList blockList;
private Toc toc;
private Tblock tblock;

public BlockList getBlockList() {
return blockList;
}

public void setBlockList(final BlockList blockList) {
this.blockList = blockList;
}
public Toc getToc() {
return toc;
}

public void setToc(final Toc toc) {
this.toc = toc;
}
public Tblock getTblock() {
return tblock;
}

public void setTblock(final Tblock tblock) {
this.tblock = tblock;
}
/**
* Returns possible children as list of String
*/
public ArrayList<String> getAllowedSubTypes() {
    String[] arrayChildren = new String[]{};
    return  new ArrayList(Arrays.asList(arrayChildren));
}
}

