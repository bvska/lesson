import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[][] ints5 = {
                {2, 3, 45},
                {6, 7, 81, 8, 4, 7},
                {16, -7, 801, 228}
        };
        for (int i = 0; i < ints5.length; i++) {
          //  System.out.println(" ");
            for (int j = 0; j < ints5[i].length ; j++) {
               // System.out.print((ints5[i][j]) * (ints5[i][j]) + " ");
           ints5[i][j] *= ints5[i][j];
            }
            System.out.println(Arrays.deepToString(ints5));
        }
    }

}
