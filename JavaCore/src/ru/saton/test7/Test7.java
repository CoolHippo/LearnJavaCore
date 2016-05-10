package ru.saton.test7;

public class Test7 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        int c = 12;
        int d = 12;
        if (!(a.equals(b))){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        if (!(c==d)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
