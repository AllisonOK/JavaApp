package com.example.javaapp.thread;

import android.util.Log;

/**
 * JoinThread joinThread = new JoinThread();
 *         JoinThread2 joinThread2 = new JoinThread2();
 *         Thread thread1 = new Thread(joinThread, "A");
 *         Thread thread2 = new Thread(joinThread2, "B");
 *         thread1.start();
 *         try {
 *             thread1.join();
 *         } catch (InterruptedException e) {
 *             e.printStackTrace();
 *         }
 *         thread2.start();
 */
public class JoinThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i("join Thread", "买菜");
    }

}
