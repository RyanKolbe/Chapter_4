package com.ryankolbe.Question_3.SingleResponsibilityPrinciple.ObeyPrinciple;

public class Employee {
    private int empNumber;
    private String empName;
    private String empSurname;
    private int yearJoined;

    public Employee(int empNumber, String empName, String empSurname, int yearJoined) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.empSurname = empSurname;
        this.yearJoined = yearJoined;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", empName='" + empName + '\'' +
                ", empSurname='" + empSurname + '\'' +
                ", yearJoined=" + yearJoined +
                '}';
    }
}

