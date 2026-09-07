package ru.aston.hometask_4;

public class TwoThreads {
    private static final Object LOCK = new Object();
    private static boolean isThread1 = true;

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                synchronized (LOCK) {
                    while (!isThread1) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println(Thread.currentThread().getName() + " is interrupted");
                        }
                    }
                    System.out.print("1");
                    isThread1 = false;
                    LOCK.notify();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().getName() + " is interrupted");
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (LOCK) {
                    while (isThread1) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            System.out.println(Thread.currentThread().getName() + " is interrupted");
                        }
                    }
                    System.out.print("2");
                    isThread1 = true;
                    LOCK.notify();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().getName() + " is interrupted");
                }
            }
        }).start();
    }
}
