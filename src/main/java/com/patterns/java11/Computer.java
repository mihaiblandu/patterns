package com.patterns.java11;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Computer implements FunctionalCompiuter{
    private String name;
    private String data;
    private String company;

    @Override
    public Computer createComputer() {
        return new Computer("New Computer","new Data","My Company");
    }



    public static Computer getInstance(Object o) {
        System.out.println(o.toString());
           return (Computer) o;
    }
}
