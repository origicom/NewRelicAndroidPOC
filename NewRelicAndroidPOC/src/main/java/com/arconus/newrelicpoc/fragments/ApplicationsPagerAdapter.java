package com.arconus.newrelicpoc.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ApplicationsPagerAdapter extends FragmentStatePagerAdapter {

    private String prefix;

    public ApplicationsPagerAdapter(FragmentManager fm, String prefix) {
        super(fm);
        this.prefix = prefix;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a DummySectionFragment (defined as a static inner class
        // below) with the page number as its lone argument.
        if(position == 0) {
            return new ApplicationsSelectionListFragment();
        }

        Fragment fragment = new DummySectionFragment();
        Bundle args = new Bundle();
        args.putString(DummySectionFragment.ARG_SECTION_NUMBER, prefix + (position + 1));
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public int getItemPosition(Object object){
        return ApplicationsPagerAdapter.POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "LIST OF APPLICATIONS";
            case 1:
                return prefix + "SECTION 2";
            case 2:
                return prefix + "SECTION 3";
        }
        return null;
    }
}