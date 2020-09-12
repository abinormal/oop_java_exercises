package com.techreturners.cats;

public class DomesticCat extends AbstractCat implements Cat {
    // Implement specific methods for each cat here
    
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