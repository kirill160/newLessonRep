package com.company.LinkedListSimple;

public interface Stackable<T> {
    void push(T data);
    T peek();
    T pop();
    String toString();
    boolean isEmpty();
}
