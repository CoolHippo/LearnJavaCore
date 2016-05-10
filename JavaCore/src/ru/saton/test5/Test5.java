package ru.saton.test5;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Jack jack = new Jack();
        jack.start();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(jack.a);
        System.out.println(jack.b);
        System.out.println(jack.c);
        System.out.println(jack.decline(a,b));
    }
}
