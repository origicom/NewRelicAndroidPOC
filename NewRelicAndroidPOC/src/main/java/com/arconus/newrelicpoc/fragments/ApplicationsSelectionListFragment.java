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

        list.add(new ApplicationsListDataOrb("Aggregator", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Aggregator 1", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Aggregator 2", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("BE", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("BE Tracker Dashboard", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Beacon 1", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Beacon 2", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Beacon 3", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Collector Proxy", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Dev", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Dirac Staging", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Documentation", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Integration", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Our People", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Pinger Production", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Pinger Server Production", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("RPM UI", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Staging", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Staging Aggregator", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Staging Beacon", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Staging Pinger - Server", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("Storefront", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new ApplicationsListDataOrb("System Uptime Dashboard", "128ms", "0.00% errors", R.color.NavDrawerGreen));

        return new ApplicationsListAdapter(getActivity(), R.layout.app_selection_list_item, list);
    }
}
