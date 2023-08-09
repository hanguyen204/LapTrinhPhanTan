package com.example.thread.VongdoiThread;

public class MyThread_new extends Thread{
    @Override
    public void run(){
        MyThread_blocked.commonResource();

    }

    public static void main(String[] args) {
        MyThread_new n1 = new MyThread_new();
        MyThread_new n2 = new MyThread_new();
        MyThread_new n3 = new MyThread_new();

        n1.start();
        n2.start();
        n3.start();

        System.out.println(n1.getName() + ":  " + n1.getState());
        System.out.println(n2.getName() + ":  " + n2.getState());
        System.out.println(n3.getName() + ":  " + n3.getState());
//        System.out.println(n.getState());
    }
}
