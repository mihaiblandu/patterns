package com.patterns.solid.openclose;

public class StrategyB implements Strategy {
    @Override
    public void doSomething(Strategy strategy) {
        System.out.println("Strategy B");
    }
}
