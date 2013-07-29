package com.arconus.newrelicpoc.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class NothingSelectedPagerAdapter extends FragmentStatePagerAdapter {

    public NothingSelectedPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a DummySectionFragment (defined as a static inner class
        // below) with the page number as its lone argument.

        Fragment fragment = new DummySectionFragment();
        Bundle args = new Bundle();
        args.putString(DummySectionFragment.ARG_SECTION_NUMBER, "Make a selection to get started!");
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 1;
    }

    @Override
    public int getItemPosition(Object object){
        return NothingSelectedPagerAdapter.POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }
}
