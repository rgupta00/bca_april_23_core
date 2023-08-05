package com.basics;
 interface Java8DBLogging {
    default void logInfo(String message) {
        //	Step1: Connect to DataBase
        //	Setp2: Log Info Message
        //	Setp3: Close the DataBase connection
    }
    default void logWarn(String message) {
        //Step1: Connect to DataBase
        //Setp2: Log Warn Message
        //Setp3: Close the DataBase connection
    }
    default void logError(String message) {
        //Step1: Connect to DataBase
        //Setp2: Log Error Message
        //Setp3: Close the DataBase connection
    }
    default void logFatal(String message) {
        //Step1: Connect to DataBase
        //Setp2: Log Fatal Message
        //Setp3: Close the DataBase connection
    }
}
//interface A{
//     //java 7
//     int i=0;
//     public void foo();
//
//     //java 9: it is acting as a helper method
//    private void fooP(){
//        System.out.println("---------------------");//DRY
//        System.out.println("private method inside a interface");
//    }
//
//    //java 8
//     public default  void fooDefault(){
//         fooP();
//         System.out.println("foo default method is called");
//     }
//    public default  void fooDefault2(){
//       fooP();
//        System.out.println("foo default2 method is called");
//    }
//    public static void fooStatic(){
//    }
//}
//class B implements A{
//
//    @Override
//    public void foo() {
//        System.out.println("foo method is overriden");
//    }
//}
public class A_PrivateMethodInsideInterface {
    public static void main(String[] args) {

//        A a=new B();
//        a.foo();
//        a.fooDefault();
//        a.fooDefault2();
//
//        A.fooStatic();

    }
}
