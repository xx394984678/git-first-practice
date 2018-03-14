package git.lirui.practice.factory.defaultfactroy;

import git.lirui.practice.factory.defaultfactroy.factory.ExportHtmlFactory;
import git.lirui.practice.factory.defaultfactroy.factory.ExportPdfFactory;

/**
 * Created by lirui on 2018/3/9.
 */

public class ExportFileFactory {

    public static ExportFile factory(@FormatKind.Format String format, @PersonKind.Person String personKind) {
        switch (format) {
            case FormatKind.HTML:
                return ExportHtmlFactory.getInstance().factory(personKind);
            case FormatKind.PDF:
                return ExportPdfFactory.getInstance().factory(personKind);
            default:
                throw new RuntimeException("your format is error");
        }
    }
}
