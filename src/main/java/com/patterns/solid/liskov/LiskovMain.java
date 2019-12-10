package com.patterns.solid.liskov;


public class LiskovMain {


    public static void main(String[] args) {
        LiskovMain liskovMain = new LiskovMain();
        liskovMain.calculateArea(new Patrulater());
        liskovMain.calculateArea(new Patrat());
    }

    private double calculateArea(Patrulater patrulater) {
        patrulater.setBreadth(100);
        patrulater.setLength(200);

        System.out.println(patrulater.getArea());
    return patrulater.getArea();
    }
}
