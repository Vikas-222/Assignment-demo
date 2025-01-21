package com.company.List;

import java.util.*;

public class Assignment2 {

    public static void main(String[] args) {

//        Write a program to:
//○ Sort a list of student names using Collections.sort.
//○ Search for a name using Collections.binarySearch

        Student s1 = new Student("Vikas");
        Student s2 = new Student("Vinay");
        Student s3 = new Student("Krushit");
        Student s4 = new Student("Arpan");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


//        compare between two students name
        Comparator<Student> compare = (stud1, stud2) -> stud1.getSname().compareTo(stud2.getSname());
        Collections.sort(studentList, compare);
        System.out.println(studentList);

        LinkedList<String> nameList = new LinkedList<>();      //maintains insertion order
        nameList.add("Vikas");
        nameList.add("Arpan");
        nameList.add("Vikas");
        nameList.add("Vikas");
        nameList.add("Krushit");
        nameList.add("Diven");
        nameList.add("Diven");


//        To search with Binary search method list must be in sorted order
        String find = "Arpan";
        System.out.println(nameList);
        Collections.sort(nameList);
        System.out.println(nameList);
        System.out.println(Collections.binarySearch(nameList, find));
    }
}
