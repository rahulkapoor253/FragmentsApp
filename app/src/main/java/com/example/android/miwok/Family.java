package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


/**
 * this is the family acitivity to hold the family members using recycler view;
 */

public class Family extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager manager;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

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

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        RecycleAdapter adapter = new RecycleAdapter(this, mdataarraylist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

}
