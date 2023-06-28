package com.geekForGeeksDSCourse.RandomQuestionPractice.InterviewPractice.GL;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Pavan", "Delhi"));
        empList.add(new Employee("Jenny", "Mumbai"));
        empList.add(new Employee("Anurag", "Goa"));

        List<Employee> employeeList = empList.stream().sorted(Comparator.comparing(Employee::getName)).toList();

        for (Employee emp: employeeList) {
            System.out.println(emp.toString());

        }

    }
}
