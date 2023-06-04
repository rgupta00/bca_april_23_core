package com.oops.demo4.interface_vs_ab_class2;

public class SalaryProcessingSytem {

    public static  void processSalary(Payable payable){
        double payableAmount=payable.getTotalPayable();
        //...
        System.out.println("salary is processed");

    }

}
