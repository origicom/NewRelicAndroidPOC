package com.arconus.newrelicpoc.adapters;

public class ApplicationsListDataOrb {
    public String title;
    public String responseTime;
    public String errorPercentage;
    public int statusColorID;

    public ApplicationsListDataOrb(String title, String responseTime, String errorPercentage, int statusColorID) {
        this.title = title;
        this.responseTime = responseTime;
        this.errorPercentage = errorPercentage;
        this.statusColorID = statusColorID;
    }
}
