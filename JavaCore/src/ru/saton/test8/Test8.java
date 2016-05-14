package ru.saton.test8;

public class Test8 {
    public static void main(String[] args) {
        String [][] array = new String [10][10];

        array[0][0] = "*";
        array[1][0] = "**";
        array[2][0] = "***";
        array[3][0] = "****";
        array[4][0] = "*****";
        array[5][0] = "******";
        array[6][0] = "*******";
        array[7][0] = "********";
        array[8][0] = "*********";
        array[9][0] = "**********";


        for (int i = 0; i < array.length; i++) {

                System.out.println(array[i][0]);

        }

    }
}
