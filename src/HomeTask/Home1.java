package HomeTask;

import com.sun.source.tree.WhileLoopTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        System.out.println("загадайте число от 1 до 100");
        int xmax = 101, xmin = 1;
        int x = (xmin + xmax) / 2;
        Scanner nam = new Scanner(System.in);
        outer:
        do {
            System.out.println("Загаданное число " + x + "?");
            int answer = nam.nextInt();

            if (answer == 1) {
                System.out.println("Я угадал, Ура!");
                break;
            } else
                System.out.println("Загаданное число больше " + x + "?");
            answer = nam.nextInt();
            if (answer == 1) {
                xmin = x;
                x = (int) ((x + xmax) / 2);
                continue outer;
            } else {
                System.out.println("Загаданное число меньше " + x + "?");
                answer = nam.nextInt();
                if (answer == 1) {
                    xmax = x;
                    x = (int) ((x + xmin) / 2);
                    continue outer;
                } else {
                    System.out.println("начнем еще раз!");
                    break;
                }
            }
        }
        while (true);
    }
}
