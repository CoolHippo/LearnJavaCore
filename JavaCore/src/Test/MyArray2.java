package Test;

public class MyArray2 {
    public static void main(String[] args) {
        byte[] array = new byte[20];
        for(byte i = (byte) array.length; i > 0; i--){
            System.out.println("Elements array["+i+"] = "+i);
        }
    }
}
