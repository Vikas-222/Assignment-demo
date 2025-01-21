package com.company.List;


import java.util.ArrayList;
import java.util.List;

public class Assignment4 {

//    Convert an array of integers into a List and back to an array. Print the results

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 10};


        //converting array to list
        List<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            intArray.add(arr[i]);
        }

        System.out.println("List :" + intArray);

        //converting list to a new array
        int[] newArray = new int[intArray.size()];
        for (int i = 0; i < intArray.size(); i++) {
            newArray[i] = intArray.get(i);
        }

//        new array
        System.out.print("New Array :");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(" " + newArray[i]);
        }

    }

}
