package com.company.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BoxStorage {
   private final List<HeavyBox> listOfBoxes;

   public BoxStorage(){
       listOfBoxes = new ArrayList<>();
   }
   public BoxStorage(List<HeavyBox> listOfBoxes){
        //this.listOfBoxes = (List<HeavyBox>) listOfBoxes.clone();
       /*for (int i = 0; i < listOfBoxes.size(); i++) {
           this.listOfBoxes.add(listOfBoxes.get(i));

       }*/
       this();
      this.listOfBoxes.addAll(listOfBoxes);
   }
   public boolean changeWeightOfBox(int index, int change){
       boolean result = true;
       if(index < 0 || index > listOfBoxes.size() -1){
           result = false;
       }
       if(!listOfBoxes.get(index).changeWeight(change)){
           result = false;
       }

       return result;
   }
   public HeavyBox[] getArray(){
       return (HeavyBox[]) listOfBoxes.toArray();
   }

    @Override
    public String toString() {
        return "BoxStorage{" +
                "listOfBoxes=" + listOfBoxes +
                '}';
    }
}
