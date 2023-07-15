package com.threads.session2.classical_threads;
//Printer ---> 3 employee : race condition

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

class Foo{
    private Object lock1=new Object();
    private Object lock2=new Object();

    //this sharing of data will create a problem
    private int i=0;
   //t1
    public  void f1(){
        synchronized (lock1){
            i++;
        }
    }
    //t2
    public  void f2(){
        synchronized (lock2){
            i--;
        }
    }
}
//
//class Printer{
//
//    private Object lock=new Object();
//     public void printLetter(String letter){
//         //
//         //
//
//         //Critical section
//         synchronized (lock){
//             System.out.print("[");
//             try{
//                 Thread.sleep(1000);
//             }catch (InterruptedException e){}
//             System.out.println(letter+ "]");
//         }
//        //
//         //
//    }
//
//}

//how to achive fairness policy?
class Printer{
    private Lock lock=new ReentrantLock(true);//ReentrantLock vs ReadWriteLock

    public void printLetter(String letter){
       try{
           lock.lock();
           System.out.print("[");
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){}
           System.out.println(letter+ "]");
       }finally {
           lock.unlock();
       }
    }

}
class Client implements Runnable{
    private String letter;
    private Printer printer;
    private Thread thread;

    public Client(String letter, Printer printer) {
        this.letter = letter;
        this.printer = printer;
        this.thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        printer.printLetter(letter);
    }
}
public class A_NeedOfSyn {
    public static void main(String[] args) {

        Printer printer=new Printer();
        Client c1=new Client("i love java", printer);
        Client c2=new Client("i hate java", printer);
        Client c3=new Client("i love maths", printer);



    }
}
