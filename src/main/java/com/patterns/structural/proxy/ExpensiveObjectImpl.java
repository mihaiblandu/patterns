package com.patterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExpensiveObjectImpl implements ExpensiveObject {
    public ExpensiveObjectImpl() {
        heavyConfiguration();
    }

    private void heavyConfiguration() {
        log.info("Heavy Configuration");
    }

    @Override
    public void process() {
        log.info("Process has run");
    }
}
