import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /**
         * 9. Напишите программу, который принимает с клавиатуры целое
         * число и выводит на экран одно из следующих сообщений:
         * “Положительное”, или “Отрицательное”, или “Ноль”, - в зависимости
         * от значения числа**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Положительное");
        } else if(number < 0) {
            System.out.println("Отрицательное");
        }else {
            System.out.println("Ноль");
        }
    }
}
