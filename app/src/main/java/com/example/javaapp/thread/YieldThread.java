package com.example.javaapp.thread;

import android.util.Log;

/**
 * YieldThread yieldThread = new YieldThread();
 *         Thread threadA = new Thread(yieldThread, "A");
 *         Thread threadB = new Thread(yieldThread, "B");
 *         threadA.start();
 *         threadB.start();
 */
public class YieldThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            Log.i("yield thread", Thread.activeCount() + Thread.currentThread().getName() + "_" + i);
            if(i == 5) {
                Thread.yield();
            }
        }
    }
}
