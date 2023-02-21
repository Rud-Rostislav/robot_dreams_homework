package com.rrs.robot_dreams;

import com.rrs.robot_dreams.domain.Employee;
import com.rrs.robot_dreams.service.EmployeeService;

public class Main {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        employeeService.printEmployees();

        System.out.println();

        Employee employeeWithMaxSalary = employeeService.findEmployeeMaxSalary(employeeService.findAll());
        System.out.println("Max salary: ");
        employeeService.printEmployee(employeeWithMaxSalary);

        System.out.println();

        Employee employeeWithMinSalary = employeeService.findEmployeeMinSalary(employeeService.findAll());
        System.out.println("Min salary: ");
        employeeService.printEmployee(employeeWithMinSalary);

        System.out.println();
        System.out.println();

        System.out.println("Taxes: ");

    }
}