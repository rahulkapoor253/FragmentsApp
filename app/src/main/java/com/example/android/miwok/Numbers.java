package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * this class creates array list and adds data to it by passing by value to NumbersData;
 */

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


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

        WordAdapter wordAdapter = new WordAdapter(this, word);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);


    }


}
