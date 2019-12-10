package com.patterns.structural.decorator;

public class BridgeMain {
    public static void main(String[] args) {
        AbstractShape shape =new Triangle(new RedColor());
        System.out.println(shape.toString());
        System.out.println(shape.getColor());
    }
}
