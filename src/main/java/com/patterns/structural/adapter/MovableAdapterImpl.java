package com.patterns.structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable movable;
    public MovableAdapterImpl(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeed() {
        double mph = this.movable.getSpeed();
        return convertMPHtoKMPH(mph);
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
