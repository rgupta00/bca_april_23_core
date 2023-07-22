package com.demo2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoCyclicBarrier {

    public  static class  Task implements Runnable{
        private CyclicBarrier barrier;
        public Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }
        @Override
        public void run() {
            while (true){
                try {
                    barrier.await();
                }catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                //send message to corrospondence system
            }
        }
    }

    public static void main(String[] args) throws  Exception{
        ExecutorService executor= Executors.newFixedThreadPool( 4);
        CyclicBarrier barrier=new CyclicBarrier(3);
        executor.submit(new Task(barrier));
        executor.submit(new Task(barrier));
        executor.submit(new Task(barrier));
        Thread.sleep(2000);


    }
}
