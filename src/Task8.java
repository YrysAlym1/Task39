import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /**
         * 8. Напишите программу, который принимает с клавиатуры целое
         * число и, если оно положительное, увеличивает его вдвое. Класс
         * должен выводить на экран новое значение.
         * Мисалы:
         * Input: 4
         * Output: 8
         * Input: -5
         * Output: -5**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int num = scanner.nextInt();

        if(num > 0) {
            System.out.println(num * 2);
        } else {
            System.out.println(num);
        }
    }
}
