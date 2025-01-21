package com.company.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Assignment4 {

    public static void main(String[] args) {

//        Use a TreeSet to store and display a list of integers in ascending order

        System.out.println("------------Sorting-----------------");
        SortedSet<Integer> treeset = new TreeSet<>();
        treeset.add(10);
        treeset.add(899);
        treeset.add(34);
        treeset.add(333);
        treeset.add(22);
        treeset.add(1);

        System.out.println(treeset);
    }
}
