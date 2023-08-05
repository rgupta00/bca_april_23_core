package com.basics;

import java.util.Arrays;
import java.util.List;
class  Foo2{

   // @SafeVarargs
//    Foo2(List<String>... l) {
//        for (List<String> temp: l){
//            System.out.println(temp);
//        }
}
public class D_SafeVarargsAnnotationEnhancements {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("A", "B");
        List<String> l2 = Arrays.asList("C", "D");
        m1(l1, l2);
    }
    //heap pollution
    @SafeVarargs    //java 7
    //java 9 :ctr, final, setter, private
    public static void m1(List<String>... l) {
        for (List<String> temp: l){
            System.out.println(temp);
        }
//        Object[] a = l;// we can assign List[] to Object[]
//        a[0] = Arrays.asList(10, 20);
//        String name = (String) l[0].get(0);// String type pointing to Integer type
//        System.out.println(name.toLowerCase());
    }
}
