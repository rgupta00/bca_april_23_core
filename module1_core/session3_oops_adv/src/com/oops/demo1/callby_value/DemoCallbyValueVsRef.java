package com.oops.demo1.callby_value;
//Call by value
public class DemoCallbyValueVsRef {

    public static void main(String[] args) {

        int i=5;
        int j=10;
        System.out.println("value of i:"+ i+" value of j: "+j);
        swap(i, j);
        System.out.println("value of i:"+ i+" value of j: "+j);

    }
    public static void swap(int i, int j) {
         int temp=0;
         temp=i;
         i=j;
         temp=j;
    }
}
