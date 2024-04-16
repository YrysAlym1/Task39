import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /**
         * 10. Напишите программу, который принимает с клавиатуры целое
         * положительное число и, если оно как минимум трехзначное и
         * положительное, уменьшает его на 1.
         * Мисалы:
         * Input: 332
         * Output: 331**/

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Input: ");
        int num = scanner.nextInt();
        if (num >= 100) {
            System.out.println(num - 1);
        } else {
            System.out.println(num);
        }
    }
}
