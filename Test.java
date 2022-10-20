package com.company.DoubleLinkedList;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList<String> str = new DoubleLinkedList<>();
        str.addLast("Vasya");
        str.addLast("Petya");
        str.addLast("Masha");
        System.out.println(str);

    }
}
