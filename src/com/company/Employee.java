package com.company;

public class Employee {
    private String employeeName;
    private int departmentName;
    private double salaryEmployee;
    private int id;
    private static int counter = 1 ;

    public Employee(String employeeName, int departmentName, double salaryEmployee) {
        this.employeeName = employeeName;
        this.departmentName = departmentName;
        this.salaryEmployee = salaryEmployee;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartmentName() {
        return departmentName;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setDepartmentName(int departmentName) {
        this.departmentName = departmentName;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public String toSting() {
        return "ФИО сотрудника: " + this.employeeName + "; Номер отдела: " + this.departmentName + "; Зарплата сотурдника: " + this.salaryEmployee + "; Идентификационный номер: " + id;
    }

}
