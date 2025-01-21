package com.company.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment2 {

    public static void main(String[] args) {

//        Write a program to remove duplicate words from a sentence using a Set

        System.out.println("------------------------------------------");
        Set<String> set1 = new LinkedHashSet<>();

        String str = "The Set Interface is present in java.util package and extends the Collection interface. It is an unordered collection of objects in which duplicate values cannot be stored. It is an interface that implements the mathematical set.";
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            set1.add(str1[i]);
        }

        System.out.println(set1);
        System.out.println("");
    }
}
