package com.techreturners.cats;

interface Cat {
    //Can only declare a const here
    //public boolean isAsleep = false; <-doesn't work

    // Interface class contains 100% abstract methods    
    
    public String getSetting();
    public String eat();
    public int getAverageHeight();

    public boolean isAsleep();
    public void goToSleep();
    public void wakeUp();
    
}