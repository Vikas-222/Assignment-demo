package com.company.streamapi;

import java.util.Arrays;

public class Assignment1 {

    public static void main(String[] args) {

        //    1. Filter and Sort Lists with Streams
        //    Write a program to filter out strings shorter than 4
        //    characters and sort the remaining strings alphabetically.

        String[] stringArray = {"Hello", "World", "Java", "File", "Api", "Hii", "one", "two"};

        Arrays.stream(stringArray).filter(s -> s.length() >= 4)                   //filter string having length greater than or equal to 4
                .sorted()                                                         //sort the stream
                .forEach(System.out::println);                                    //loop through all elements

    }
}
