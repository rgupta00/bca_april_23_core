package a.b;
//visibity modififer
//data/ method : private default protected public
//class:  default  public (outer inner)

//package private class

//java 9 modularity: imp topic
//public is too much public

public class B {
     public int i=4;

      int j=40;//defualt
      protected  int k=400;

      void foofDefault(){
          System.out.println("foo method defualt");
      }

      protected  void foofProtected(){
        System.out.println("foofProtected");
      }

        public void foofPublic(){
            System.out.println("foofPublic");
        }

      private  int m=4000;

}
