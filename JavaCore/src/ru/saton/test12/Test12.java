package ru.saton.test12;

public class Test12 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();

        mt.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("I'm first thread");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
