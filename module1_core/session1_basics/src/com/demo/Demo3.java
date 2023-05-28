package com.demo;
//What is init block?
class Foo {
    //static init block
    static {
        System.out.println("static init block");
    }
    //init block
    {
        System.out.println(" common code 2");
    }
    {
        System.out.println(" common code 1");
    }


    public Foo(){
        System.out.println("inside default ctr");
    }

    public Foo(int i){
        System.out.println("inside para ctr");
    }

}
public class Demo3 {
    public static void main(String[] args) {

        //static class loading
        Foo foo=new Foo();
        //Dynamic class loading *


        System.out.println("-------------");
//        Foo foo=new Foo(3);
//        Foo foo2=new Foo();


    }
}


