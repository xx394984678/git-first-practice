package git.lirui.practice.factory.defaultfactroy.factory;

import git.lirui.practice.factory.defaultfactroy.BaseExportFactory;
import git.lirui.practice.factory.defaultfactroy.ExportFile;
import git.lirui.practice.factory.defaultfactroy.PersonKind;
import git.lirui.practice.factory.defaultfactroy.file.ExportFinancePdfFile;
import git.lirui.practice.factory.defaultfactroy.file.ExportOtherPersonPdfFile;

/**
 * Created by lirui on 2018/3/9.
 */

public class ExportPdfFactory implements BaseExportFactory {
    private static ExportPdfFactory exportPdfFactory;

    public static ExportPdfFactory getInstance() {
        if (exportPdfFactory == null) {
            exportPdfFactory = new ExportPdfFactory();
        }
        return exportPdfFactory;
    }

    private ExportFinancePdfFile financePdfFile;
    private ExportOtherPersonPdfFile otherPersonPdfFile;

    @Override
    public ExportFile factory(@PersonKind.Person String type) {
        switch (type) {
            case PersonKind.FINANCE:
                if (financePdfFile == null) {
                    financePdfFile = new ExportFinancePdfFile();
                }
                return financePdfFile;
            case PersonKind.OTHER_PERSON:
                if (otherPersonPdfFile == null) {
                    otherPersonPdfFile = new ExportOtherPersonPdfFile();
                }
                return otherPersonPdfFile;
            default:
                throw new RuntimeException();
        }
    }
}
