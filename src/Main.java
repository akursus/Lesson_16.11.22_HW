public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
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
        } else if (clientOS == 1) {
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
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20)
         {System.out.println("Банковская карта будет доставлена в течение одних суток");}
        if (deliveryDistance >= 20 && deliveryDistance < 60)
        {System.out.println("Для доставки банковской карты потребуется двое суток");}
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Для доставки банковской карты потребуется трое суток");}
        else if (deliveryDistance >= 100){
            System.out.println("Слишком далеко. Извините, но мы не сможем Вам доставить банковскую карту");
        }

        //Task 5
        System.out.println("Задание 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case  2:
                System.out.println("Февраль");
                break;
            case  3:
                System.out.println("Март");
                break;
            case  4:
                System.out.println("Апрель");
                break;
            case  5:
                System.out.println("Май");
                break;
            case  6:
                System.out.println("Июнь");
                break;
            case  7:
                System.out.println("Июль");
                break;
            case  8:
                System.out.println("Август");
                break;
            case  9:
                System.out.println("Сентябрь");
                break;
            case  10:
                System.out.println("Октябрь");
                break;
            case  11:
                System.out.println("Ноябрь");
                break;
            case  12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
        }
    }