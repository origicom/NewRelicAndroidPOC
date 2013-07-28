package com.arconus.newrelicpoc.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.arconus.newrelicpoc.R;
import com.arconus.newrelicpoc.adapters.EntitySelectionListAdapter;
import com.arconus.newrelicpoc.adapters.EntitySelectionListDataOrb;

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
        List<EntitySelectionListDataOrb> list = new ArrayList<EntitySelectionListDataOrb>();

        list.add(new EntitySelectionListDataOrb("Aggregator", "5.6ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Aggregator 1", "0.00ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Aggregator 2", "226ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("BE", "142ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("BE Tracker Dashboard", "9.1ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Beacon 1", "0.56ms", "0.00% errors", R.color.NavDrawerRed));
        list.add(new EntitySelectionListDataOrb("Beacon 2", "0.00ms", "0.00% errors", R.color.NavDrawerRed));
        list.add(new EntitySelectionListDataOrb("Beacon 3", "18.5ms", "0.00% errors", R.color.NavDrawerYellow));
        list.add(new EntitySelectionListDataOrb("Collector Proxy", "414ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Dev", "5.6ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Dirac Staging", "0.00ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Documentation", "312ms", "0.00% errors", R.color.NavDrawerYellow));
        list.add(new EntitySelectionListDataOrb("Integration", "6.5ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Our People", "128ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Pinger Production", "5.6ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Pinger Server Production", "0.00", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("RPM UI", "226ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Staging", "142ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Staging Aggregator", "9.1ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Staging Beacon", "0.56ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Staging Pinger - Server", "0.00ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Storefront", "18.6ms", "0.00% errors", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("System Uptime Dashboard", "414ms", "0.00% errors", R.color.NavDrawerGreen));

        return new EntitySelectionListAdapter(getActivity(), R.layout.selection_list_item, list);
    }
}
