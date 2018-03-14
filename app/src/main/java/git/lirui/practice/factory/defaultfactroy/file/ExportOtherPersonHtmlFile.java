package git.lirui.practice.factory.defaultfactroy.file;

import git.lirui.practice.factory.defaultfactroy.ExportFile;
import git.lirui.practice.factory.defaultfactroy.FormatKind;
import git.lirui.practice.factory.defaultfactroy.PersonKind;

/**
 * Created by lirui on 2018/3/9.
 */

public class ExportOtherPersonHtmlFile implements ExportFile {

    @Override
    public String export(String content) {
        return FormatKind.HTML+ PersonKind.OTHER_PERSON+content;
    }
}
