package com.demo;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        Class<?>clazz=e1.getClass();
        //from this cookie cutter i can get all the inforamtation about the meta data of the objects
        System.out.println(e1.getClass());
        System.out.println(e2.getClass());

//        List<String> list =List.of("raj","ekta");
//
//
//        list.add("foo");

//        System.out.println(Runtime.getRuntime().availableProcessors());
//        List<Employee> list = new ArrayList<Employee>();
//
//        list.add(new Employee(1,"raj",7090.00));
//        list.add(new Employee(2,"ekta",6700.00));
//        list.add(new Employee(4,"amit",7000.00));

        //u want names of all person sorted as per salary in desc
        //select * from emp
//        List<String> listOfNames= list.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//
//                .map(e-> e.getName()).collect(toList());


    }
}