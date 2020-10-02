import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] a = new  int[]{3, 2, 3};
        int[] b = new  int[]{0, 2, 3, 5, 6, 4};
        System.out.println(Arrays.compare(a, b));
        System.out.println(Arrays.compareUnsigned(a, b) );
        System.out.println(Arrays.mismatch(a, b));
    }
}
