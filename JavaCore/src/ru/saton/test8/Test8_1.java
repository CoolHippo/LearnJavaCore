package ru.saton.test8;

public class Test8_1 {
    public static void main(String[] args) {
        String[][] array = new String[10][10];
        array[0][9] ="*";
        array[1][9] ="**";
        array[2][9] ="***";
        array[3][9] ="****";
        array[4][9] ="*****";
        array[5][9] ="******";
        array[6][9] ="*******";
        array[7][9] ="********";
        array[8][9] ="*********";
        array[9][9] ="**********";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                array[i][j] = " ";
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(j<9) {
                    System.out.print(array[i][j]);
                }else {
                    System.out.println(array[i][j]);
                }
            }


        }

    }
}
