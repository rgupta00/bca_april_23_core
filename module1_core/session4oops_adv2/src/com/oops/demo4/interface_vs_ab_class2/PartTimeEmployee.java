package com.oops.demo4.interface_vs_ab_class2;

public class PartTimeEmployee extends Employee {
    private int noOfDays;
    private int perDaySalary;

    public PartTimeEmployee(int id, String name, double salary, int noOfDays, int perDaySalary) {
        super(id, name, salary);
        this.noOfDays = noOfDays;
        this.perDaySalary = perDaySalary;
    }

    @Override
    public double getTotalPayable() {
        return super.getSalary()*.3;
    }

    public void printEmployeeDetails(){
        super.printEmployeeDetails();
        System.out.println("noOfDays :"+ noOfDays);
        System.out.println("perDaySalary :"+ perDaySalary);
    }
}
