package com.patterns.solid.liskov;

public class Patrat extends Patrulater {
    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setBreadth(length);
    }

    @Override
    public void setBreadth(int breadth) {
        super.setLength(breadth);
        super.setBreadth(breadth);
    }
}
