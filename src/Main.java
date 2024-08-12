public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_3.");
        System.out.println();

        System.out.println("Задача 3.1.");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();
        System.out.println("Задача 3.2.");
        int clientOS1 = 0;
        int clientDeviceYear = 2012;

        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке.");
        }
        System.out.println();
        System.out.println("Задача 3.3.");
        int year = 2084;

        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println();
        System.out.println("Задача 3.4.");
        int deliveryDistance = 95;
        int deliveryTime = 0;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            System.out.println("Доставка невозможна");
        }
        System.out.println("Потребуется дней: " + deliveryTime);

        System.out.println();
        System.out.println("Задача 3.5.");
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный номер месяца");
                break;
        }
    }
}
