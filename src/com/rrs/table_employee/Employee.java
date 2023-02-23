package com.rrs.table_employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    // create a list of employees
    public static List<Employee> employees = new ArrayList<>();

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double calculateTax() {
        double tax;
        if (salary <= 200) {
            tax = 0;
        } else if (salary <= 500) {
            tax = salary * 0.1;
        } else {
            tax = salary * 0.2;
        }
        return tax;
    }


    public static void removeEmployeeById(int id) {
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
        System.out.printf("Updated list of employees:\n");
        Employee.printTable();
    }

    public static void printTable() {
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

        System.out.println("Lowest salary: " + lowestPaidEmployee.getName() +
                " (" + lowestPaidEmployee.getSalary() + ").");
        System.out.println("Highest salary: " + highestPaidEmployee.getName() +
                " (" + highestPaidEmployee.getSalary() + ").");

        employees.sort(Comparator.comparing(Employee::getName));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
