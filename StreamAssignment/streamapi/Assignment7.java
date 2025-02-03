package com.company.streamapi;

import java.util.*;

public class Assignment7 {

//    public static StringBuilder concat(String s){
//        StringBuilder sb = new StringBuilder(s);
//        for(int i=0; i<10000; i++){
//            sb.append(i);
//        }
//        return sb;
//    }

    public static void main(String[] args) {

//        7. Stream Performance
//        Analyze the performance of spliterator and learn tips for efficient parallelization.


//        Unlike Iterator and ListIterator, spliterator supports Parallel Programming functionality.
//        Unlike Iterator and ListIterator, spliterator supports both Sequential and Parallel Processing of data.
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
        //tryAdvance() is faster than trySplit()
        System.out.println("tryAdvance() method is used to iterate elements individually in multiple Threads to support Parallel Processing.");
        while (split1.tryAdvance(n -> System.out.print(n + " "))) ;




//        System.out.println("\nenter a string : ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        long start = 0;
//        long end = 0;
//        start = System.currentTimeMillis();
//
////        Assignment7.concat(s);
//        List<StringBuilder> stringList = Arrays.asList(Assignment7.concat(s));
//
//        Spliterator<StringBuilder> spliterator = stringList.spliterator();
//        while (spliterator.tryAdvance(n -> System.out.print(n + " "))) ;
////        spliterator.forEachRemaining(n -> System.out.println(n + " "));
//
//        end = System.currentTimeMillis();
//
//        System.out.println("\ntime taken by spliterator : "+(end-start)+ " ms");
//
//
//        //iterator
//        start = System.currentTimeMillis();
//
////        Assignment7.concat(s);
//        List<StringBuilder> stringList2 = Arrays.asList(Assignment7.concat(s));
//
//        Iterator<StringBuilder> iterator = stringList2.iterator();
//        iterator.forEachRemaining(n -> System.out.println(n + " "));
//
//        end = System.currentTimeMillis();
//
//        System.out.println("time taken by iterator : "+(end-start)+ " ms");

    }


}
