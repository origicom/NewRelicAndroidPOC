package com.arconus.newrelicpoc.fragments.keytransactions;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.arconus.newrelicpoc.fragments.DummySectionFragment;

public class KeyTransactionsPagerAdapter extends FragmentStatePagerAdapter {

    private String prefix;

    public KeyTransactionsPagerAdapter(FragmentManager fm, String prefix) {
        super(fm);
        this.prefix = prefix;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a DummySectionFragment (defined as a static inner class
        // below) with the page number as its lone argument.
        if(position == 0) {
            return new KeyTransactionsSelectionListFragment();
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
        return KeyTransactionsPagerAdapter.POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "LIST OF KEY TRANSACTIONS";
            case 1:
                return prefix + "SECTION 2";
            case 2:
                return prefix + "SECTION 3";
        }
        return null;
    }
}