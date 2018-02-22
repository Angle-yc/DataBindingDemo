package com.angle.databindingdemo.fragments;

import android.support.v4.app.Fragment;

import com.angle.databindingdemo.R;
import com.angle.databindingdemo.databinding.FragmentFirstBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends BaseFragment<FragmentFirstBinding> {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_first;
    }

}
