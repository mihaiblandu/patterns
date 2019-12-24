package com.patterns.structural.decorator;

public abstract class AbstractShape {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public AbstractShape(Color c){
        this.color=c;
    }

    abstract public void applyColor();

}
