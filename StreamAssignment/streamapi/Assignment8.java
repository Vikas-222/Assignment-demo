package com.company.streamapi;

import java.util.Arrays;
import java.util.List;

public class Assignment8 {

    public static void main(String[] args) {

//        Custom Collector for Aggregation
//        Write a custom collector to aggregate employee salaries into a department-wise total

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 55000, 28),
                new Employee(2, "Bob", "IT", 70000, 32),
                new Employee(3, "Charlie", "Finance", 80000, 45),
                new Employee(4, "David", "IT", 65000, 26),
                new Employee(5, "Eve", "HR", 72000, 41)
        );

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("Average Salary: " + averageSalary);
    }
}
