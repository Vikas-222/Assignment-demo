package com.company.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Assignment2 {

    public static void main(String[] args) {

        //        2. Summarize Numeric Data with reduce()
//        Given a list of integers, find the product of all numbers using reduce().

        Integer[] array1 = {1, 5, 3, 68, 20, 19, 44, 8};

        List<Integer> integerList = Arrays.asList(array1);

        //Collectors class maxBy method
        Optional<Integer> max = integerList.stream().collect(Collectors.maxBy(Integer::compare));
        System.out.println("\nmax value : " + max);


        //Stream method max
        Optional<Integer> min = integerList.stream().min(Integer::compareTo);
        System.out.println("\nmin value : " + min);


        System.out.println("\nInitial list : " + integerList);

        Optional<Integer> product = integerList.stream().reduce((x, y) -> x * y);

        System.out.println("\nproduct of all numbers is : " + product);

    }
}
