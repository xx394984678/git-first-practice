package git.lirui.practice.fragment;

import git.lirui.practice.BaseFragment;
import git.lirui.practice.R;
import git.lirui.practice.factory.simplefactory.LoginManager;

/**
 * Created by lirui on 2018/3/9.
 */

public class SimpleFactoryFragment extends BaseFragment {

    @Override
    public int getLayoutId() {
        return R.layout.test_layout;
    }

    @Override
    public void onButton1Clicked() {
        boolean result = LoginManager.factory(LoginManager.USER_NAME_LOGIN).verify("123", "123");
        log(getClass().toString(), String.valueOf(result));
        signTv.setText(String.valueOf(result));
    }

    @Override
    public void onButton2Clicked() {
        boolean result = LoginManager.factory(LoginManager.EMAIL_LOGIN).verify("123", "123");
        log(getClass().toString(), String.valueOf(result));
        signTv.setText(String.valueOf(result));
    }

}
