package com.patterns.DoubleColon;

public class Test2 {
    public static void main(String[] args) {
        Interf i = ()-> new Sample();
        i.m1().info();

        //Sysntax write for the  xonstaructor and static methods

        Interf i2 = Sample::new;
        i2.m1().info();
        InterfB i3 = Sample::new;
        i3.m1("hello").info();
    }
}

@FunctionalInterface
interface Interf{
    Sample m1();
}

@FunctionalInterface
interface InterfB{
    Sample m1(String s);
}
