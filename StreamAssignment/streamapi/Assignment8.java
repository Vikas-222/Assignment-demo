package com.company.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

public class Assignment8 {

    public static void main(String[] args) {

//        Custom Collector for Aggregation
//        Write a custom collector to aggregate employee salaries into a department-wise total

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 55000),
                new Employee(2, "Bob", "IT", 70000),
                new Employee(3, "Charlie", "Finance", 80000),
                new Employee(6, "Charles", "Finance", 70000),
                new Employee(4, "David", "IT", 65000),
                new Employee(5, "Eve", "HR", 72000)
        );

        Map<String,Double> totalSalary = employees.parallelStream().collect(Collector.of(
                HashMap::new,
                (map,employee) -> map.merge(employee.getDepartment(),employee.getSalary(),Double::sum),
                (a,b) -> {
                    a.forEach((x,y) -> b.merge(x,y,Double::sum));
                    return b;
                }
        ));

        System.out.println(totalSalary);
        System.out.println("");

//        double averageSalary = employees.stream()
//                .mapToDouble(Employee::getSalary)
//                .average()
//                .orElse(0.0);
//        System.out.println("Average Salary: " + averageSalary);


    }
}
