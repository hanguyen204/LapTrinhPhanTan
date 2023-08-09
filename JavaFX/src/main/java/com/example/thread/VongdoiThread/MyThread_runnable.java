package com.example.thread.VongdoiThread;

public class MyThread_runnable extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Start");
    }

    public static void main(String[] args) {
        MyThread_runnable myThreadRunnable = new MyThread_runnable();
        myThreadRunnable.start();
        System.out.println(myThreadRunnable.getState());
    }
}
