package com.colletions.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddElement {
    public static void main(String[] args) {
        // Creating an ArrayList of String using
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        animals.addAll(animals);


        System.out.println(animals);
        animals.addAll(1,animals);

        System.out.println(animals);
    }
}
