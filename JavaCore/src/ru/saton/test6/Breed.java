package ru.saton.test6;

public class Breed implements Mouse {

    public void eat() {
        System.out.println("I'am eat");
    }

    public int sleep(int a, int b) {
        int c = a + b;
        return c;
    }

    public String voice(String a) {
        return a;
    }
}
