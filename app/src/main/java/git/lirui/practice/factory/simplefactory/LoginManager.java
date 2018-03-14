package git.lirui.practice.factory.simplefactory;

import android.support.annotation.StringDef;

/**
 * Created by lirui on 2018/3/9.
 */

public class LoginManager {
    public static final String USER_NAME_LOGIN = "user_name_login";
    public static final String EMAIL_LOGIN = "email_login";

    @StringDef({USER_NAME_LOGIN, EMAIL_LOGIN})
    @interface SimpleFactoryLoginType {

    }

    private static UserNameLogin userNameLogin;
    private static EmailLogin emailLogin;
    /**
     * @param type
     * @return
     */
    public static Login factory(@SimpleFactoryLoginType String type) {
        switch (type) {
            case USER_NAME_LOGIN:
                if (userNameLogin == null){
                    userNameLogin = new UserNameLogin();
                }
                return userNameLogin;
            case EMAIL_LOGIN:
                if (emailLogin == null){
                    emailLogin = new EmailLogin();
                }
                return emailLogin;
            default:
                throw new RuntimeException("登陆类型错误");
        }
    }
}
