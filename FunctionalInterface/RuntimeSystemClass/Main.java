package com.company.RuntimeSystemClass;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();       //get the current runtime object
        Runtime a = Runtime.getRuntime();

        System.out.println(r.availableProcessors());
        System.out.println("free memory : " + r.freeMemory());
        System.out.println("max memory : " + r.maxMemory());
        System.out.println("total memory : " + r.totalMemory());
        System.out.println("Equals :" + r.equals(a));         //one java application has one runtime object so it returns true
        //System.out.println("execution halt");
        //r.halt(1);                                          //Stops further execution

        r.gc();
        System.out.println(r.equals(a));
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("hello4");

        Integer[] arr = {1, 4, 7, 3, 8, 45, 2, 34, 22};
        Integer[] newarr = new Integer[14];

        //arraycopy method copies from a particular index of source array to the given length value and add them in the given index of destination array
        System.arraycopy(arr, 2, newarr, 0, 7);
        System.out.println(newarr.length);
        System.out.print("final dest_array : ");
        for (int i = 0; i < newarr.length; i++)
            System.out.print(newarr[i] + " ");

        System.out.println("System time in milli seconds :"+System.currentTimeMillis()); //returns current time in milli seconds from our system
       // System.out.println(System.getProperties());                                    //returns System properties
        char[] charArray = {'a', 'x', 'b', 's', 'f'};

        //Arrays class methods
        System.out.println(Arrays.binarySearch(arr, 34));
        System.out.println(Arrays.binarySearch(charArray, 'b'));
        System.out.println(Arrays.binarySearch(arr, 2, 6, 45));

        System.out.println("Print array by toString method :" + Arrays.toString(arr));        //toString method of Arrays class
        System.out.print("print array by for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        Random random = new Random(5);
        System.out.println("Random class's method :" + random.nextInt(5));

        SecureRandom secureRandom = new SecureRandom();
        System.out.println("SecureRandom class's method :" + secureRandom.nextInt(6));
        System.out.println("Algorithm used by SecureRandom class :" + secureRandom.getAlgorithm());

//        System.exit(0);
//        System.out.println("hello5");
//        System.out.println("hello6");
        //System.out.println(r);
    }
}
