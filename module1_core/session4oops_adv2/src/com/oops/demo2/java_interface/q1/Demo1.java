package com.oops.demo2.java_interface.q1;
interface A{
     void foof();
}
//why we can not reduce the visbily while doing overriding
class B implements A{
    @Override
    public void foof(){
    }
}
public class Demo1 {
    public static void main(String[] args) {

    }
}
