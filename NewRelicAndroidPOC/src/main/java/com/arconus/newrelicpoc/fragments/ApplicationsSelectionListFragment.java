package com.arconus.newrelicpoc.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.arconus.newrelicpoc.R;
import com.arconus.newrelicpoc.adapters.ApplicationsListAdapter;
import com.arconus.newrelicpoc.adapters.ApplicationsListDataOrb;

import java.util.ArrayList;
import java.util.List;

public class ApplicationsSelectionListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_selection_layout, null);
        ListView listView = (ListView) v.findViewById(R.id.listView);
        listView.setAdapter(getAdapter());
        return v;
    }

    private BaseAdapter getAdapter() {
        List<ApplicationsListDataOrb> list = new ArrayList<ApplicationsListDataOrb>();

        list.add(new ApplicationsListDataOrb("Aggregator", "5.6ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Aggregator 1", "0.00ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Aggregator 2", "226ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("BE", "142ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("BE Tracker Dashboard", "9.1ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Beacon 1", "0.56ms", "0.00% errors", R.color.NavDrawerRed));
        list.add(new ApplicationsListDataOrb("Beacon 2", "0.00ms", "0.00% errors", R.color.NavDrawerRed));
        list.add(new ApplicationsListDataOrb("Beacon 3", "18.5ms", "0.00% errors", R.color.NavDrawerYellow));
        list.add(new ApplicationsListDataOrb("Collector Proxy", "414ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Dev", "5.6ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Dirac Staging", "0.00ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Documentation", "312ms", "0.00% errors", R.color.NavDrawerYellow));
        list.add(new ApplicationsListDataOrb("Integration", "6.5ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Our People", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Pinger Production", "5.6ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Pinger Server Production", "0.00", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("RPM UI", "226ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Staging", "142ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Staging Aggregator", "9.1ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Staging Beacon", "0.56ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Staging Pinger - Server", "0.00ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Storefront", "18.6ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("System Uptime Dashboard", "414ms", "0.00% errors", R.color.NavDrawerGreen));

        return new ApplicationsListAdapter(getActivity(), R.layout.app_selection_list_item, list);
    }
}
