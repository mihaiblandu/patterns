package com.patterns.structural.twowayadapter;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
