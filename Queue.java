package com.company.LinkedListSimple;

public class Queue<T> implements UniQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    Queue(){
        head = null;
        tail = null;

    }
    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    @Override
    public void addElement(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;

        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public T removeElement() {
        T queueHeadData = peekFirst();
        if(isEmpty()){
            throw new NullPointerException("Queue is empty");
        }
        if (head == tail){
            queueHeadData = head.data;
            head = tail =  null;

        }else {
            queueHeadData = head.data;
            head = head.next;
        }
        return queueHeadData;
    }

    @Override
    public T peekFirst() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("Queue is empty");

        }
        return head.data;
    }

    @Override
    public T peekLast() {
        return null;
    }


    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null){
            sb.append(current.data.toString()).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}
