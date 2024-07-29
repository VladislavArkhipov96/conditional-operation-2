//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Task 1
        System.out.println("Task 1");

        int os = 0;
        if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 2
        System.out.println("Task 2");

        os = 1;
        int clientDeviceYear = 2021;

        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");

        }

        //Task 3
        System.out.println("Task 3");

        int year = 2024;

        if (year < 1584) {
            System.out.println("Год не является високосным");
        } else if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        //Task 4
        System.out.println("Task 4");

        int distance = 40;
        int days = -1;

        if (distance <= 20) {
            days = 1;

        } else if (distance > 20 && distance <= 60) {
            days = 2;

        } else if (distance > 60 && distance <= 100) {
            days = 3;

        } else {
            days = -1;
        }

        System.out.println("Потребуется дней:" + days);

        //Task 5
        System.out.println("Task 5");

        int monthNumber = 10;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не правильный номер месяца");

        }


    }
}