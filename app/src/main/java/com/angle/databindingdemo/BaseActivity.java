package com.angle.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import static android.R.attr.key;

public abstract class BaseActivity<VB extends ViewDataBinding> extends AppCompatActivity {
    protected VB mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = getLayoutInflater().inflate(this.getLayoutId(), null, false);
        mBinding = DataBindingUtil.bind(rootView);
        super.setContentView(rootView);

        initToolBar();
        //数据
        initData();
        initView();

    }

    protected void initToolBar() {
        findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    protected abstract int getLayoutId();

    protected abstract void initData();

    protected abstract void initView();


    private long mExitTime = 0;
    private boolean mIsExit = false;

    protected void keyBackExitApp(boolean isExit){
        mIsExit=isExit;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (mIsExit) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                if ((System.currentTimeMillis() - mExitTime) > 2000) {
                    Toast.makeText(this, "在按一次退出", Toast.LENGTH_SHORT).show();
                    mExitTime = System.currentTimeMillis();
                    return true;
                } else {
                    System.exit(0);
                }
            }
        }
        return super.onKeyDown(keyCode, event);

    }
}
