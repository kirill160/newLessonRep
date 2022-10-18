package com.company.Generic;

import java.util.ArrayList;

public class HeavyBox {
    private int weight;
    public HeavyBox(){
        weight = 0;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public boolean changeWeight(int change) {
        boolean result = true;
        if (weight + change <= 0) {
            result = false;
        } else {
            weight += change;
        }
        return result;
    }


    public HeavyBox(int weight){
        this.weight = weight;
    }
    public String toString(){
        return "Box weight " + weight + " ";
    }
}
