package com.colletions.arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListObjectSorting {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Michael",31),
                new Person("John",27),
                new Person("Finn",16),
                new Person("Cris",30),
                new Person("Harry",36),
                new Person("Marry",12),
                new Person("Harold",55),
                new Person("Ash",25),
                new Person("Leon",20),
                new Person("Alex",32),
                new Person("Matt",45)
        );

// Sort People by their Age
        System.out.println("------------");
        people.sort((p1, p2) ->p1.getAge() - p2.getAge());
        people.forEach(System.out::println);

        // A more simple way of writing the above sorting function
        System.out.println("------------");
        people.sort(Comparator.comparing(Person::getName));
        people.forEach(System.out::println);
        System.out.println("------------");
        people.sort(Comparator.comparingInt(Person::getAge));
        people.forEach(System.out::println);

        // Following is an even more concise solution
        System.out.println("------------");
        System.out.println("Natural order");
        List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());
        list.sort(Comparator.naturalOrder());
        list.forEach(System.out::println);
    }
}
