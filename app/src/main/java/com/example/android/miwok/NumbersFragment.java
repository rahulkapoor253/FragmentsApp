package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 10/04/17.
 */

public class NumbersFragment extends Fragment {

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_numbers, container, false);


        ArrayList<Numberdata> word = new ArrayList<>();

        word.add(new Numberdata("one", "1", R.drawable.number_one));
        word.add(new Numberdata("two", "2", R.drawable.number_two));
        word.add(new Numberdata("three", "3", R.drawable.number_three));
        word.add(new Numberdata("four", "4", R.drawable.number_four));
        word.add(new Numberdata("five", "5", R.drawable.number_five));
        word.add(new Numberdata("six", "6", R.drawable.number_six));
        word.add(new Numberdata("seven", "7", R.drawable.number_seven));
        word.add(new Numberdata("eight", "8", R.drawable.number_eight));
        word.add(new Numberdata("nine", "9", R.drawable.number_nine));
        word.add(new Numberdata("ten", "10", R.drawable.number_ten));


        WordAdapter wordAdapter = new WordAdapter(getActivity(), word);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        listView.setAdapter(wordAdapter);

        return rootView;
    }


}
