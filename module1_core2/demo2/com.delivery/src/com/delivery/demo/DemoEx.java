package com.delivery.demo;
class AEx extends  Exception {
}
class BEx extends  Exception {
}
public class DemoEx {

    public static void main(String[] args) {

        try {
            foo("a");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

     static void foo(String info) throws AEx, BEx{
        try{
            if(info.equals("a"))
                throw new AEx();

            if(info.equals("b"))
                throw new BEx();
        }catch (Exception e){
            throw  e;
        }
    }
}
