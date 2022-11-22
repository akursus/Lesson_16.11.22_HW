public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Возврат на стартовую ссылку для скачивания приложения");
        }

        //Task 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2012;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else  if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Возврат на стартовую ссылку для скачивания приложения");
        }

        //Task 3
        System.out.println("Задание 3");
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +" год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}