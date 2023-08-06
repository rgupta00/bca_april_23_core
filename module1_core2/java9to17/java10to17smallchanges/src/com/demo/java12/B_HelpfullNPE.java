package com.demo.java12;

public class B_HelpfullNPE {

    public static void main(String[] args) {
        String cityName= getCity(1,4);
        System.out.println(cityName.toUpperCase());
    }

    public static  String getCity(int a, int b){
        return null;
    }
}
