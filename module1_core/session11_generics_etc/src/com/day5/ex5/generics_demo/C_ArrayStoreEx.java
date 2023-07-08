package com.day5.ex5.generics_demo;

class Animal{}
class Dog extends com.day5.ex5.generics_demo.a.Animal {}
class Cat extends com.day5.ex5.generics_demo.a.Animal {}

class CostlyDog extends Dog{}
class CostlyCat extends Cat{}

public class C_ArrayStoreEx {
    public static void main(String[] args) {
        com.day5.ex5.generics_demo.a.Animal[]animals=new Dog[3];//ArrayStoreException ex handling
        
       // List<Animal> aList=new ArrayList<Dog>();

        //polym.. is only suppored for array not for generics
        //ArrayStoreException: Array not not for collection

    }
}
