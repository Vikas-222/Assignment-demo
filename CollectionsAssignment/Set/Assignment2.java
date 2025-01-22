package com.company.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);

        System.out.println(" ");
        //headSet() print from starting to given till value but provided value will be exclusive
        TreeSet<Integer> headSet = new TreeSet<>();
        headSet = (TreeSet) set2.headSet(10);

        System.out.println("headset : "+headSet);


//        tailSet() print from given element to till end and by default given value is inclusive,
//        we can make it exclusive by passing false with element as parameter
        TreeSet<Integer> tailSet = new TreeSet<>();
        tailSet = (TreeSet) set2.tailSet(20,false);

        System.out.println("Tailset : "+tailSet);

        //headSet() print from given start element to given end element but end value will be exclusive
        TreeSet<Integer> subset = new TreeSet<>();
        subset = (TreeSet) set2.subSet(3,20);

        System.out.println(subset);
    }
}
