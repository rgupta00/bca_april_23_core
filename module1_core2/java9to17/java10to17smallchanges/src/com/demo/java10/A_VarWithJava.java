package com.demo.java10;
import  java.util.*;
class Foo{
//    var a=44;//var can not be used as class and instance variable can only be used as local variable
   // var a=1; // why it can not be instance variable? why?
//    Foo(var a){
//
//    }
//

    {
        var a=33;
    }
    static {
        var a=33;
    }
    Foo(){
        var b=33;
    }

    void foo(){
        var a=33;
    }


}

class Foo2{}

public class A_VarWithJava {

    public static void main(String[] args) {

       // var f=null;





        //java is strongly typed language inspiate of having var
        //  var a=55;//only applicatable to local variable
         //   a="foo"; can not change the data type

       // int var=22;// my be u have used it as a variable name ... allowed :)
       // var a2=4L;
      //  a2=777;

//        Map<String, Integer> map=new HashMap<String, Integer>();
//
//        for(Map.Entry<String, Integer> e: map.entrySet()){
//
//        }

//       var map=new HashMap<String, Integer>();
//        map.put("foo",100);
//        for(var e: map.entrySet()){
//            String k=  e.getKey();
//            System.out.println(e.getKey()+": "+ e.getValue());
//        }


    }
}
