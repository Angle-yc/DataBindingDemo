package com.angle.databindingdemo;


import android.content.Intent;
import android.view.View;

import com.angle.databindingdemo.databinding.ActivityMainBinding;


public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        keyBackExitApp(true);
        mBinding.tvContent.setText("DataBinding");
        mBinding.toolbar.tvTitle.setText("mainActivity");
        mBinding.btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }
}
