package com.patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdapterMain {
    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();

        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        log.info("Bugatti Veyron Super Sport's top speed is \n" + bugattiVeyronAdapter.getSpeed() + " Kmph.");

    }
}
