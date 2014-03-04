package com.msd.actionbar.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rajatdeshpande on 3/3/14.
 */
public class BoxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView;

        rootView = inflater.inflate(R.layout.fragment_box, container, false);

        return rootView;


    }
}
