package com.company.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment6 {

    public static void main(String[] args) {


//        6. flatMap vs map
//        Use flatMap to process nested lists of strings, and compare with map.


        Product p1 = new Product("iphone", "Mobile");
        Product p2 = new Product("galaxy", "Mobile");
        Product p3 = new Product("intel", "processor");
        Product p4 = new Product("ryzon", "processor");
        Product p5 = new Product("tab", "tablet");
        Product p6 = new Product("ipad", "tablet");

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);


        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Vikas", "Arpan", "Krushit"),
                Arrays.asList("Vinay", "Diven", "Vishal"),
                Arrays.asList("Hardik", "Aamir", "Java", "Stream")
        );


        // Stream pipeline demonstrating various intermediate operations
        List<String> result1 = listOfLists.stream()
                .flatMap(List::stream)               // Flatten the list of lists into a single stream
                .collect(Collectors.toList());       // Collect the final result into a list

        // Print the final result
        System.out.println("\nFinal Result from flatmap:");
        result1.forEach(System.out::println);


        //map cannot read values directly from a nested list, flatmap can.
        List<String> l = productList.stream().map(p -> p.getName()).collect(Collectors.toList());

        // Print the final result
        System.out.println("\nResult from map:");
        l.forEach(System.out::println);
    }
}
