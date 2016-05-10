package ru.saton.test;

public class MyArray4 {
    public static void main(String[] args) {
        int[] array = new int[7];
        ElementArray eArray = new ElementArray();
        array[0] = eArray.a;
        array[1] = eArray.b;
        array[2] = eArray.c;
        array[3] = eArray.d;
        array[4] = eArray.e;
        array[5] = eArray.f;
        array[6] = eArray.g;
        for(int i =0; i < array.length; i++){
            System.out.println("Element array["+i+"] = "+ array[i]);

        }
    }
     static class ElementArray{
        int a = 12;
        int b = 10;
        int c = 3;
        int d = 35;
        int e = 40;
        int f = 22;
        int g = 9;
    }
}
