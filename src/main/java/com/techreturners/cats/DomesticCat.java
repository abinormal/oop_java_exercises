package com.techreturners.cats;

public class DomesticCat implements Cat {

    private boolean isAsleep = false;

    public boolean isAsleep() {
        return this.isAsleep;
    }
    public void goToSleep() {
        isAsleep = true;
    } 

    public void wakeUp() {
        isAsleep = false;
    }

    public String getSetting() {
        return "domestic";
    }

    public int getAverageHeight() {
        return 23;
    }

    public String eat(){
        return "Purrrrrrr";
    }
}