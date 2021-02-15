package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        int maxCapacity = 5;
        MyStack stack = new MyStack(maxCapacity);
        stack.pop();
        stack.push(30);
        stack.push(40);
        stack.push(10);
        stack.push(20);
        System.out.println("Element at top /peek = "+ stack.peek());
        stack.push(50);
        stack.push(60);
        System.out.println("No. of elements in stack = "+ stack.size());
        stack.traverse();
        System.out.println();
        System.out.println("Search element 60 = " + stack.search(60));
    }
}
