import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LoopingStatements {
    public static void main(String[] args) throws IOException {
        // инкремент увеличивает значение на 1
        // декремент уменьшает значение на 1
        // бывает постафикс i++ (возващает значение потом увеличивает)
        // и префикс ++i (сначало увеличивает потом возвращает значение)

    //    int a = 2;
      //  int res = 13;


      //  int i = 55;
     //   while (i <= 78) {
       //     System.out.println(i);
      //      i++;
      //  }

     /*  BufferedReader nam = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите число");
           while (true ) {
               int n = Integer.parseInt(nam.readLine());
               if (n != 0)
                   System.out.println(n * 2);
               else
                   break;
           }
      */


        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        //int nam = scanner.nextInt();
    //    while (true) {
        //    int nam = scanner.nextInt();
      //      if (nam != 0)
      //          System.out.println(nam * 2);
       ///     else
       //         break;
       // }
        do {
            int  nam = scanner.nextInt();
            if (nam > 0)
            System.out.println(nam * 2);
            else
                break;;

        } while (true);

        


       /* do {
            // инструкции в любом случае
        }
        while (условие);
        */


    }
}
