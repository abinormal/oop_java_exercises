package com.techreturners.cats;

public class LionCat implements Cat {
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
        return "wild";
    }

    public int getAverageHeight() {
        return 1100;
    }

    public String eat(){
        return "Roar!!!!";
    }
}