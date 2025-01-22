package com.company.List;


import java.util.Arrays;
import java.util.List;

public class Assignment4 {

//    Convert an array of integers into a List and back to an array. Print the results

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 6, 8, 10};


        //converting array to list
        List<Integer> intList;
        intList = Arrays.asList(arr);

        System.out.println("List :" + intList);


        //converting list to a new array
        Integer[] newArray = new Integer[intList.size()];
        intList.toArray(newArray);

        //new array
        System.out.print("New Array :");
        for (Integer integer : newArray) {
            System.out.print(" " + integer);
        }


//        System.out.println(" ");
//        List<Integer> list = new ArrayList<>();
//        list.add(19);
//        list.add(15);
//        list.add(37);
//        list.add(23);
//
//        for(int i =0;i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        Integer[] arr1 = new Integer[list.size()];
//        list.toArray(arr1);
//
//        for(int i=0; i< arr1.length; i++){
//            System.out.println(arr1[i]);
//        }

    }

}
