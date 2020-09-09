package com.techreturners.cats;

public class CheetahCat implements Cat {

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
        return 45;
    }

    public String eat(){
        return "Zzzzzzz";
    }
}