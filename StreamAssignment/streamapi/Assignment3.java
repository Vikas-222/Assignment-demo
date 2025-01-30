package com.company.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assignment3 {

    public static void main(String[] args) {


//        3. Group Objects by Category
//        Create a Product class with name and category. Group products by their category using Collectors.groupingBy.

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


        Map<String, List<Product>> groupList = productList.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println("\ngroup products by their category : " + groupList);


        Map<Boolean, List<Product>> group = productList.stream().collect(Collectors.partitioningBy(p -> p.getCategory().equals("tablet")));
        System.out.println("\npartition products by their category : " + group);

    }
}
