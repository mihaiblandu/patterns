package com.colletions.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
*   FILO  Coada
* */
public class QueueExample {
    public static void main(String[] args) {
        // Create and initialize a Queue using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding new elements to the Queue (The Enqueue operation)
        queue.add("Michael");
        queue.add("Chris");
        queue.add("John");
        queue.add("Mark");
        queue.add("Steven");


        System.out.println("queue : " + queue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        String name = queue.remove();
        System.out.println("Removed from queue : " + name + " | New queue : " + queue);
        queue.add("Anna");

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
        name = queue.poll();
        System.out.println("Removed from queue : " + name + " | New queue : " + queue);
        queue.add("Maria");
        name = queue.peek();
        System.out.println("Peek from queue : " + name + " | New queue : " + queue);
        name =null;
        queue.add("Pappy");
        name = queue.element();
        System.out.println("Element from queue : " + name + " | New queue : " + queue);
    }
}