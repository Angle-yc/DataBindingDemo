package com.angle.databindingdemo.fragments;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment<VB extends ViewDataBinding> extends Fragment {

    VB mBinding;

    public BaseFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(getLayoutId(),null,false);
        mBinding= DataBindingUtil.bind(rootView);
        return rootView;
    }

    protected abstract int getLayoutId();

}
