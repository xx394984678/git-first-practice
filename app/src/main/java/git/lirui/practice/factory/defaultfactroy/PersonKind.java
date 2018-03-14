package git.lirui.practice.factory.defaultfactroy;

import android.support.annotation.StringDef;

/**
 * Created by lirui on 2018/3/9.
 */

public class PersonKind {
    public static final String FINANCE = "专门给财务人员看的，内容是：";
    public static final String OTHER_PERSON = "给其他人员看的，内容是：";


    @StringDef({FINANCE, OTHER_PERSON})
    public @interface Person {

    }
}
