package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
	    int[] array1 = new int[]{1,5,3,68,20,19,44,8};

        String[] array2 = {"Hello","World","Hello", "Java","Worlds","World","Hiii"};

        //IntStream boxed method to convert int to Integer
        List<Integer> list1 = IntStream.of(array1).filter(i -> i % 4 == 0).boxed().collect(Collectors.toList());
        System.out.println("List1 : "+list1);

        System.out.println("\nSorted array");
        IntStream.of(array1).sorted().forEach(System.out::println);

        //List of String having H in first place
        List<String> nameStartWithH = Arrays.stream(array2).filter(name -> name.startsWith("H")).collect(Collectors.toList());
        System.out.println("\nName Start With H : "+nameStartWithH);

        List<String> distinctList = Arrays.stream(array2).distinct().collect(Collectors.toList());
        System.out.println("\ndistinct List : "+distinctList);

        //foreach
        System.out.println("\nfor each method");
        Arrays.stream(array2).forEach(System.out::println);

        System.out.println("\nName ends with o:");
        Arrays.stream(array2).filter(s -> s.endsWith("o")).forEach(System.out::println);

        //anyMatch method check the given predicate
        boolean flag = Arrays.stream(array2).anyMatch(name -> Character.isUpperCase(name.charAt(3)));
        System.out.print("\nCharacter at given position in all words is uppercase or not: "+flag);
//        System.out.println("");
        long[] array3 = {100000L, 300000L, 400000L, 786777L};

        //average value
        double avg = LongStream.of(array3).average().getAsDouble();
        System.out.println("\naverage of array3 : "+avg);

        //maximum value
        long max = LongStream.of(array3).max().getAsLong();
        System.out.println("maximum value : "+max);


        //float[] floatArray = {189.33f,243.44f,557.55f,290.388f,139.465f};


    }
}
