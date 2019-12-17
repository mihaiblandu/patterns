package com.patterns.threads.AdderAcuumulator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;

@Getter
@Setter
public class AddAccumTest {
private static LongAccumulator counter = new LongAccumulator((x,y)->x + y, 0);
 private int inter;
    public static void main(String[] args) {
        AddAccumTest a = new AddAccumTest();
        a.setInter(2);
        System.out.println(a.getInter());
        int i = 130;
        ExecutorService service = Executors.newFixedThreadPool(16);
        while (i--!=0) {
            service.submit(new Task(counter));
        }

        System.out.println(">>>\n"  + counter);
    }

    @AllArgsConstructor
    private static class Task implements Runnable{
        private final LongAccumulator counterInner;

        @Override
        public void run()
        {
            counterInner.accumulate(1);
        }
    }

}
