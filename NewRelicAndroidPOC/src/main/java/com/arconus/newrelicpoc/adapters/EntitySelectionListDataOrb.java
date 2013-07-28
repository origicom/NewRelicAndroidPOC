package com.arconus.newrelicpoc.adapters;

public class EntitySelectionListDataOrb {
    public String title;
    public String responseTime;
    public String errorPercentage;
    public int statusColorID;

    public EntitySelectionListDataOrb(String title, String responseTime, String errorPercentage, int statusColorID) {
        this.title = title;
        this.responseTime = responseTime;
        this.errorPercentage = errorPercentage;
        this.statusColorID = statusColorID;
    }
}
