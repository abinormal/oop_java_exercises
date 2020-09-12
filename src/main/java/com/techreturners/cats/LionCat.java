package com.techreturners.cats;

public class LionCat extends AbstractCat implements Cat {
    // Implement specific methods for each cat here
    
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