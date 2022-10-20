package com.company.DoubleLinkedList;

import com.company.LinkedListSimple.Node;

public class DLLNode<T>  {
    T data;
    public DLLNode<T> previous;
           DLLNode<T> next;
    public DLLNode(T data) {
        this.data = data;
        this.next = next;
        this.previous = null;
    }
}
