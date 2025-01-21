package com.company.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment1 {

    public static void main(String[] args) {

//        Create a program to:
//○ Add elements to a List.
//○ Retrieve an element by index.
//○ Iterate over the List

        List<String> list2 = new LinkedList<>();      //maintains insertion order
        list2.add("A1");
        list2.add("A5");
        list2.add("A3");
        list2.add("3025");
        list2.add("A65");

        System.out.println("LinkedList :" + list2);
        System.out.println("3rd index element: " + list2.get(3));

        System.out.println("--------------iterate through for loop-------------");
        System.out.print("LinkedList : ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print("LinkedList : " + list2.get(i));
        }
        System.out.println("");

        System.out.println("");
        System.out.println("--------------iterate through forEach loop-------------");
        System.out.print("LinkedList : ");
        for (String s : list2) {
            System.out.print(s + " ");
        }
        System.out.println("");


        System.out.println("");
        System.out.println("---------------------iterate through Iterator()-------------");
        Iterator<String> iterate = list2.iterator();
        while (iterate.hasNext() != false) {
            System.out.print(iterate.next() + " ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("---------------Stream api----------------");
        list2.stream().forEach(str -> System.out.printf(str + " "));
        System.out.println("");

        System.out.println(" ");
        System.out.println("LinkedList :" + list2);
        list2.remove(3);
        System.out.println("3rd index element removed: " + list2);
        list2.remove("A5");
        System.out.println("A5 value element removed: " + list2);
        System.out.println(" ");

    }
}
