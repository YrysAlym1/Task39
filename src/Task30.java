import java.util.Random;
import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        /**
         * 30. Напишите программу, которая генерирует числа от 1 до 3, 1 -
         * камень, 2 - ножницы, 3 бумага. Сиз озунуз бир сан бересиз
         * консольдон анан текшересиз if, else if, else шарттык операторлор
         * менен, ким утту же тең чыгуу болду деп.
         * Компьютер утса, консольго толук малымат чыгыш керек кимде
         * кайсыл вариант чыкты жана ким утту.**/


        // while
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        while (true) {
//            System.out.println("1-камень , 2-ножницы , 3-бумага, 0-оюнду токтотуу");
//            int scanNum = scanner.nextInt();
//            int ranNum = random.nextInt(1, 4);
//
//
//            if (scanNum == 1 && ranNum == 1) {
//                System.out.println("user: камень" + " \nlaptop: камень" + "\nНичья!");
//            } else if (scanNum == 1 && ranNum == 2) {
//                System.out.println("user: камень" + " \nlaptop: ножницы" + "\nсиз уттунуз!");
//            } else if (scanNum == 1 && ranNum == 3) {
//                System.out.println("user: камень" + " \nlaptop: бумага" + "\nкомпютер утту!");
//            } else if (scanNum == 2 && ranNum == 1) {
//                System.out.println("user: ножницы" + " \nlaptop: камеь" + "\nкомпютер утту!");
//            } else if (scanNum == 2 && ranNum == 2) {
//                System.out.println("user: ножницы" + " \nlaptop: ножницы" + "\nНичья!");
//            } else if (scanNum == 2 && ranNum == 3) {
//                System.out.println("user: ножницы" + " \nlaptop: бумага" + "\nСиз уттунуз!");
//            } else if (scanNum == 3 && ranNum == 1) {
//                System.out.println("user: бумага" + " \nlaptop: камень" + "\nСиз уттунуз!");
//            } else if (scanNum == 3 && ranNum == 2) {
//                System.out.println("user: бумага" + " \nlaptop: ножницы" + "\nкомпютер утту!");
//            } else if (scanNum == 3 && ranNum == 3) {
//                System.out.println("user: бумага" + "\nlaptop: бумага" + "\n Ничья!");
//            } else {
//                System.out.println("мындай команда жок!");
//            }
//
//        }


        // for
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; true; i++) {
            System.out.println("1-камень , 2-ножницы , 3-бумага, 0-оюнду токтотуу");
            int scanNum = scanner.nextInt();
            int ranNum = random.nextInt(1, 4);


            if (scanNum == 0) {
                break;
            }
            if (scanNum == 1 && ranNum == 1) {
                System.out.println("user: камень" + " \nlaptop: камень" + "\nНичья!");
            } else if (scanNum == 1 && ranNum == 2) {
                System.out.println("user: камень" + " \nlaptop: ножницы" + "\nсиз уттунуз!");
            } else if (scanNum == 1 && ranNum == 3) {
                System.out.println("user: камень" + " \nlaptop: бумага" + "\nкомпютер утту!");
            } else if (scanNum == 2 && ranNum == 1) {
                System.out.println("user: ножницы" + " \nlaptop: камеь" + "\nкомпютер утту!");
            } else if (scanNum == 2 && ranNum == 2) {
                System.out.println("user: ножницы" + " \nlaptop: ножницы" + "\nНичья!");
            } else if (scanNum == 2 && ranNum == 3) {
                System.out.println("user: ножницы" + " \nlaptop: бумага" + "\nСиз уттунуз!");
            } else if (scanNum == 3 && ranNum == 1) {
                System.out.println("user: бумага" + " \nlaptop: камень" + "\nСиз уттунуз!");
            } else if (scanNum == 3 && ranNum == 2) {
                System.out.println("user: бумага" + " \nlaptop: ножницы" + "\nкомпютер утту!");
            } else if (scanNum == 3 && ranNum == 3) {
                System.out.println("user: бумага" + "\nlaptop: бумага" + "\n Ничья!");
            } else {
                System.out.println("мындай команда жок!");
            }
        }
    }
}
