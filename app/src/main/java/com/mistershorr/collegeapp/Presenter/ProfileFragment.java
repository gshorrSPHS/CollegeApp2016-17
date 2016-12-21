package com.mistershorr.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gshorr on 12/9/16.
 */
public class ProfileFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater,container,savedInstanceState);
        //View rootView = inflater.inflate(R.layout.fragment_profile,container,false);

        //TextView firstName = (TextView) rootView.findViewById(R.id.first_name);
        //return rootView;
    }
}
