package com.example.administrator.easyshop.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.easyshop.R;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.toolBar)
    Toolbar toolBar;
    @BindView(R.id.vp_main)
    ViewPager vpMain;
    @BindViews({R.id.tv_shop, R.id.tv_message, R.id.tv_mail, R.id.tv_me})
    TextView[] textViews;

    @BindView(R.id.ll_main)
    LinearLayout llMain;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;
    boolean isExist = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("");
        textViews[0].setSelected(true);

        vpMain.setAdapter(myad);
        vpMain.addOnPageChangeListener(vpListener);
    }

    private ViewPager.OnPageChangeListener vpListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    private FragmentStatePagerAdapter myad = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:

                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    };

    @Override
    public void onBackPressed() {
        if (!isExist) {
            isExist = true;

            vpMain.postDelayed(new Runnable() {
                @Override
                public void run() {
                    isExist = true;
                }
            }, 2000);
        } else {
            finish();
        }
    }
}
