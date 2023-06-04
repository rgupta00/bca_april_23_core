package com.oops.demo1.revsion;
//Covarient return type?
//Java 5: Covarient retrun
class M{}
class N extends  M{}
class A{
    public M foo(){
        System.out.println("A");
        return  new N();
    }
}

class B extends A{
    @Override
    public N foo(){
        super.foo();
        System.out.println("B");
        return  new N();
    }
}

public class Demoq1 {
    public static void main(String[] args) {

        A a=new B();
        a.foo();
    }
}
