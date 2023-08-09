package com.example.thread.VongdoiThread;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("MyRunnable Start");
        for (int i = 0;i < 100; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("MyRunnable End");
    }

}
