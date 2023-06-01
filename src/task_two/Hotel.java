package task_two;

public class Hotel { public static int getRandomDiceNumber()
{
    return (int) (Math.random() * 10) + 1;
}
    public static int getRandomNumber()
    {
        return (int) (Math.random() * 3) + 0;
    }

    public void hotel() {
       int numder = getRandomDiceNumber();
        if (numder==1){
            double numder1 =getRandomNumber();
            System.out.println("Лайтхаус " + "Количество звёзд "+numder1 +" класс номера:однокомнатный");
        }
        else if (numder==2){
            double numder2 = getRandomNumber();
            System.out.println("Ritz Plaza " + "Количество звёзд "+numder2 +" класс номера:двухкомнатный");
        }
        else if (numder==3){
            double numder3 = getRandomNumber();
            System.out.println("Мини-отель " + "Количество звёзд "+numder3 +" класс номера:люкс");
        }
        else if (numder==4){
            double numder4 = getRandomNumber();
            System.out.println("AvHouse " + "Количество звёзд "+numder4 +" класс номера:президентский");
        }
        else if (numder==5){
            double numder5 = getRandomNumber();
            System.out.println("РумОтель " + "Количество звёзд "+numder5 +" класс номера:однокомнатный");
        }
        else if (numder==6){
            double numder6 = getRandomNumber();
            System.out.println("Coziness " + "Количество звёзд "+numder6 +" класс номера:двухкомнатный");
        }
        else if (numder==7){
            double numder7 = getRandomNumber();
            System.out.println("Спектр-Отель " + "Количество звёзд "+numder7 +" класс номера:люкс");
        }
        else if (numder==8){
            double numder8 = getRandomNumber();
            System.out.println("O'Hostel " + "Количество звёзд "+numder8 +" класс номера:президентский");
        }
        else if (numder==9){
            double numder9 = getRandomNumber();
            System.out.println("Гельвеция " + "Количество звёзд "+numder9 +" класс номера:двухкомнатный");
        }
        else {
            System.out.println("Ищите жильё сами");
        }
    }
}
