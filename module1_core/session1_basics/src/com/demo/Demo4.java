package com.demo;
class Foo2{

    private static double PI;
    static {
        PI=Math.PI;
        //it is used to initilized useful values for static variable
    }
    private static Foo2 foo=new Foo2();

    private Foo2(){
        System.out.println("private ctr is possible");
    }
    public static Foo2 getFoo2(){
        return foo;
    }
}
public class Demo4 {
    public static void main(String[] args) {

        Foo2 foo=Foo2.getFoo2();



    }
}
