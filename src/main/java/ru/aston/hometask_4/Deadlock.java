package ru.aston.hometask_4;

public class Deadlock {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " uses lock1");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + " uses lock2");
                }
            }
        }, "Thread1");
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " uses lock2");
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + " uses lock1");
                }
            }
        }, "Thread2");
        thread1.start();
        thread2.start();
    }
}
