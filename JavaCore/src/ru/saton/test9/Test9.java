package ru.saton.test9;

public class Test9 {
    public static void main(String[] args) {
        int a = 0;
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = a;
                    a++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    System.out.println(array[i][k][j]);

                }
            }
        }

    }
}
