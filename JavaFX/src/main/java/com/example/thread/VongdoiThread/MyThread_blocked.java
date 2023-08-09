package com.example.thread.VongdoiThread;

public class MyThread_blocked {
    public static synchronized void commonResource(){
        for (int i = 0; i < 100000;i++){

        }
    }
}
