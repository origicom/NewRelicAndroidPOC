package com.arconus.newrelicpoc.events;

import com.arconus.newrelicpoc.adapters.EntitySelectionListDataOrb;

public class SelectionListItemSelectedEvent {

    public EntitySelectionListDataOrb dataOrb;

    public SelectionListItemSelectedEvent(EntitySelectionListDataOrb dataOrb) {
        this.dataOrb = dataOrb;
    }
}
