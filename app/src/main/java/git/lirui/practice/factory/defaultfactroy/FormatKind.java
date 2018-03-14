package git.lirui.practice.factory.defaultfactroy;

import android.support.annotation.StringDef;

/**
 * Created by lirui on 2018/3/9.
 */

public class FormatKind {
    public static final String HTML = "我是html格式的，";
    public static final String PDF = "我是pdf格式的，";

    @StringDef({HTML, PDF})
    @interface Format {

    }
}
