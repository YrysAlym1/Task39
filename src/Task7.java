import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /**
         *7. Биз клавиатурадан 3 орундуу сан беребиз, ошол сандын ар бир
         * орундагы сандарынын суммасыны табышыбыз керек.
         * Мисалы:
         * Input: 359
         * Output: 3 + 5 + 9 = 17
         * Input: 409
         * Output: 4 + 0 + 9 = 13 **/

        Scanner scanner= new Scanner(System.in);
        System.out.println("Input: ");
        int input = scanner.nextInt();

        int result1 = input / 100;
        int result2 = (input / 10) % 10;
        int result3 = input % 10;

        System.out.println(result1 +  result2 + result3);
    }
}
