package ru.aston.hometask_4;

public class Deadlock {
    private static final Object LOCK_1 = new Object();
    private static final Object LOCK_2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (LOCK_1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().getName() + " is interrupted");
                }
                System.out.println(Thread.currentThread().getName() + " uses lock1");
                synchronized (LOCK_2) {
                    System.out.println(Thread.currentThread().getName() + " uses lock2");
                }
            }
        }, "Thread1");
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + " is interrupted");
            }
            synchronized (LOCK_2) {
                System.out.println(Thread.currentThread().getName() + " uses lock2");
                synchronized (LOCK_1) {
                    System.out.println(Thread.currentThread().getName() + " uses lock1");
                }
            }
        }, "Thread2");
        thread1.start();
        thread2.start();
    }
}
