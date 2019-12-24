package com.patterns.java11;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {
        return person.birthday.compareTo(t1.birthday) ;
    }
}
