import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /**
         * 1. Сиздер консольдон уч орундуу сан бересиздер, ошол санды
         * сиздер наобороттун чыгарып жана ортосунан болуп салышынздар
         * керек
         * Мисалы:
         * Input: 457
         * Output: 7 5 4**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

        int res1 = number / 100;
        int res2 = (number / 10) % 10;
        int res3 = number % 10;

        System.out.println(res3 + " " + res2 + " " + res1);

    }
}
