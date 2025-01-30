package com.company.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Assignment2 {

    public static void main(String[] args) {

        //        2.Format the current date and time into a custom pattern (e.g., MM/dd/yyyy HH:mm).

        LocalDate now = LocalDate.now();
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        System.out.println("\nFormatted through SimpleDateFormat class : " + sdf.format(dt));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");      //does not take time as an argument
        System.out.println("\nFormatted through DateTimeFormatter class : " + now.format(dtf));
    }
}
