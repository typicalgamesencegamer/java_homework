package ru.aston.hometask_4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TwoThreads {
    private static final Object lock = new Object();
    private static boolean isThread1 = true;

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!isThread1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println(Thread.currentThread().getName() + "interrupted");
                        }
                    }
                    System.out.print("1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println(Thread.currentThread().getName() + "interrupted");
                    }
                    isThread1 = false;
                    lock.notify();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (isThread1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println(Thread.currentThread().getName() + "interrupted");
                        }
                    }
                    System.out.print("2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println(Thread.currentThread().getName() + "interrupted");
                    }
                    isThread1 = true;
                    lock.notify();
                }
            }
        }).start();
    }
}
