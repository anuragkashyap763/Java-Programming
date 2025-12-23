package com.company.hr.model;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int id, String name, String department,
                            double monthlySalary) {
        super(id, name, department);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getEmployeeType() {
        return "Full-Time Employee";
    }
}
