package com.example.hussnain.islamicquotes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hussnain on 3/28/18.
 */

public class RandomNobelFragment extends Fragment {
    public static RandomNobelFragment newInstance(){
        RandomNobelFragment fragment=new RandomNobelFragment();
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.random_nobel_fragment,container,false);
        return view;
    }
}
