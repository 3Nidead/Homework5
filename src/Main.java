public class Main {
    public static void main(String[] args) {
//Задача1
        int clientOS = 0;
        int ios = 0;
        int android = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//Задача2
        int clientDeviceYear = 2015;
        int clientOSa = 1;
        int ioss = 0;
        int androidd = 1;
        if (clientOSa == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSa == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOSa == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOSa == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
//Задача3
        int year = 1584;
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
//Задача4
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
//Задача5
        int monthNumber = 2;
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца не существует");
        }
    }
}