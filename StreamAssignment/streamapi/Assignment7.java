package com.company.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Assignment7 {

    public static void main(String[] args) {

//        7. Stream Performance
//        Analyze the performance of spliterator and learn tips for efficient parallelization.


//        Unlike Iterator and ListIterator, it supports Parallel Programming functionality.
//        Unlike Iterator and ListIterator, it supports both Sequential and Parallel Processing of data.
//        Compare to other Iterators, it provides better performance.

        List<Integer> list1 = Arrays.asList(1, 145, 74, 57, 99, 444, 64, 778, 35, 100, 1);

        Spliterator<Integer> split1 = list1.spliterator();
        Spliterator<Integer> split2 = split1.trySplit();

//        List<Integer> splitList1 = new ArrayList<>();
        List<Integer> splitList2 = new ArrayList<>();

        //first half
        split2.forEachRemaining(splitList2::add);

        System.out.println(splitList2);

        //second half
        System.out.println("tryAdvance() method is used to iterate elements individually in multiple Threads to support Parallel Processing.");
        while (split1.tryAdvance(n -> System.out.print(n + " "))) ;


    }


}
