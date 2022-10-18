package com.company.LinkedListSimple;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 6; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        for (int i = 0; i < 6; i++) {
            stack.pop();
        }
        System.out.println(stack);
    }
}
