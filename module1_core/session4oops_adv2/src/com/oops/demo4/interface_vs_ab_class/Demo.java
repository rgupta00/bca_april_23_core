package com.oops.demo4.interface_vs_ab_class;
//https://stackoverflow.com/questions/55445242/how-do-interfaces-break-dependencies-of-classes
//sepreate what varies
interface Jumpable{
    void jump();
}
 abstract class Monkey implements Jumpable{
    void stayOnTree(){
        System.out.printf("Monkey stay on tree");
    }
    @Override
    public void jump(){
        System.out.printf("Monkey jump like anything");
    }
}
class  Kid  implements Jumpable{
     public void goToSchool(){
         System.out.println("goToSchool");
     }
    @Override
    public void jump(){
        System.out.printf("kid can beat monkey");
    }
}
public class Demo {

    public static void main(String[] args) {
        Kid k=new Kid();
        k.jump();
        k.goToSchool();
       // k.stayOnTree();
    }
}
