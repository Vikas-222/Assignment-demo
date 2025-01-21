package com.company.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Assignment4 {

    public static void main(String[] args) {

//        Convert a Map into two separate lists:
//○ A list of keys.
//○ A list of values

        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Arpan");
        map.put(5, "Vikas");
        map.put(7, "Aman");
        map.put(6, "Diven");
        map.put(8, "Xyz");
        map.put(3, "Krushit");
        map.put(4, "Vinay");
        map.put(2, "Akash");

        List<Integer> listKey = new ArrayList<Integer>(map.keySet());

        List<String> listValue = new ArrayList<String>(map.values());

        System.out.println("List of keys");
        for (Integer i : listKey) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("List of Values");
        for (String i : listValue) {
            System.out.print(i + " ");
        }
    }
}
