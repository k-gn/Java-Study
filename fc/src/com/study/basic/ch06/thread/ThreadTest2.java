package com.study.basic.ch06.thread;

class MyThread2 implements Runnable{

    public void run(){
//        int i;
//        for(i=0; i<200; i++){
//            System.out.print(i + "\t");
//        }
        System.out.println(Thread.currentThread());
    }
}


public class ThreadTest2 {

    public static void main(String[] args) {

        System.out.println("main start");

        MyThread2 mth = new MyThread2();
        Thread th1 = new Thread(mth);
        th1.start();

        Thread th2 = new Thread(new MyThread2());
        th2.start();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
                System.out.println(Thread.currentThread());
            }
        };
        run.run();

        System.out.println("main end");
    }

}
