package com.company.Map;

import java.util.*;

public class Assignment3 {

    public static void main(String[] args) {

//        Store student IDs (keys) and their names (values) in a TreeMap. Display the sorted
//        entries by ID.

        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Arpan");
        map.put(5, "Vikas");
        map.put(7, "Aman");
        map.put(6, "Diven");
        map.put(8, "Xyz");
        map.put(3, "Krushit");
        map.put(4, "Vinay");
        map.put(2, "Akash");


        for (Map.Entry<Integer, String> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());


        System.out.println("The collection is: " + map.values());
    }
}
