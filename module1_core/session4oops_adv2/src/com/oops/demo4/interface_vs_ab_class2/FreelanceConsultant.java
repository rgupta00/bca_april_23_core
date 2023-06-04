package com.oops.demo4.interface_vs_ab_class2;
//POJO
public class FreelanceConsultant implements Payable {
    private int id;
    private String name;
    private String regNo;
    private double pricePerDay;//Why BD?

    public FreelanceConsultant(int id, String name, String regNo, double pricePerDay) {
        this.id = id;
        this.name = name;
        this.regNo = regNo;
        this.pricePerDay = pricePerDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getTotalPayable() {
        return 0;
    }
}
