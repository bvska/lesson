package HomeTask;

public class Home4 {
    public static void main(String[] args) {
        int m = (int)(Math.random() * 491) + 10;
        if (m > 25 && m < 200)
            System.out.println("Число " + m + " содержится в интервале (25;200)");
        else if (m < 10 && m > 500)
            System.out.println("error");
        else
            System.out.println("Число " + m + " не содержится в интервале (25;200)");
    }
}
