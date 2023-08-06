package com.demo.java10;
interface MarathonRunner{

     static void runStaticMethod2() {
        System.out.println("I'm a marathon runner: static");
        runStatic();
    }

    private static void runStatic() {
        System.out.println("I'm a marathon runner: static");
    }
    default void run() {
        System.out.println("I'm a marathon runner");
    }
}
class Child implements MarathonRunner {
    void whistle() {
        System.out.println("Child-Whistle");
    }
    void stand() {
        System.out.println("Child-stand");
    }
}
public class C_VarWithInterface {
    public static void main(String[] args) {
        var a=new Child();
        a.whistle();
        a.stand();
        a.run();
      //  MarathonRunner.runStatic();
    }
}
