package com.company.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Assignment3 {

    public static void main(String[] args) {

        //        3.Find the difference in hours between two time zones (e.g., UTC and Asia/Kolkata).


        ZonedDateTime zdtAsia = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("\nTime difference between UTC and Asia/Kolkata is : " + zdtAsia.getOffset());


    }
}
