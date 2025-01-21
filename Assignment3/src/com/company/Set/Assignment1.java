package com.company.Set;

import java.util.*;

public class Assignment1 {

    public static void main(String[] args) {

//        Create a program to:
//○ Add elements to a Set.
//○ Remove elements from a Set.
//○ Check if an element exists in a Set.
//○ Iterate over a Set

        System.out.println("--------------HashSet----------------");
        Set<String> set = new HashSet<String>();
        set.add("A101");
        set.add("A2");
        set.add("A301");
        set.add("A301");            //not inserted because of duplicate value
        set.add("A4");


        if (set.contains("A2")) {
            System.out.println("A2 is present");
        }

        System.out.println("Before remove, Set : " + set);

        set.remove("A301");                      //removes only one elements

        System.out.println("after remove, Set : " + set);

        System.out.println("iterate through forEach loop");
        for (String s : set) {
            System.out.print(s + " ");
        }

        System.out.println("");
        System.out.println("iterate through Iterator()");
        Iterator<String> it = set.iterator();
        while (it.hasNext() != false) {
            System.out.print(it.next() + " ");
        }

        System.out.println("");
        System.out.println("Stream api");
        set.stream().forEach(str -> System.out.printf(str + " "));

        // set.removeAll(set);                       //removes all elements from set
        // System.out.println(set);

        System.out.println("");

        System.out.println("--------------LinkedHashSet----------------");
        Set<String> set2 = new LinkedHashSet<String>();
        set2.add("A101");
        set2.add("A2");
        set2.add("A301");
        set2.add("A301");            //not inserted because of duplicate value
        set2.add("A4");


        if (set2.contains("A2")) {
            System.out.println("A2 is present");
        }

        System.out.println("Before remove, Set : " + set2);

        set2.remove("A301");                      //removes only one elements

        System.out.println("after remove, Set : " + set2);

        System.out.println("iterate through forEach loop");
        for (String s : set2) {
            System.out.print(s + " ");
        }

        System.out.println("");
        System.out.println("iterate through Iterator()");
        Iterator<String> iterate = set2.iterator();
        while (iterate.hasNext() != false) {
            System.out.print(iterate.next() + " ");
        }

        System.out.println();
        System.out.println("Stream api");
        set2.stream().forEach(str -> System.out.printf(str + " "));


        System.out.println("--------------TreeSet----------------");
        Set<String> set3 = new TreeSet<String>();
        set3.add("A101");
        set3.add("A2");
        set3.add("A301");
        set3.add("A301");            //not inserted because of duplicate value
        set3.add("A4");


        if (set3.contains("A2")) {
            System.out.println("A2 is present");
        }

        System.out.println("Before remove, Set : " + set3);

        set3.remove("A301");                      //removes only one elements

        System.out.println("after remove, Set : " + set3);

        System.out.println("iterate through forEach loop");
        for (String s : set3) {
            System.out.print(s + " ");
        }

        System.out.println("");
        System.out.println("iterate through Iterator()");
        Iterator<String> iterate1 = set3.iterator();
        while (iterate1.hasNext() != false) {
            System.out.print(iterate1.next() + " ");
        }

        System.out.println("");
        System.out.println("Stream api");
        set3.stream().forEach(str -> System.out.printf(str + " "));
        System.out.println("");
    }
}
