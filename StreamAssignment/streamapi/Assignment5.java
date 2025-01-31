package com.company.streamapi;

import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Assignment5{

    public static void main(String[] args) {

        int product = IntStream.of(1,3,50,80,4,9).boxed().collect(Collector.of(
                () -> new int[]{1},
                (a,b) -> a[0] *= b,
                (a1, a2) -> {
                    a1[0] *= a2[0];
                    return a1;
                },
                a -> a[0]
        ));

        System.out.println(product);

    }


}
