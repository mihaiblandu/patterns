package com.patterns.structural.proxy;

import com.patterns.PatternsApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
        object.process();
        object.process();
        object.process();
        object.process();
        object.process();
        object.process();
        object.process();
    }
}
