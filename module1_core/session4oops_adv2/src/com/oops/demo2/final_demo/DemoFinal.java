package com.oops.demo2.final_demo;
//final that can not change
//API ,
//final class: what is the need ?

 class Foof{
    final public void foo(){
        System.out.println("dont dare to override it");
    }
    public void foo2(){
        System.out.printf("it can be overriden");
    }
}
class Foof2 extends Foof{
//    public void foo(){
//        System.out.println("dont dare to override it");
//    }

     @Override
    public void foo2(){
        System.out.printf("it can be overriden");
    }
}
class Val{
     private int i;

    public Val(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
public class DemoFinal {

    private  static  final Val val=new Val(33);

    public static void main(String[] args) {

        val.setI(44);

        System.out.printf("val: "+ val.getI());


       // System.out.printf("i");
      //  i++;

//        Foof foof=new Foof();
//        foof.foo();

    }
}














