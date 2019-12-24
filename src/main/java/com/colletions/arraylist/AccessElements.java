package com.colletions.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + list.isEmpty());

        list.add("Google");
        list.add("Apple");
        list.add("Microsoft");
        list.add("Amazon");
        list.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + list.size() + " companies in the world");
        System.out.println(list);

        // Retrieve the element at a given index
        String bestCompany = list.get(0);
        String secondBestCompany = list.get(1);
        String lastCompany = list.get(list.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        // Modify the element at a given index
        list.set(4, "Walmart");
        System.out.println("Modified top companies list: " + list);
    }
}
