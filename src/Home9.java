public class Home9 {
    public static void main(String[] args) {
        int[] array = new int[11];
        int q = 0,w = 0 ,e = 0;
        for (int i = 0; i < array.length; i++) {
            int a =1 - (int)(Math.random() * 3);
            array[i] = a;
              if(a == -1)
                q++;
            else if (a == 0)
                w++;
            else
                e++;
        }
        System.out.println(q + " " +  w + " " + e);
        if (q == w || q == e || e == w)
            return;
        if (q > w && q > e)
            System.out.println(" -1 Больше других чисел");
        else if (w > q && w > e)
            System.out.println(" 0 Больше других чисел");
        else if (e > q && e > w)
            System.out.println(" 1 Больше других чисел");
    }
}
