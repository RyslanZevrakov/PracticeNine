package task_two;

import java.util.Scanner;

public class Tour {
    AirTicket airTicket = new AirTicket();

    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    public void transition() {
        int numder = getRandomDiceNumber();
        if (numder == 1) {
            airTicket.aVoid();

        } else if (numder == 2) {
            airTicket.aVoid();
        } else if (numder == 3) {
            airTicket.aVoid();
        } else if (numder == 4) {
            airTicket.aVoid();
        } else if (numder == 5) {
            airTicket.aVoid();
        } else if (numder == 6) {
            airTicket.aVoid();
        } else if (numder == 7) {
            airTicket.aVoid();
        } else if (numder == 8) {
            airTicket.aVoid();
        } else if (numder == 9) {
            airTicket.aVoid();
        } else if (numder == 10) {
            System.out.println("билетов нет");
        } else if (numder == 0) {
            System.out.println("Вы ошиблись номером");
        } else {
            System.out.println("крабанкрок");
        }
    }

    public void tour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну");
        String country = scanner.nextLine();
        System.out.println("Введите город");
        String city = scanner.nextLine();
        transition();

        System.out.println(country);
        System.out.println(city);
    }
}
