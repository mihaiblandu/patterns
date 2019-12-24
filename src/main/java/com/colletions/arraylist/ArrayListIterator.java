package com.colletions.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListIterator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);


        System.out.println("-------");
        System.out.println("First case");
        Iterator<Integer> iterator = numbers.iterator();

        iterator.forEachRemaining(System.out::println);
        System.out.println("-------");
        System.out.println("Second case");
        numbers.stream().filter(el->el>10).collect(Collectors.toList()).forEach(System.out::println);

        /*
        * άμ(β)δα
        * */

        List<String> names = Arrays.asList("13","7","Zero","null","X");
        System.out.println("-------");
        System.out.println("First case");
        Iterator<String> namesIterator = names.iterator();
        namesIterator.forEachRemaining(System.out::println);
        System.out.println("-------");
        System.out.println("Second case");
        names.stream().filter(el->!el.equals("Zero")).collect(Collectors.toList()).forEach(System.out::println);

    }
}
