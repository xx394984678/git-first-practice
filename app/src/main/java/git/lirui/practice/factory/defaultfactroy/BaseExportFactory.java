package git.lirui.practice.factory.defaultfactroy;

/**
 * Created by lirui on 2018/3/9.
 */

public interface BaseExportFactory {
    ExportFile factory(@PersonKind.Person String type);
}
