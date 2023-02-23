package com.rrs.table_employee;

import java.util.*;

import static com.rrs.table_employee.Employee.employees;

public class Main {
    public static void main(String[] args) {


        // add employees to the list
        employees.add(new Employee(1, "John", 30, 500.23));
        employees.add(new Employee(2, "Jane", 25, 400.78));
        employees.add(new Employee(3, "Bob", 40, 600.23));

        Employee.printTable();

        Employee.removeEmployeeById(1);
    }

}