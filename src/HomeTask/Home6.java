package HomeTask;

import java.util.Scanner;

public class Home6 {
    public static void main(String[] args) {
        int m = (int)(Math.random() * (9 - 1 + 1) + 1);
        System.out.println("Введите целое число от 1 до 9:");
        Scanner scanner = new Scanner(System.in);
        int nam = 7;
        do {
            nam = scanner.nextInt();
            if (nam == 0)
                System.out.println("Выход из программы");
            else if (nam < 1)
                System.out.println("error");
            else if (nam > 9)
                System.out.println("error");
            else if (nam < m)
                System.out.println("загаданное число больше " + nam);
            else if (nam > m)
                System.out.println("загаданое число меньше " + nam);
            else if (nam == m && nam != 0) {
                System.out.println("Вы угадали это число " + nam);
                break;
            }


        }
        while (nam != 0);





    }
}
