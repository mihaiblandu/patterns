package com.patterns.DoubleColon;


public class Test {

    public void m2()
    {
        System.out.println("Method Reference");
    }

    public static void main(String[] args) {

        Runnable r = ( )->{
            for(int i= 0; i++ < 10;)
            {
                System.out.println("Child Thread");
            }
        };

        Runnable r2 = Test::demo;
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r2);
        Thread t4 = new Thread(r2);
        Thread t5 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        for(int i= 0; i++ < 10;)
        {
            System.out.println("Main Thread");
        }
        FunctionalTest test = (a,b)-> {
            FunctionalTest d = new FunctionalTest() {
                @Override
                public int methode(int a, int b) {
                    return a+b;
                }
            };
            d.doThis();
            return a + b;
        };

        FunctionalTest2 iFun = ()-> System.out.println("Lambda");
        Test t = new Test();
        iFun.method3();
        FunctionalTest2 iFun2 = t::m2;
        iFun2.method3();
        //System.out.println(test.methode(19,2));
    }

    private static void demo() {
        for(int i= 0; i++ < 10;)
        {
            System.out.println("Child Thread from static Metod");
        }
    }
}

@FunctionalInterface
 interface FunctionalTest {
    int methode(int a, int b);
    default void doThis()
    {
        System.out.println("Hello ");
    }
}
@FunctionalInterface
interface FunctionalTest2 {
    public void method3();
}

