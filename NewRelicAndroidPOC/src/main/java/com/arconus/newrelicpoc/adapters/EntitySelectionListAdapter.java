package com.arconus.newrelicpoc.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.arconus.newrelicpoc.R;

import java.util.List;

public class EntitySelectionListAdapter extends ArrayAdapter<EntitySelectionListDataOrb> {
public EntitySelectionListAdapter(Context context, int resource, List<EntitySelectionListDataOrb> objects) {
        super(context, resource, objects);
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View rowView = View.inflate(getContext(), R.layout.selection_list_item, null);

        EntitySelectionListDataOrb dataOrb = getItem(position);

        TextView title = (TextView) rowView.findViewById(R.id.sl_title);
        title.setText(dataOrb.title);

        TextView minorStatTop = (TextView) rowView.findViewById(R.id.sl_minor_stat_top);
        minorStatTop.setText(dataOrb.minorStatTop);

        TextView minorStatBottom = (TextView) rowView.findViewById(R.id.sl_minor_stat_bottom);
        minorStatBottom.setText(dataOrb.minorStatBottom);

        TextView statusIndicator = (TextView) rowView.findViewById(R.id.sl_status_indicator);
        statusIndicator.setBackgroundColor(getContext().getResources().getColor(dataOrb.statusColorID));

        return rowView;
    }
}
