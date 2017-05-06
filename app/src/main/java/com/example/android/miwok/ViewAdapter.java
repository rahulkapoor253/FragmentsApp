package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by rahulkapoor on 10/04/17.
 */

public class ViewAdapter extends FragmentPagerAdapter {

    /**
     * @param fm makes call to super passing the fragmentmanagere;
     */
    public ViewAdapter(final FragmentManager fm) {
        super(fm);
    }

    /**
     * @param position sets the position of the fragment;
     * @return returns position;
     */
    @Override
    public Fragment getItem(final int position) {
        switch (position) {
            case 0:
                return new IndexPage();
            case 1:
                return new NumbersFragment();
            case 2:
                return new FamilyFragment();
            case 3:
                return new ColorFragment();
            default:
                return null;
        }
    }

    /**
     * @return returns the total count of fragments;
     */
    @Override
    public int getCount() {
        return 4;
    }
}
