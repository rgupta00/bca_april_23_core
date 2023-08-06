package example;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
       try{
         Class<?> clazz=Class.forName("hello.Hello");
         Object o=clazz.getDeclaredConstructor().newInstance();
       }catch (Exception e){
        e.printStackTrace();
       }
    }
}