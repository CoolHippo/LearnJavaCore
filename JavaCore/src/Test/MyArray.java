package Test;

public class MyArray {
    public static void main(String[] args) {
        byte i = 0;
        byte[] array = new byte[20];
        while (i < array.length){
            array[i] = i;
            System.out.println("Element array["+i+"] = "+i);
            i++;
        }
    }
}
