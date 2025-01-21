package com.company.Map;

import java.util.HashMap;
import java.util.Map;

public class Assignment1 {

    public static void main(String[] args) {

//        Create a program to:
//○ Add key-value pairs to a Map.
//○ Retrieve a value by key.
//○ Check if a key or value exists.
//○ Remove a key-value pair.
//○ Iterate over the Map using:
//■ keySet
//■ entrySet
//■ values
//○ Use HashMap for the above tasks.

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Arpan");
        map.put(2, "Vikas");
        map.put(3, "Krushit");
        map.put(4, "Vinay");
        map.put(5, "Akash");

        System.out.println("Value of the key:3 is " + map.get(3));

        //to check key exists or not
        if (map.containsKey(5) == true) {
            System.out.println("key exists");
        }

        //to check value exists or not
        if (map.containsValue("Krushit") == true) {
            System.out.println("Value exists");
        }

        map.remove(5, "Akash");

        System.out.print("Map values : ");
        for (Map.Entry<Integer, String> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());

    }
}
