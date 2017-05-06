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
 * Created by rahulkapoor on 10/04/17.
 */

public class FamilyFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_family, container, false);

        ArrayList<FamilyData> mdataarraylist = new ArrayList<>();

        mdataarraylist.add(new FamilyData("grandfather", R.drawable.family_grandfather));
        mdataarraylist.add(new FamilyData("grandmother", R.drawable.family_grandmother));
        mdataarraylist.add(new FamilyData("father", R.drawable.family_father));
        mdataarraylist.add(new FamilyData("mother", R.drawable.family_mother));
        mdataarraylist.add(new FamilyData("older brother", R.drawable.family_older_brother));
        mdataarraylist.add(new FamilyData("older sister", R.drawable.family_older_sister));
        mdataarraylist.add(new FamilyData("younger brother", R.drawable.family_younger_brother));
        mdataarraylist.add(new FamilyData("younger sister", R.drawable.family_younger_sister));
        mdataarraylist.add(new FamilyData("daughter", R.drawable.family_daughter));
        mdataarraylist.add(new FamilyData("son", R.drawable.family_son));
        //Log.d("FamilyFragment", "onCreateView: " + rootView.findViewById(R.id.family_recycler_view));
        recyclerView = (RecyclerView) rootView.findViewById(R.id.family_recycler_view);
        RecycleAdapter adapter = new RecycleAdapter(getActivity(), mdataarraylist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);


        return rootView;
    }
}
