package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;


/**
 * Created by joycelin12 on 6/30/18.
 */

public class MasterListFragment extends Fragment {

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the fragment
     */
    public MasterListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        // Get a reference to the GridView in the fragment layout
        GridView gridView = (GridView) rootView.findViewById(R.id.allGridView);
        //replace mImageIds with AndroidImageAssets.getAll()
        gridView.setAdapter(new MasterListAdapter(getContext(), AndroidImageAssets.getAll()));

        return rootView;
    }

}
