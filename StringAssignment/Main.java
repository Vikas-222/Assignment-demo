package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //multiline text block from java 15
        String str = """
                Hii, Myself Vikas Sahu, 
                I'm a MCA student,
                I live in surat
                """;


        //string split method
        String[] arr = str.split(" ", str.length());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //Wrapper class
        int x = 1000;
        Integer i = x;          //conversion of primitive to wrapper class autoboxing
        System.out.println(i);

        char a = 'A';
        Character b = a;        //conversion of primitive to wrapper class autoboxing

        Integer integer = x;
        System.out.println("boxing " + integer);         //conversion of wrapper class to primitive boxing


        //System class
        Scanner sc = new Scanner(System.in);
        System.out.print("type a number: ");
        int input = sc.nextInt();
        if (input == 10) {
            System.out.println("Exit");
            System.exit(0);
        } else {
            System.out.println(input);
        }


        BigDecimal biglong = new BigDecimal(1234123456789011524L);

        System.out.println(biglong);
    }
}
