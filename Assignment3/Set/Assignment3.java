package com.company.Set;

import java.util.HashSet;
import java.util.Set;

public class Assignment3 {

    public static void main(String[] args) {

//        Write a program to perform set operations:
//○ Union: Combine two sets.
//○ Intersection: Find common elements in two sets.
//○ Difference: Find elements in one set but not the other.

        System.out.println("------------------Union---------------");
        Set<Integer> intSet = new HashSet<>();
        intSet.add(100);
        intSet.add(101);
        intSet.add(110);
        intSet.add(140);
        intSet.add(330);
        System.out.println("Set1 :" + intSet);

        Set<Integer> intSet2 = new HashSet<>();
        intSet2.add(10);
        intSet2.add(11);
        intSet2.add(11);
        intSet2.add(14);
        intSet2.add(33);
        System.out.println("Set2 :" + intSet2);

        intSet.addAll(intSet2);
        System.out.println(intSet);
        System.out.println("");


        System.out.println("-----------------Intersection---------------");
        Set<Integer> intersectSet1 = new HashSet();
        intersectSet1.add(10);
        intersectSet1.add(50);
        intersectSet1.add(59);
        intersectSet1.add(28);
        intersectSet1.add(14);
        System.out.println("Set1 :" + intersectSet1);

        Set<Integer> intersectSet2 = new HashSet();
        intersectSet2.add(16);
        intersectSet2.add(54);
        intersectSet2.add(59);
        intersectSet2.add(28);
        intersectSet2.add(14);
        System.out.println("Set2 :" + intersectSet2);

        Set<Integer> common = new HashSet<>(intersectSet1);
        common.retainAll(intersectSet2);

        System.out.println("Common intersection: " + common);
        System.out.println("");


        System.out.println("-----------------Difference---------------");
        Set<Integer> diffset1 = new HashSet();
        diffset1.add(11);
        diffset1.add(30);
        diffset1.add(59);
        diffset1.add(28);
        diffset1.add(14);
        System.out.println("Set1 :" + diffset1);

        Set<Integer> diffset2 = new HashSet();
        diffset2.add(16);
        diffset2.add(54);
        diffset2.add(59);
        diffset2.add(28);
        diffset2.add(14);
        System.out.println("Set2 :" + diffset2);

        diffset1.removeAll(diffset2);
        System.out.println("Elements which are in set1 but not in set2: " + diffset1);
//        diffset2.removeAll(diffset1);

        /*  if we execute above code then diffset1 will be
        considered as the output of diffset1.removeAll(diffset2)    */
//        System.out.println("Elements which are in set2 but not in set1: " + diffset2);

        System.out.println("");
    }
}
