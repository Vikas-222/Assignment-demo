package com.company.List;

import java.util.*;

public class Assignment3 {

    public static void main(String[] args) {

//        Write a program to count the frequency of duplicate elements in a List using
//        Collections.frequency


        LinkedList<String> nameList = new LinkedList<>();      //maintains insertion order
        nameList.add("Vikas");
        nameList.add("Arpan");
        nameList.add("Vikas");
        nameList.add("Vikas");
        nameList.add("Krushit");
        nameList.add("Diven");
        nameList.add("Diven");

        System.out.print("Enter a name to find: ");
        Scanner sc = new Scanner(System.in);
        String find = sc.next();
        System.out.println(nameList);

//        find frequency of a given name
        System.out.println("Word "+find+" is repeated " + Collections.frequency(nameList, find) + " times");

        nameList.add(6,"Akshay");           //overload add method
        System.out.println("After adding in 6th index : "+nameList);

        Collections.reverse(nameList);
        System.out.println("Reverse List : "+nameList);
    }
}
