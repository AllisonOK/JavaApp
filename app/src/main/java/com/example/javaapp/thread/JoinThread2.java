package com.example.javaapp.thread;

import android.util.Log;

public class JoinThread2 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i("join Thread", "炒好菜了");
    }

}
