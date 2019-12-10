package com.patterns.solid.liskov;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patrulater {
    private int length;
    private int breadth;
    public double getArea() {
        return this.length * this.breadth;
    }
}
