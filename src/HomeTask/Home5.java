package HomeTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class   Home5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите номер билета");
        BufferedReader nam = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(nam.readLine());
        switch (m){
            case(111):
                System.out.println("Вы получили Книгу");
                break;
            case(222):
                System.out.println("Вы получили Книгу");
                break;
            case(333):
                System.out.println("Вы получили Книгу");
                break;
            case(444):
                System.out.println("Вы получили Телефон");
                break;
            case(555):
                System.out.println("Вы получили Телефон");
                break;
            case(777):
                System.out.println("Вы получили Ноутбук");
                break;
            default:
                System.out.println("Вы ничего не получили");
                break;
        }

    }
}
