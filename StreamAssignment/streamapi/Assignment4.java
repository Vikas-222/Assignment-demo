package com.company.streamapi;

import java.util.ArrayList;
import java.util.List;

public class Assignment4 {


    public static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        //        4. Experiment with Parallel Streams
//        Compare the performance of sequential vs parallel streams
//        for a CPU-intensive computation (e.g., calculating primes).

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        List<Integer> sequentialStream = list.stream().filter(Assignment4::isPrime).toList();
        long end = System.currentTimeMillis();

        double diff = end - start;
        System.out.println("In sequential stream " + diff + " ms");


        start = System.currentTimeMillis();
        List<Integer> parallelStream = list.stream().parallel().filter(Assignment4::isPrime).toList();
        end = System.currentTimeMillis();

        diff = end - start;
        System.out.println("In parallel stream " + diff + " ms");
    }
}
