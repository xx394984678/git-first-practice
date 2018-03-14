package git.lirui.practice.factory.defaultfactroy.factory;

import git.lirui.practice.factory.defaultfactroy.BaseExportFactory;
import git.lirui.practice.factory.defaultfactroy.ExportFile;
import git.lirui.practice.factory.defaultfactroy.PersonKind;
import git.lirui.practice.factory.defaultfactroy.file.ExportFinanceHtmlFile;
import git.lirui.practice.factory.defaultfactroy.file.ExportOtherPersonHtmlFile;

/**
 * Created by lirui on 2018/3/9.
 */

public class ExportHtmlFactory implements BaseExportFactory {
    private static ExportHtmlFactory exportHtmlFactory;

    public static ExportHtmlFactory getInstance() {
        if (exportHtmlFactory == null) {
            exportHtmlFactory = new ExportHtmlFactory();
        }
        return exportHtmlFactory;
    }

    private ExportFinanceHtmlFile financeHtmlFile;
    private ExportOtherPersonHtmlFile otherPersonHtmlFile;

    @Override
    public ExportFile factory(@PersonKind.Person String type) {
        switch (type) {
            case PersonKind.FINANCE:
                if (financeHtmlFile == null) {
                    financeHtmlFile = new ExportFinanceHtmlFile();
                }
                return financeHtmlFile;
            case PersonKind.OTHER_PERSON:
                if (otherPersonHtmlFile == null) {
                    otherPersonHtmlFile = new ExportOtherPersonHtmlFile();
                }
                return otherPersonHtmlFile;
            default:
                throw new RuntimeException("");
        }
    }
}
