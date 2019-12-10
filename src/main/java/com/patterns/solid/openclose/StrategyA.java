package com.patterns.solid.openclose;

public class StrategyA implements Strategy {

    @Override
    public void doSomething(Strategy strategy) {
        System.out.println("Strategy A");
    }
}
