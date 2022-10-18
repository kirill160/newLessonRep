package com.company.LinkedListSimple;

public class Node<T> {
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
