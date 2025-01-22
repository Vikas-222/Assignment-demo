package com.company.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

//        Write a program to count the frequency of words in a paragraph using a HashMap.

        String str = "HashMap is a part of Java’s collection since Java 1.2. " +
                "It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. " +
                "To access a value one must know its key. This class uses a technique called Hashing. Hashing is a technique of converting a large String to a small String that represents the same String." +
                "A shorter value helps in indexing and faster searches. Let’s see how to create a map object using this class.";

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        String[] strArray = str.split(" ");

        System.out.println(str);

        for (String s : strArray) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }

}

