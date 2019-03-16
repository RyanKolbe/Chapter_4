package com.ryankolbe.Question_3.SingleResponsibilityPrinciple.ViolatePrinciple;

public class Employee {
    private int empNumber;
    private String empName;
    private String empSurname;
    private int yearJoined;

    public Employee(int empNumber, String empName, String studentSurname, int yearJoined) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.empSurname = studentSurname;
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

    //violate by including calculation if employee can get bonus
    public boolean canGetBonus(int yearJoined) {
        return getYearJoined() < 2016;
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

