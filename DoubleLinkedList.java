package com.company.DoubleLinkedList;



public class DoubleLinkedList<T> implements InterfaceDoubleLinkedList<T> {
    private DLLNode<T> head;
    private DLLNode<T> tail;

    public DoubleLinkedList() {

        head = null;
        tail = null;
    }

    @Override
    public void addFirst(T data) {
        DLLNode<T> newNode = new DLLNode<>(data);
        if (isEmpty()) {
            //если список пустой то новый узел одновременно и голова и хвост
            head = tail = newNode;
        } else {
            //связываем новый узел с головой
            newNode.next = head;
            //связываем голову с новым узлом
            head.previous = newNode;
            //новый узел становится головой
            head = newNode;
        }

    }

    @Override
    public void addLast(T data) {
        DLLNode<T> newNode = new DLLNode<>(data);
        if (isEmpty()) {
            tail = head = newNode;
        } else {

            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;

        }
    }

    @Override
    public void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            }
            head =  head.next;
            head.previous.next = null;
            head.previous = null;
        }
    }

    @Override
    public void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            }
            tail = tail.previous;
            tail.next.previous = null;

            head.next = null;
        }

    }

    @Override
    public T getFirst() throws NullPointerException {
        if (isEmpty()) throw new NullPointerException("list is empty");

        return head.data;
    }

    @Override
    public T getLast() {
        if (isEmpty()) throw new NullPointerException("list is empty");

        return tail.data;
    }

    @Override
    public void removeAll() {
        DLLNode<T> current = head;
        while (current != null){
            current = current.next;
            current.previous.next = null;
            current.previous = null;
        }
        head = tail = null;
    }

    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        DLLNode<T> curr = head;
        while (curr != null){
            builder.append(curr.data.toString()).append(" ");
            curr = curr.next;
        }
        return builder.toString();
    }
}