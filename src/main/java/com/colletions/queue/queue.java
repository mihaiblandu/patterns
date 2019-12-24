package com.colletions.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Brad");
        queue.add("Angelina");
        queue.add("Julia");

        System.out.println("------------------");
        queue.forEach(System.out::println);
        Iterator<String> iteratorQueue = queue.iterator();
        System.out.println("------------------");
        Queue<String> el = queue;
        Iterator<String> it = el.iterator();
        System.out.println("------------------");
        //first.forEachRemaining(System.out::println);
        System.out.println("------------------");
        while (iteratorQueue.hasNext()) {
            System.out.println(iteratorQueue.next());
        }
        System.out.println("------------------");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------------");
        it = el.iterator();
        for (String e : queue)
        {
            System.out.println(e);
        }
    }

}
