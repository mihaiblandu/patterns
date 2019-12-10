package com.patterns.solid.openclose;

public interface Strategy {
    public void doSomething(Strategy strategy);

    default String test()
    {
        return "Name";
    }
}
