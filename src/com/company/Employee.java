package com.company;

public class Employee {
    private String employeeName;
    private String departmentName;
    private double salaryEmployee;
    int id;
    private static int counter;

    public Employee(String employeeName, String departmentName, double salaryEmployee) {
        this.employeeName = employeeName;
        this.departmentName = departmentName;
        this.salaryEmployee = salaryEmployee;
        this.id = getCounter();
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public String toSting() {
        return "ФИО сотрудника: " + this.employeeName + "; Номер отдела: " + this.departmentName + "; Зарплата сотурдника: " + this.salaryEmployee + "; Идентификационный номер: " + id;
    }

}
