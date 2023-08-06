package main;


public class Main {
    public static void main(String[] args) {
      try{
          Class<?>clazz=Class.forName("hello.Hello");
          Object obj=clazz.getDeclaredConstructor().newInstance();
          System.out.println(obj);
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}