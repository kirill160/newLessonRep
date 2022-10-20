package com.company.DoubleLinkedList;

public interface InterfaceDoubleLinkedList<T> {
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void removeLast();
    T getFirst();
    T getLast();
    void removeAll();
    boolean isEmpty();

}
