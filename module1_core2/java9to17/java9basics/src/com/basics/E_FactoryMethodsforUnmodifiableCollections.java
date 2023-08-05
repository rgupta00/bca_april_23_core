package com.basics;

import java.util.*;
class Student{

    private List<Integer> marks=new ArrayList<>();

    public List<Integer> getMarksForPrinting(){
        //return marks;
        //never return the actual array return the copy of array
//        return new ArrayList<>(marks);
       // return List.of();
        return  null;
    }

}
public class E_FactoryMethodsforUnmodifiableCollections {
    public static void main(String[] args) {
        // Creation of unmodifiable List/ Set object
//        List<String> books = new ArrayList<>();
//        books.add("head fist");
//        books.add("thinking in java");
//        books.add("sprng in action");
//        books.add("think and grow rich");
//
//        books = Collections.unmodifiableList(books);


//        List<String> books = List.of("head fist","foo","bar","jar");
//        System.out.println(books);
////        books.add("foo");
////        books.add(0,"foo");
////        books.remove("foo");

//        Set<String> books = Set.of("head fist","foo","bar","jar");
//        System.out.println(books);
//        books.add("foo");
////        books.add(0,"foo");
////        books.remove("foo");

//        Map<String, String> map =
//                Map.of("A", "Apple",
//                        "B", "Banana",
//                        "C", "Cat",
//                        "D", "Dog");
//
//        map.forEach((k,v)-> System.out.println(k+": "+ v));

//        Map<String, List<Integer>> map =
//                Map.of("A",Arrays.asList(66,88),
//                        "B", List.of(70,99,80),
//                        "C", List.of(98,99,80));
//
//        map.forEach((k,v)-> System.out.println(k+": "+ v));

       // map.put("D", List.of(78,99,80));
//        List<Integer> list=map.get("A");
//        list.add(0,11);


//        Map.Entry<String, String> m1= Map.entry("A", "Apple");
//        Map.Entry<String, String> m2= Map.entry("A", "Apple");
//
//        Map<String, String> map2= Map.ofEntries(m1,m2);


        List.of("null","A","B");
    }
}
