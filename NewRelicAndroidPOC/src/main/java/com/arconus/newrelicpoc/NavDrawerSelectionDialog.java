package com.arconus.newrelicpoc;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowManager.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class NavDrawerSelectionDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.list_selection_layout, null);
        ListView listView = (ListView) layout.findViewById(R.id.listView);

        listView.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, new String [] {
                "Aggregator",
                "Aggregator 1",
                "Aggregator 2",
                "BE",
                "BE Tracker Dashboard",
                "Beacon 1",
                "Beacon 2",
                "Beacon 3",
                "Collector Proxy",
                "Dev",
                "Dirac Staging",
                "Documentation",
                "Integration",
                "Our People",
                "Pinger Production",
                "Pinger Server Production",
                "RPM UI",
                "Staging",
                "Staging Aggregator",
                "Staging Beacon",
                "Staging Pinger - Server",
                "Storefront",
                "System Uptime Dashboard"}));

        dialog.setContentView(layout);
        dialog.setTitle("Select a XXXXX");
        dialog.getWindow().setLayout(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
        return dialog;
    }
}
