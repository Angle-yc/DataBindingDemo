package com.angle.databindingdemo;

import android.support.v4.app.FragmentManager;
import android.view.View;

import com.angle.databindingdemo.databinding.ActivitySecondBinding;
import com.angle.databindingdemo.fragments.SecondeFragment;

public class SecondActivity extends BaseActivity<ActivitySecondBinding> {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_second;

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mBinding.toolbar.tvTitle.setText("secondActivity");
        mBinding.tvContent.setText("secondActivity");
        mBinding.btnSecondfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                manager.beginTransaction()
                        .add(R.id.fl_container, new SecondeFragment())
                        .commit();
            }
        });
    }
}
