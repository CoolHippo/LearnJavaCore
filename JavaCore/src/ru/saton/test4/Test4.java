package ru.saton.test4;

public class Test4 {
    public static void main(String[] args) {
        Reno reno = new Reno();
        System.out.println(reno.door);
        System.out.println(reno.wheel);
        System.out.println(reno.body);
        reno.start();
        reno.stop();
        reno.speed();


    }
}
