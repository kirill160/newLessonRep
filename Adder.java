package com.company.Generic;

import java.util.ArrayList;
import java.util.List;

public class Adder {
    public static void main(String[] args) {
//        // без дженерика
//        List list = new ArrayList<>();
//        list.add("Cat");
//        list.add("Dog");
//        list.add("Horse");
//        String firstAnimal = (String) list.get(0);
//        // c дженериком
//        List<String> listAnimal = new ArrayList<>();
//        listAnimal.add("Cat1");
//        listAnimal.add("Dog1");
//        listAnimal.add("Horse1");
//        String firstAnimal1 = listAnimal.get(0);
        Mage m = new Mage();
        m.cast();
        m.hit();
        m.move();
    }
}
//ходить
interface canMove {
    void move();
}
        //летать
        //бить
interface canHit {
            void hit();
        }
        //стрелять
        //колдовать
interface canCast{
    void cast();

}
class Mage implements canCast,canHit,canMove{

    @Override
    public void move() {
        System.out.println("Mage moving");

    }

    @Override
    public void hit() {
        System.out.println("Mage hiting");

    }

    @Override
    public void cast() {
        System.out.println("Mage casting");
    }
}