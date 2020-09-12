package com.techreturners.cats;

public class CheetahCat extends AbstractCat implements Cat {
    // Implement specific methods for each cat here
    
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