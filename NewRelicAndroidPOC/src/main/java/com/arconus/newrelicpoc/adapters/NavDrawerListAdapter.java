package com.arconus.newrelicpoc.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.arconus.newrelicpoc.R;

import java.util.List;

public class NavDrawerListAdapter extends ArrayAdapter<NavDrawerDataOrb> {
    public NavDrawerListAdapter(Context context, int resource, List<NavDrawerDataOrb> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = View.inflate(getContext(), R.layout.nav_drawer_list_item, null);

        NavDrawerDataOrb dataOrb = getItem(position);

        ImageView imageView = (ImageView)rowView.findViewById(R.id.nd_item_icon);
        imageView.setImageDrawable(getContext().getResources().getDrawable(dataOrb.iconResID));

        TextView title = (TextView) rowView.findViewById(R.id.nd_item_title);
        title.setText(dataOrb.title);

        setFlags(rowView, dataOrb);

        return rowView;
    }

    private void setFlags(View rowView, NavDrawerDataOrb dataOrb) {
        TextView greenFlag = (TextView) rowView.findViewById(R.id.nd_item_green_box);
        TextView yellowFlag = (TextView) rowView.findViewById(R.id.nd_item_yellow_box);
        TextView redFlag = (TextView) rowView.findViewById(R.id.nd_item_red_box);


        if(dataOrb.isAlertDataOrb()) {
            greenFlag.setVisibility(View.INVISIBLE);
            yellowFlag.setVisibility(View.INVISIBLE);
            redFlag.setText(String.valueOf(dataOrb.greyNumber));
            redFlag.setBackgroundColor(getContext().getResources().getColor(R.color.AlertGrey));
        }
        else {
            greenFlag.setText(String.valueOf(dataOrb.greenNumber));
            yellowFlag.setText(String.valueOf(dataOrb.yellowNumber));
            redFlag.setText(String.valueOf(dataOrb.redNumber));
        }
    }
}


