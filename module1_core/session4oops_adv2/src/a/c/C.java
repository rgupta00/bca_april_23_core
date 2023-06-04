package a.c;

import a.b.*;

public class C extends B{
    public static void main(String[] args) {
       C c=new C();

        System.out.println(c.i);
        System.out.println(c.k);

        c.foofProtected();
        c.foofPublic();


    }
}
