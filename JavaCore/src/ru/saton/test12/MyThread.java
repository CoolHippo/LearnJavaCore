package ru.saton.test12;

public class MyThread implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I'm second thread");
        }
    }
}
