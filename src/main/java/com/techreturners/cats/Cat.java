package com.techreturners.cats;

interface Cat {
    //Can only declare a const here
    //public boolean isAsleep = false;

    public boolean isAsleep();
    public void goToSleep();
    public void wakeUp();
    public String getSetting();
    public String eat();
    public int getAverageHeight();
}