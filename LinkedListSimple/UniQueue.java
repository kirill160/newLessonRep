package com.company.LinkedListSimple;

public interface UniQueue<T> {
    boolean isEmpty();
    void addElement(T data);
    T removeElement();
    T peekFirst();
    T peekLast();

}
