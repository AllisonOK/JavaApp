package com.example.javaapp.lock;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedImpl implements Runnable{


    Object object = new Object();
    ReentrantLock reentrantLock = new ReentrantLock();


    @Override
    public void run() {

    }
}
