package com.arconus.newrelicpoc;

import android.view.View;
import android.widget.AdapterView;

import com.arconus.newrelicpoc.adapters.EntitySelectionListDataOrb;
import com.arconus.newrelicpoc.events.SelectionListItemSelectedEvent;

public class SelectionListItemClickListener implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        EntitySelectionListDataOrb dataOrb = (EntitySelectionListDataOrb) parent.getItemAtPosition(position);
        Application.bus.post(new SelectionListItemSelectedEvent(dataOrb));
    }
}
