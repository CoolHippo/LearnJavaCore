package ru.saton.test6;

public class Monkey implements Mouse {
    public void eat() {
        System.out.println("I'm hungry");
    }

    public int sleep(int a, int b) {
        int c = a + b;
        return c;
    }

    public int sleep(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    public String voice(String a) {
        return a;
    }
}
