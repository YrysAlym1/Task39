import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        /**
         * 24. Напишите класс, который принимает с клавиатуры
         * положительное трехзначное число и проверяет, сколько разных
         * цифр оно содержит.**/

        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        while (num1 <= num2){
//            System.out.println(num1);
//            num1++;
//        }
        System.out.println("Напишите трех значное число: ");
        int number = scanner.nextInt();

        int count = 3;
        int res1 = number / 100;
        int res2 = (number / 10) % 10;
        int res3 = number % 10;

        if (res1 == res2 || res1 == res3) {
            count--;
        }
        if (res2 == res3) {
            count--;
        }
        System.out.println("содержит "+ count + " разных цифр");
    }
}
