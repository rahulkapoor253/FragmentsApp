package com.example.android.miwok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rahulkapoor on 10/04/17.
 */

public class IndexPage extends Fragment {

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.indexpage, container, false);
        return rootview;
    }
}
