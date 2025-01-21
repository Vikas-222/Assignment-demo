package com.company;

import java.util.*;

public class ListMapSetExample {

    public static void main(String[] args) {

//        1. Write a program that:
//○ Reads a list of names from the user.
//○ Stores unique names in a Set.
//○ Counts the frequency of each name using a Map.
//○ Displays the sorted list of names and their counts.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names with space in between");
        String str = sc.nextLine();

        Set<String> set = new TreeSet<>();
        String[] strArray = str.split(" ");

        for (String s : strArray) {
            set.add(s);
        }

        System.out.print("Unique names:");
        for (String s : set) {
            System.out.print(s + " ");
        }

        Map<String, Integer> map = new TreeMap<>();

        for (String s : set) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }


        System.out.println("\nName frequency");
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());

    }
}
