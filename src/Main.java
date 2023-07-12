import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void printYear(int learYear) {

        if (learYear % 4 == 0 && learYear % 100 != 0 || learYear % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }

    public static void task1() {
        System.out.println("Задача 1");
        int leapYear = 2021;
        printYear(leapYear);
        // Пишем код для задачи 1
    }

    public static int checkOS(int cliensOS) {
        int android = 0;
        int iOS = 1;

        if (cliensOS == android) {
            cliensOS = android;

        } else if (cliensOS == iOS) {
            cliensOS = iOS;

        }
        return cliensOS;
    }

    public static int yearPhone(int yearPhone) {
        int currentYear = LocalDate.now().getYear();

        if (yearPhone == currentYear) {
            yearPhone = 0;

        } else {
            yearPhone = 1;
        }

        return yearPhone;
    }

    private static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        int phoneOS = checkOS(clientOS);
        int yearPhone = yearPhone(clientDeviceYear);

        if (phoneOS == 0 && yearPhone == 1) {
            System.out.println("Установите приложение для Android по ссылке");

        } else if (phoneOS == 0 && yearPhone != 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (phoneOS == 1 && yearPhone == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (phoneOS == 1 && yearPhone != 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else
            System.out.println("Ваша ОС не поддерживается");
    }
    // Пишем код для задачи 2


    private static int checkDeliveryDay (int deliveryDistance){
        int day = 0;

        if (deliveryDistance<20) {
            day += 1;

        } else if (20<=deliveryDistance && deliveryDistance<60) {
            day += 2;

        } else if (60<=deliveryDistance && deliveryDistance<=100) {
            day += 3;

        } else {
            day += 4;

        }
        return day;
    }
    private static void task3() {
        System.out.println("задача 3");
        int deliveryDistance = 95;
        int deliverydays = checkDeliveryDay(deliveryDistance);

        if(deliverydays<=3){
            System.out.println("Потребуется дней " + deliverydays + " для доставки");

        } else {
            System.out.println("Доставка невозможна.");}

        // Пишем код для задачи 3

    }
}


