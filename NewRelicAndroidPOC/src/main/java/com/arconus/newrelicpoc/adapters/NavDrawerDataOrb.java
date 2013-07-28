package com.arconus.newrelicpoc.adapters;

public class NavDrawerDataOrb {

    public int iconResID;
    public String title;
    public int greenNumber;
    public int yellowNumber;
    public int redNumber;
    public int greyNumber;

    public NavDrawerDataOrb(int iconResID, String title, int greenNumber, int yellowNumber, int redNumber) {
        this.iconResID = iconResID;
        this.title = title;
        this.greenNumber = greenNumber;
        this.yellowNumber = yellowNumber;
        this.redNumber = redNumber;
        this.greyNumber = -1;
    }

    public NavDrawerDataOrb(int iconResID, String title, int greyNumber) {
        this.iconResID = iconResID;
        this.title = title;
        this.greyNumber = greyNumber;
        this.greenNumber = -1;
        this.yellowNumber = -1;
        this.redNumber = -1;
    }

    public boolean isAlertDataOrb() {
        return greyNumber > -1;
    }
}
