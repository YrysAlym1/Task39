import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /**
         * 5. Напишите программу, который принимает с клавиатуры целое
         * положительное двузначное число. Затем следует построить новое
         * значение, составленное из цифр числа, введенного с клавиатуры,
         * но в обратном порядке. После этого новое значение следует
         * увеличить на 8, и окончательный результат вывести на экран.
         * Мисалы:
         * Input: 37
         * Output: 81**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int number = scanner.nextInt();
        int res1 = number / 10;
        int res2 = number % 10;
        int res3 = res2 * 10 + res1 + 8;

        System.out.println("Output: " + res3);
    }
}
