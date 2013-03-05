package org.nsesa.editor.gwt.an.client.ui.resources;

import com.google.gwt.i18n.client.Messages;

/**
 * Git messages - its corresponding .properties file is generated automatically by the Maven Git plugin with the
 * latest commit information.
 * Date: 04/03/13 17:36
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public interface GitMessages extends Messages {
    @Key("git.commit.id.abbrev")
    String gitCommitIdAbbrev();

    @Key("git.commit.id.describe")
    String gitCommitIdDescribe();

    @Key("git.build.time")
    String gitBuildTime();

    @Key("git.branch")
    String gitBranch();
}
