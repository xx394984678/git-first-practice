package git.lirui.practice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import git.lirui.practice.R;
import git.lirui.practice.api.ApiConstant;

/**
 * Created by mayuming on 2018/5/9.
 */

public class TestActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        textView = findViewById(R.id.sign);

        textView.setText(ApiConstant.SIGN + String.valueOf(ApiConstant.CHECKOUT_ON_LINE_URL));
    }
}
