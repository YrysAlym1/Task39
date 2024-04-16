import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /**
         * 6. Напишите программу, который принимает с клавиатуры целое
         * положительное трехзначное число. Затем следует построить новое
         * значение, составленное
         * из цифр числа, введенного с клавиатуры, но в обратном
         * порядке. После этого новое значение следует уменьшить на 20, и
         * окончательныйрезультат вывести на экран.
         * Мисалы:
         * Input: 327
         * Output: 703**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int num = scanner.nextInt();

        int num2 = num / 100;
        int num3 = (num / 10) % 10;
        int num4 = num % 10;

        int res1 = num4 * 100;
        int res2 = num3 * 10;
        int res3 = num2;

        System.out.println((res1 + res2 +  res3) - 20);
    }
}
