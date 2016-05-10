package ru.saton.test6;

import java.util.Scanner;

public class Test6 {
    static int a;
    static int b;
    static int c;
    static String d;
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        Breed breed = new Breed();
        breed.eat();
        a = scan.nextInt();
        b = scan.nextInt();
        breed.sleep(a,b);
        System.out.println(breed.sleep(a,b));
        d = scan.next();
        breed.voice(d);
        System.out.println(breed.voice(d));
        Monkey monkey = new Monkey();
        monkey.eat();
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        monkey.sleep(a,b,c);
        System.out.println(monkey.sleep(a,b,c));

    }
}
