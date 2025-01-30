package com.company.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        //        1.Create a program to calculate the number of days until your next birthday.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter year: ");
        int year = sc.nextInt();
        System.out.println("enter month of your birthdate : ");
        int month = sc.nextInt();
        System.out.println("enter date of your birthdate : ");
        int date = sc.nextInt();

        //get the current date
        LocalDate now = LocalDate.now();

//        store birthdate of user
        LocalDate bod = LocalDate.of(year, month, date);

//        get the difference between two dates
        Period diff = Period.between(now, bod);
        if (year >= now.getYear()) {
            if (month > now.getMonthValue()) {
                System.out.println(diff.getMonths() + " months and " + diff.getDays() + " days left for your next birthday");
            } else {
                System.out.println(Math.abs(diff.getMonths()) + " months and " + Math.abs(diff.getDays()) + " days passed after your birthday");
            }
        } else {
            System.out.println(Math.abs(diff.getMonths()) + " months and " + Math.abs(diff.getDays()) + " days passed after your birthday");
        }

    }
}
