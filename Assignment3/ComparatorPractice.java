package com.company;

import java.util.Comparator;

public class ComparatorPractice implements Comparable<ComparatorPractice> {

    String s;

    public ComparatorPractice(String s) {
        this.s = s;
    }


    @Override
    public int compareTo(ComparatorPractice o) {
        if(this.s.compareTo(o.s) != 0)
            return this.s.compareTo(o.s);
        return 0;
    }


    public static void main(String[] args) {

        ComparatorPractice c = new ComparatorPractice("abc");
        ComparatorPractice d = new ComparatorPractice("ac");

        System.out.println(c.s.compareTo(d.s));         //return -1


        ComparatorPractice a = new ComparatorPractice("abc");
        ComparatorPractice b = new ComparatorPractice("abc");

        System.out.println(a.s.compareTo(b.s));            //return 0

    }

}
