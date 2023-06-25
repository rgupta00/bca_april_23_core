package com.demo2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoCountDownLatch {
    public static  class DependentService implements Runnable{
        private CountDownLatch countDownLatch;
        public DependentService(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }
        @Override
        public void run() {
            //startup task
            countDownLatch.countDown();
            //continue with other operations
        }
    }
    public static void main(String[] args) throws Exception{
        ExecutorService executor= Executors.newFixedThreadPool(4);
        CountDownLatch countDownLatch=new CountDownLatch(3);
        executor.submit(new DependentService(countDownLatch));
        executor.submit(new DependentService(countDownLatch));
        executor.submit(new DependentService(countDownLatch));

        countDownLatch.await();
        System.out.println("all depdendent service initilized...");
        //program initilized perform other operations

    }
}







