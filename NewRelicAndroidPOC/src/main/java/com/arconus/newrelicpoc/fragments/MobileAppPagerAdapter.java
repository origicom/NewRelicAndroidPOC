package com.arconus.newrelicpoc.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MobileAppPagerAdapter extends FragmentStatePagerAdapter {

    private String prefix;

    public MobileAppPagerAdapter(FragmentManager fm, String prefix) {
        super(fm);
        this.prefix = prefix;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a DummySectionFragment (defined as a static inner class
        // below) with the page number as its lone argument.

        Fragment fragment = new DummySectionFragment();
        Bundle args = new Bundle();
        args.putString(DummySectionFragment.ARG_SECTION_NUMBER, "This feature isn't implemented since there isn't any screen shots available!");
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public int getItemPosition(Object object){
        return MobileAppPagerAdapter.POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "LIST OF MOBILE APPLICATIONS";
            case 1:
                return prefix + "DASHBOARD";
        }
        return null;
    }
}