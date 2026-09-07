package ru.aston.hometask_4;

import java.util.concurrent.locks.ReentrantLock;

public class Livelock {
    private static final ReentrantLock LOCK_1 = new ReentrantLock();
    private static final ReentrantLock LOCK_2 = new ReentrantLock();

    public static void main(String[] args) {

        new Thread(() -> {
            while (true) {
                if (LOCK_1.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " acquire lock1");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println(Thread.currentThread().getName() + " is interrupted");
                    }
                    if (LOCK_2.tryLock()) {
                        System.out.println(Thread.currentThread().getName() + " acquire lock2");
                    } else {
                        System.out.println(Thread.currentThread().getName() + " cannot acquire lock2");
                        LOCK_1.unlock();
                        continue;
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (LOCK_2.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " acquire lock2");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println(Thread.currentThread().getName() + " is interrupted");
                    }
                    if (LOCK_1.tryLock()) {
                        System.out.println(Thread.currentThread().getName() + " acquire lock1");
                    } else {
                        System.out.println(Thread.currentThread().getName() + " cannot acquire lock1");
                        LOCK_2.unlock();
                        continue;
                    }
                }
            }
        }).start();
    }
}
