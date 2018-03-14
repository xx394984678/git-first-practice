package git.lirui.practice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lirui on 2018/3/9.
 */

public abstract class BaseFragment extends Fragment implements View.OnClickListener {
    public abstract int getLayoutId();

    public abstract void onButton1Clicked();

    public abstract void onButton2Clicked();

    public void onButton3Clicked() {
    }

    public void onButton4Clicked() {
    }

    public void onWeightClick(View view) {

    }

    public TextView signTv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        signTv = view.findViewById(R.id.sign);
        if (view.findViewById(R.id.button1) != null)
            view.findViewById(R.id.button1).setOnClickListener(this);
        if (view.findViewById(R.id.button2) != null)
            view.findViewById(R.id.button2).setOnClickListener(this);
        if (view.findViewById(R.id.button3) != null)
            view.findViewById(R.id.button3).setOnClickListener(this);
        if (view.findViewById(R.id.button4) != null)
            view.findViewById(R.id.button4).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                onButton1Clicked();
                break;
            case R.id.button2:
                onButton2Clicked();
                break;
            case R.id.button3:
                onButton3Clicked();
                break;
            case R.id.button4:
                onButton4Clicked();
                break;
            default:
                onWeightClick(v);
        }
    }

    public void log(String tag, String content) {
        Log.d(tag, content);
    }
}
