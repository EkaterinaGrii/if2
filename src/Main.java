public class Main {
    public static void main(String[] args) {

//        Задача1 Скачать приложение с учетом операционной системы
        byte clientOS = 0;
        String OS = "";
        OS = clientOS == 0 ? "iOS" : clientOS == 1 ? "Android" : "Ошибка";
        System.out.printf("Установите версию приложения для %s по ссылке \n", OS);


//        Задача2 Операционная система и год создания
        byte client = 6;
        int yearRelease = 2000;
        String str1 = "";
        str1 = yearRelease <= 2015 ? "облегченную" : "";
        String str2 = "";
        str2 = client == 0 ? "iOS" : client == 1 ? "Android" : "Ошибка ввода";
        System.out.printf("Установите %s версию приложения для %s по ссылке\n", str1, str2);

        //        Задача3 Високосный год
        int year = 2100;
        if (year < 1584) {
            System.out.println("Ошибка ввода");
        } else if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
            System.out.printf("%d год является високосным\n", year);
        } else {
            System.out.printf("%d год не является високосным\n", year);
        }


        //        Задача4 Доставка карт
        int deliveryDistance = 95;
        boolean a=deliveryDistance<=20;
        boolean b=deliveryDistance>20 && deliveryDistance<=60;
        boolean c=deliveryDistance>60 && deliveryDistance<=100;
        boolean d=deliveryDistance>100;
        int dayDelivery;
        if(a) {
            dayDelivery=1;
            System.out.println("Доставка составляет "+dayDelivery+" сутки");
        }if(b) {
            dayDelivery=2;
            System.out.println("Доставка составляет "+dayDelivery+" суток");
        }if(c) {
            dayDelivery=3;
            System.out.println("Доставка составляет "+dayDelivery+" суток");
        }if(d) {
            System.out.println("Доставка не осуществляется");
        }



//        Задача5 Сезон по номеру месяца
        byte monthNumber = 10;
        switch (monthNumber) {
            case 12,1,2 :
                System.out.println("Это зима");
                break;
            case 3,4,5 :
                System.out.println("Это весна");
                break;
            case 6,7,8 :
                System.out.println("Это лето");
                break;
            case 9,10,11 :
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }




















    }
}



