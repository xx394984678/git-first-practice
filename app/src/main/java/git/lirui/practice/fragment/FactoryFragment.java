package git.lirui.practice.fragment;

import git.lirui.practice.BaseFragment;
import git.lirui.practice.R;
import git.lirui.practice.factory.defaultfactroy.ExportFileFactory;
import git.lirui.practice.factory.defaultfactroy.FormatKind;
import git.lirui.practice.factory.defaultfactroy.PersonKind;

/**
 * Created by lirui on 2018/3/9.
 */

public class FactoryFragment extends BaseFragment {
    private String content = getClass().getName();

    @Override
    public int getLayoutId() {
        return R.layout.test_layout;
    }

    @Override
    public void onButton1Clicked() {
        signTv.setText(ExportFileFactory.factory(FormatKind.HTML, PersonKind.FINANCE).export(content));
    }

    @Override
    public void onButton2Clicked() {
        signTv.setText(ExportFileFactory.factory(FormatKind.HTML, PersonKind.OTHER_PERSON).export(content));
    }

    @Override
    public void onButton3Clicked() {
        signTv.setText(ExportFileFactory.factory(FormatKind.PDF, PersonKind.FINANCE).export(content));
    }

    @Override
    public void onButton4Clicked() {
        signTv.setText(ExportFileFactory.factory(FormatKind.PDF, PersonKind.OTHER_PERSON).export(content));
    }
}
