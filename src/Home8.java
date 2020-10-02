import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class Home8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 2 + i * 2;
//            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[array.length - i - 1]) + " ");
        }
    }
}
