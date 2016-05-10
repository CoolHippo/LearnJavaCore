package ru.saton.test;

public class MyArray3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for(int i = 0; i < array.length; i+=2){
            System.out.println("Elements array["+i+"] = "+i);
        }
    }
}
