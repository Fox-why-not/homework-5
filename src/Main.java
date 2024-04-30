public class Main {
    public static <INT> void main(String[] args) {
int clientOS = 1;
if (clientOS == 1) {
    System.out.println("Установите версию приложения для Android по ссылке");
} else if (clientOS == 0) {
    System.out.println("Установите версию приложения для iOS по ссылке");
}
int clientOS2 = 1;
int clientDeviceYear = 2015;
if (clientOS2 == 0 && clientDeviceYear < 2015) {
    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
} else if (clientOS2 == 0 && clientDeviceYear >= 2015) {
    System.out.println("Установите версию приложения для iOS по ссылке");
} else if (clientOS2 == 1 && clientDeviceYear < 2015) {
    System.out.println("Установите облегченную версию приложения для Android по ссылке");
} else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
    System.out.println("Установите версию приложения для Android по ссылке");
}
int year = 1981;
if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
    System.out.println( year + " год является високосным");
} else {
    System.out.println( year + " год не является високосным");
}

int deliveryDistance = 95;
int days = 1;
if (deliveryDistance > 100) {
    System.out.println("Доставки нет");
} else {
    if (deliveryDistance > 20) {
        days++;
    }
    if (deliveryDistance > 60) {
        days++;
    }
}
        System.out.println("Потребуется дней: " + days + " дня.");

int month = 12;
switch (month) {
    case 1:
    case 2:
    case 12:
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

    case  9:
    case 10:
    case 11:
        System.out.println("Осень");
        break;

    default:
        System.out.println("Не знаем такой месяц");
}
    }
}