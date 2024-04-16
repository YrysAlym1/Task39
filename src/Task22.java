import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        /**
         *22. Назовем билет с шестизначным номером «счастливым», если
         * сумма первых трех его цифр равна сумме последних трех его цифр
         * и обе эти суммы являются четными.
         * Напишите класс, который принимает с клавиатуры шестизначный
         * номер билета и проверяет, является ли он «счастливым» или не
         * является **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("алты орундуу сан жазыныз: ");
        int number = scanner.nextInt();

        int res1 = number / 100000 % 10;
        int res2 = number / 10000 % 10;
        int res3 = number / 1000 % 10;
        int res4 = number / 100 % 10;
        int res5 = number / 10 % 10;
        int res6 = number % 10;

        int sum1 = res1 + res2 + res3;
        int sum2 = res4 + res5 + res6;

        if (sum1 % 2 == 0 && sum2 % 2 == 0) {
            System.out.println(number + " Счастливый билет!");
        } else {
            System.out.println(number + " Не счастливый билет!");
        }

    }
}
