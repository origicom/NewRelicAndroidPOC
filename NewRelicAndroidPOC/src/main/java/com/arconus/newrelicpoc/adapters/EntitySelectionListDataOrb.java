package com.arconus.newrelicpoc.adapters;

public class EntitySelectionListDataOrb {
    public String title;
    public String minorStatTop;
    public String minorStatBottom;
    public int statusColorID;

    public EntitySelectionListDataOrb(String title, String minorStatTop, String minorStatBottom, int statusColorID) {
        this.title = title;
        this.minorStatTop = minorStatTop;
        this.minorStatBottom = minorStatBottom;
        this.statusColorID = statusColorID;
    }

    public EntitySelectionListDataOrb(String title, int statusColorID) {
        this.title = title;
        this.statusColorID = statusColorID;
    }
}
