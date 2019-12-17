package com.patterns.java11;

@FunctionalInterface
public interface FunctionalPerson {
    void methode();
    static void print(String str){
        System.out.println("Printing "+str);
    }

}

