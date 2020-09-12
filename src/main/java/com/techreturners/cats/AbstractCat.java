package com.techreturners.cats;

 // Is this really an abstract class? none of the methods are abstract
public abstract class AbstractCat {
   
    // Save duplicating code by creating seperate class to extend functionality

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
}