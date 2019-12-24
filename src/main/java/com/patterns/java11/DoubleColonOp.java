package com.patterns.java11;

import java.util.ArrayList;
import java.util.List;

public class DoubleColonOp {

    public static void main(String[] args) {
        Computer computer = new Computer().createComputer();
        List list = new ArrayList();

        list.add(computer);
        list.add(computer);
        list.add(computer);
        list.add(computer);
        list.add(computer);
        list.add(computer);
        list.add(computer);

        Person person =new Person();

        List<Person> listPerson = new ArrayList();
        listPerson.add(person);
        listPerson.add(person);
        listPerson.add(person);
        listPerson.add(person);
        listPerson.add(person);
        listPerson.add(person);
        listPerson.add(person);
        listPerson.add(person);
        listPerson.add(person);

    }
}
