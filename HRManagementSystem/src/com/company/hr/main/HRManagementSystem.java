package com.company.hr.main;

import java.util.ArrayList;
import java.util.List;

import com.company.hr.model.Employee;
import com.company.hr.model.FullTimeEmployee;
import com.company.hr.model.PartTimeEmployee;

public class HRManagementSystem {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully!\n");
    }

    public void displayAllEmployees() {
        System.out.println("=========== EMPLOYEE DETAILS ===========");

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Employee Type : " + emp.getEmployeeType());
            System.out.println("Salary        : " + emp.calculateSalary());
            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args) {

        HRManagementSystem hr = new HRManagementSystem();

        Employee e1 = new FullTimeEmployee(
                101, "Alice", "IT", 60000);

        Employee e2 = new PartTimeEmployee(
                102, "Bob", "HR", 80, 500);

        Employee e3 = new FullTimeEmployee(
                103, "Charlie", "Finance", 75000);

        hr.addEmployee(e1);
        hr.addEmployee(e2);
        hr.addEmployee(e3);

        hr.displayAllEmployees();
    }
}
