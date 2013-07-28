package com.arconus.newrelicpoc.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.arconus.newrelicpoc.R;

import java.util.List;

public class ApplicationsListAdapter extends ArrayAdapter<ApplicationsListDataOrb> {
public ApplicationsListAdapter(Context context, int resource, List<ApplicationsListDataOrb> objects) {
        super(context, resource, objects);
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View rowView = View.inflate(getContext(), R.layout.app_selection_list_item, null);

        ApplicationsListDataOrb dataOrb = getItem(position);

        TextView title = (TextView) rowView.findViewById(R.id.ap_title);
        title.setText(dataOrb.title);

        TextView responseTime = (TextView) rowView.findViewById(R.id.ap_response_time);
        responseTime.setText(dataOrb.responseTime);

        TextView errorRate = (TextView) rowView.findViewById(R.id.ap_error_rate);
        errorRate.setText(dataOrb.errorPercentage);

        TextView statusIndicator = (TextView) rowView.findViewById(R.id.ap_status_indicator);
        statusIndicator.setBackgroundColor(getContext().getResources().getColor(dataOrb.statusColorID));

        return rowView;
    }
}
