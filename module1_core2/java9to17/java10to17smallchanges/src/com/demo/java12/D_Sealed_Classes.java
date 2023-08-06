package com.demo.java12;
//java oo have some rigidness
//final class Processor{
//    void foo(){
//
//    }
//}
//class Cat extends Processor{
//}
//class Mobile extends Processor{
//}
//class Laptop extends Processor{
//}
//class A should be only allowed to be extends by class B and C
sealed class A permits B{
}
non-sealed class B extends A{
    
}
class B1 extends B{}

//final , sealed, non-sealted
//sealed class B extends A permits B1{
//}
//final class B1 extends B{
//
//}

public class D_Sealed_Classes {
    public static void main(String[] args) {

    }
}
