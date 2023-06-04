package com.oops.demo4.interface_vs_ab_class2;

public class FullTimeEmployee extends Employee {
    private String ppf;
    private int shareValue;

    public FullTimeEmployee(int id, String name, double salary,String ppf, int shareValue) {
        super(id, name, salary);
        this.ppf = ppf;
        this.shareValue=shareValue;
    }

    @Override
    public double getTotalPayable() {
        return super.getSalary()*.8;
    }

    public void printEmployeeDetails(){
        super.printEmployeeDetails();
        System.out.println("ppf :"+ ppf);
        System.out.println("shareValue :"+ shareValue);
    }
}
