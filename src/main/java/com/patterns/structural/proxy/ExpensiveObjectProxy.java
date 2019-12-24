package com.patterns.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObjectImpl expensiveObject;

    @Override
    public void process() {
        if (expensiveObject == null) {
            expensiveObject = new ExpensiveObjectImpl();
        }
        expensiveObject.process();
    }
}
