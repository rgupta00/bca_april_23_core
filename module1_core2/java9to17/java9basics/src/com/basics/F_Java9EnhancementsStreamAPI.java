package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class F_Java9EnhancementsStreamAPI {
    public static void main(String[] args) {
        /*
        In Java 9 as the part of Stream API, the following new methods introduced.
            1. takeWhile() vs filter()
            2. dropWhile()
            3. Stream.iterate()
            4. Stream.ofNullable() //pls try yourself
            //https://www.java4coding.com/contents/java/java9features/java-9-stream-ofnullable-method
         */

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(1);
        l1.add(3);
        l1.add(6);
        l1.add(5);
        l1.add(8);
//        System.out.println("Initial List: filter" + l1);
//        List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(l2);

//        System.out.println("Initial List: filter" + l1);
//        List<Integer> l2 = l1.stream().takeWhile(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(l2);

        // dropWhile()
        System.out.println("Initial List: filter" + l1);
        List<Integer> l2 = l1.stream().dropWhile(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l1);
        System.out.println(l2);
        Stream.iterate(2, n -> n + 5).limit(100).forEach(n-> System.out.println(n));
    }
}
