package com.example.administrator.easyshop;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
    boolean isExist=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("");
    }

    @Override
    public void onBackPressed() {
        if (!isExist){
            isExist=true;

            vpMain.postDelayed(new Runnable() {
                @Override
                public void run() {
                    isExist=true;
                }
            },2000);
        }else{
            finish();
        }
    }
}
