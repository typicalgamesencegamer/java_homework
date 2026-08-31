package ru.aston.hometask_4;

import java.util.concurrent.locks.ReentrantLock;

public class Livelock {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        new Thread(() -> {
            while (true) {
                lock1.tryLock();
                System.out.println(Thread.currentThread().getName() + " acquire lock1");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (lock2.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " acquire lock2");
                } else {
                    System.out.println(Thread.currentThread().getName() + " cannot acquire lock2");
                    lock1.unlock();
                    continue;
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                lock2.tryLock();
                System.out.println(Thread.currentThread().getName() + " acquire lock2");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (lock1.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " acquire lock1");
                } else {
                    System.out.println(Thread.currentThread().getName() + " cannot acquire lock1");
                    lock2.unlock();
                    continue;
                }
            }
        }).start();
    }
}
