package com.company.FunctionalInterface;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Demo {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = sc.next();

        Random r = new Random();
        Function<String, String> f1 = (str) -> str + r.nextInt(5);
        Function<String, String> f3 = (s) -> s.toUpperCase();
        Function<String, String> f2 = (str) -> str = str + "100";

        System.out.println("andThen method :" + f3.andThen(f1).apply(name));                  //returns Hello -> Hello100 -> HELLO100
        System.out.println("apply method :" + (f2).apply(name));                            //returns Hello -> Hello100
        System.out.println("compose method :" + f3.compose(f2).apply(name));                  //returns Hello -> Hello100 -> Hello100


        Function<Integer, Integer> f4 = Function.identity();                            //returns given input as output

        System.out.println("identity method :" + f4.apply(100));
//
//
        Consumer<Integer> c1 = (n) -> System.out.println(n * 100);
        Consumer<Integer> c2 = (n) -> System.out.println(n + 100);
        c1.accept(100);
        c1.andThen(c2).accept(10);
//
        Predicate<Integer> p1 = (n) -> n == 10;
        System.out.println(p1.test(1));
        System.out.println(p1.test(10));
    }
}
