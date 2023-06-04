package com.oops.demo2.java_interface;
//interface? 100% ab in java (Java 7) after that?

//abst: interface vs abs class

//interface Foof{
//     int i=5;//public static final
//    public abstract void foof();
//}
//class FoofImpl implements Foof{
//
//     @Override
//     public void foof() {
//         System.out.printf("hello foof "+i);
//     }
// }


interface A{
    int i=5;
    public abstract void foof();
}
interface B{
    int i=5;
    public abstract void foof();
}
class C implements A,B{

    @Override
    public void foof() {
        System.out.println("foof is overriden "+B.i);
    }
}

public class A_What_Is_Interface {
    public static void main(String[] args) {

    }
}
