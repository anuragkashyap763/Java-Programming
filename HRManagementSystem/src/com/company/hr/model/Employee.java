package com.company.hr.model;

import com.company.hr.interfaces.Payable;

public abstract class Employee implements Payable {

    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Encapsulation (Getters)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Common behavior
    public void displayInfo() {
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
    }

    // Abstract method
    public abstract String getEmployeeType();
}
