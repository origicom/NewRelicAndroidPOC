package com.arconus.newrelicpoc.fragments.keytransactions;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.arconus.newrelicpoc.R;
import com.arconus.newrelicpoc.SelectionListItemClickListener;
import com.arconus.newrelicpoc.adapters.EntitySelectionListAdapter;
import com.arconus.newrelicpoc.adapters.EntitySelectionListDataOrb;

import java.util.ArrayList;
import java.util.List;

public class KeyTransactionsSelectionListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_selection_layout, null);
        ListView listView = (ListView) v.findViewById(R.id.listView);
        listView.setAdapter(getAdapter());
        listView.setOnItemClickListener(new SelectionListItemClickListener());
        return v;
    }

    private BaseAdapter getAdapter() {
        List<EntitySelectionListDataOrb> list = new ArrayList<EntitySelectionListDataOrb>();

        list.add(new EntitySelectionListDataOrb("App Breakdown Chart", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("App Dashboard", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("App Map", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("App Overview", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("CRM Page", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Documentation - Categories", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Event List Partial", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("Key Transaction Dashboard", R.color.NavDrawerGreen));

        return new EntitySelectionListAdapter(getActivity(), R.layout.selection_list_item, list);
    }
}
