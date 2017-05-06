package com.example.android.miwok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * class that extends fragment and is called by view pager;
 */
public class ColorFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_colorfragment, container, false);

        ArrayList<ColorData> mdataarraylist = new ArrayList<>();

        mdataarraylist.add(new ColorData("red", R.drawable.color_red));
        mdataarraylist.add(new ColorData("gray", R.drawable.color_gray));
        mdataarraylist.add(new ColorData("brown", R.drawable.color_brown));
        mdataarraylist.add(new ColorData("black", R.drawable.color_black));
        mdataarraylist.add(new ColorData("dusty yellow", R.drawable.color_dusty_yellow));
        mdataarraylist.add(new ColorData("green", R.drawable.color_green));
        mdataarraylist.add(new ColorData("mustard", R.drawable.color_mustard_yellow));
        mdataarraylist.add(new ColorData("white", R.drawable.color_white));

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview_color);
        RecycleAdapterColors adapter = new RecycleAdapterColors(getActivity(), mdataarraylist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);


        return rootView;
    }

}


