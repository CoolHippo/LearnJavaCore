package ru.saton.test3;

public class Test3 {
    public static void main(String[] args) {
        Dollar dollar = new Dollar();
        System.out.println(dollar.age);
        System.out.println(dollar.weight);
        System.out.println(dollar.eyes);
        dollar.eat();
        dollar.woof();
        dollar.sleep();
    }
}
