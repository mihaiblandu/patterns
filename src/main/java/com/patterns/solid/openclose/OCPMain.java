package com.patterns.solid.openclose;
/*
* Strategy Example
* */
public class OCPMain {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.executeStrategy();
        context = new Context(new StrategyB());
        context.executeStrategy();
    }
}
