import java.util.Arrays;

public class Home7 {
    public static void main(String[] args) {
        int min, max, s = 0;
        int N = 15;
        int[] nam = new int[N];
        for (int i = 0; i < N; i++) {
            int a = (int)(Math.random() * (100 - 1) + 1);
            nam[i] = a;
            s = (s + a) / N;
       //     System.out.print(nam[i] + " ");
        }
      /*  min = nam[0];
        for (int i = 0; i < nam.length; i++) {
            if (min > nam[i])
                min = nam[i];
        }
        max = nam[0];
        for (int i = 0; i < nam.length; i++) {
            if (max < nam[i])
                max = nam[i];
        }
        System.out.println("min: " + min + ", max: " + max + ", avarage: " + s); */
        Arrays.sort(nam);
        System.out.println(nam[0] + " " + nam[nam.length - 1]);
    }
}
