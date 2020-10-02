public class SecondLesson {
    public static void main(String[] args) {
        //if else

        int state = 0;
        if (state == 0)
            System.out.println("Закрытие приложения");
        else if (state == 1)
            System.out.println("Запуск приложения");
        else
            System.out.print("Ошибка стутса");

        int count = 605;


            if (count >= 90 && count <= 100)
                System.out.println("ваша оценка " + 5);
            else if (count >= 60 && count < 90)
                System.out.println("ваша оценка " + 4);
            else if (count >= 40 && count < 60)
                System.out.println("ваша оценка " + 3);
            else if (count > 100 || count < 0)
                System.out.print("ошибка!");
            else
                System.out.println("ваша оценка " + 2);




            System.out.println();

            int sum = 10000;
            int code = 5698;
            switch (code){
                case 4653:
                    System.out.println("скидка 30% = " + (sum * 0.3));
                    break;
                case 5698:
                    System.out.println("скидка 20% = " + (sum * 0.2));
                    break;
                case 5111:
                    System.out.println("скидка 20% = " + (sum * 0.2));
                    break;
                case 6922:
                    System.out.println("скидка 10% = " + (sum * 0.1));
                    break;
                case 6113:
                    System.out.println("скидка 10% = " + (sum * 0.1));
                    break;
                case 6099:
                    System.out.println("скидка 10% = " + (sum * 0.1));
                    break;
                default:
                    System.out.println("скидки нет");
                    break;
            }
    }
}