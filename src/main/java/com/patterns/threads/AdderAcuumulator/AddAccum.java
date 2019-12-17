package com.patterns.threads.AdderAcuumulator;

import java.util.concurrent.atomic.AtomicLong;

public class AddAccum {

    static  Number counter = new AtomicLong(0);
    static int intConter = 0;
    public static void main(String[] args) {

        Task task = new Task();
        task.run();

        int i = 1000;
        while (i--!=0)
            new Task().run();

        System.out.println(counter);
        i = 1000;
        while (i--!=0)
            new TaskB().run();

        System.out.println(intConter);
    }

    private static class Task implements Runnable{

        @Override
        public void run() {
            ((AtomicLong)counter).incrementAndGet();
        }
    }
    private static class TaskB implements Runnable{

        @Override
        public void run() {
            intConter++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
