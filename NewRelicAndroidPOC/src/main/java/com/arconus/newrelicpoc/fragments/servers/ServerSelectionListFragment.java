package com.arconus.newrelicpoc.fragments.servers;

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

public class ServerSelectionListFragment extends Fragment {

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

        list.add(new EntitySelectionListDataOrb("nr-chi-acct-1", "CPU 10.0%", "RAM 29.1%", R.color.NavDrawerRed));
        list.add(new EntitySelectionListDataOrb("chi-hudson", "CPU 1.3%", "RAM 19.1%", R.color.NavDrawerYellow));
        list.add(new EntitySelectionListDataOrb("chi-staging-bg-2", "CPU 76%", "RAM 87%", R.color.NavDrawerYellow));
        list.add(new EntitySelectionListDataOrb("nr-chi-acct-2", "CPU 20.6%", "RAM 30.1%", R.color.NavDrawerYellow));
        list.add(new EntitySelectionListDataOrb("nr-chi-util", "CPU 1.3%", "RAM 18.4%", R.color.NavDrawerYellow));
        list.add(new EntitySelectionListDataOrb("NR-Storage1", "CPU 0.58%", "RAM 0.58%", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("NR-Storage2", "CPU 0.55%", "RAM 3.4%", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("chi-beacon-1", "CPU 21.9%", "RAM 73%", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("chi-beacon-2", "CPU 18.9%", "RAM 72%", R.color.NavDrawerGreen));
        list.add(new EntitySelectionListDataOrb("chi-hsp-1", "CPU 0.12%", "RAM 0.88%", R.color.NavDrawerGreen));


        return new EntitySelectionListAdapter(getActivity(), R.layout.selection_list_item, list);
    }
}
