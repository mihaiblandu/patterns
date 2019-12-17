package com.patterns.java11;

@FunctionalInterface
public interface FunctionalCompiuter {
    Computer createComputer();
    static void print(String str){
        System.out.println("Printing "+str);
    }

}

