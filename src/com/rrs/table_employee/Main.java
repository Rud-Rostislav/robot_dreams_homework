package com.rrs.table_employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // create a list of employees
        List<Employee> employees = new ArrayList<>();

        // add employees to the list
        employees.add(new Employee(1, "John", 30, 500.23));
        employees.add(new Employee(2, "Jane", 25, 400.78));
        employees.add(new Employee(3, "Bob", 40, 600.23));
        printTable(employees);

        // remove employee with ID = 3
        removeEmployeeById(employees, 3);

        // print the updated table
        System.out.println("Updated table:");
        printTable(employees);
    }

    public static void removeEmployeeById(List<Employee> employees, int id) {
        Iterator<Employee> iterator = employees.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                System.out.println();
                System.out.println("Removed employee with ID = " + id);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee with ID = " + id + " not found.");
        }
    }

    public static void printTable(List<Employee> employees) {
        // print the table header
        System.out.println("+----+-------+-----+----------+-------------+");
        System.out.println("| ID | Name  | Age |  Salary  |     Tax     |");
        System.out.println("+----+-------+-----+----------+-------------+");

        // print each employee's row
        for (Employee employee : employees) {
            double tax = employee.calculateTax();
            System.out.format("| %2d | %-5s | %3d |  $%6.2f  |  $%6.2f   |\n",
                    employee.getId(),
                    employee.getName(),
                    employee.getAge(),
                    employee.getSalary(),
                    tax);
        }

        // print the table footer
        System.out.println("+----+-------+-----+----------+-------------+");

        // sort the employees list by salary
        employees.sort(Comparator.comparing(Employee::getSalary));

        // get the employee with the lowest salary (first element in the list)
        Employee lowestPaidEmployee = employees.get(0);

        // get the employee with the highest salary (last element in the list)
        Employee highestPaidEmployee = employees.get(employees.size() - 1);

        System.out.println("Employee with the lowest salary: " + lowestPaidEmployee.getName() +
                " (" + lowestPaidEmployee.getSalary() + ")");
        System.out.println("Employee with the highest salary: " + highestPaidEmployee.getName() +
                " (" + highestPaidEmployee.getSalary() + ")");
    }

}