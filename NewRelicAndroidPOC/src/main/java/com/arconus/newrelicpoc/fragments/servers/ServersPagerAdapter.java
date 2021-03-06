package com.arconus.newrelicpoc.fragments.servers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.arconus.newrelicpoc.fragments.DummySectionFragment;
import com.arconus.newrelicpoc.fragments.applications.ApplicationsDashboardFragment;

public class ServersPagerAdapter extends FragmentStatePagerAdapter {

    private String prefix;

    public ServersPagerAdapter(FragmentManager fm, String prefix) {
        super(fm);
        this.prefix = prefix;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a DummySectionFragment (defined as a static inner class
        // below) with the page number as its lone argument.
        if(position == 0) {
            return new ServerSelectionListFragment();
        }
        if(position == 1) {
            return new ApplicationsDashboardFragment();
        }

        Fragment fragment = new DummySectionFragment();
        Bundle args = new Bundle();
        args.putString(DummySectionFragment.ARG_SECTION_NUMBER, prefix + (position + 1));
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public int getItemPosition(Object object){
        return ServersPagerAdapter.POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "LIST OF SERVERS";
            case 1:
                return "DASHBOARD";
        }
        return null;
    }
}