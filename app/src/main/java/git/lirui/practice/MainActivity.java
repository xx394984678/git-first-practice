package git.lirui.practice;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import git.lirui.practice.fragment.FactoryFragment;
import git.lirui.practice.fragment.SimpleFactoryFragment;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager pager;

    List<PageModel> pageModels = new ArrayList<>();

    {
        pageModels.add(new PageModel(R.string.simple_factory, new SimpleFactoryFragment()));
        pageModels.add(new PageModel(R.string.factory, new FactoryFragment()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tab_layout);
        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return pageModels.get(position).fragment;
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return getString(pageModels.get(position).titleRes);
            }
        });


        tabLayout.setupWithViewPager(pager);
    }

    private class PageModel {
        Fragment fragment;
        @StringRes
        int titleRes;

        PageModel(@StringRes int titleRes, Fragment fragment) {
            this.fragment = fragment;
            this.titleRes = titleRes;
        }
    }
}
