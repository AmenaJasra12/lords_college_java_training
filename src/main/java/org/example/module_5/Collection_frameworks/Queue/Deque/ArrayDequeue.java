package org.example.module_5.Collection_frameworks.Queue.Deque;

import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args) {
        // declare Queue
        ArrayDeque<Integer> myQeueue = new ArrayDeque<>();
        // 10 20 30 40

        // Enqueue - add elements to the end of the queue
        myQeueue.offer(10);
        myQeueue.offer(20);
        myQeueue.offer(30);
        myQeueue.offer(40);

        // Dequeue - remove elements from the front of the queue
        Integer removedElement = myQeueue.poll();
        System.out.println("Removed element: " + removedElement); // 10

        removedElement = myQeueue.poll();

        System.out.println("Removed element: " + removedElement); // 20

        Integer frontElement = myQeueue.peek();

        System.out.println("Front element (peek): " + frontElement); // 30
    }
}
