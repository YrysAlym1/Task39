import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /**
         *
         * 2. Сиздер консольдон 2 орундуу сан киргизишиниздер керек, ошол
         * санды сиздер математикалык турдоо консольго чыгарышыныздар
         * керек
         * Мисалы:
         * Input: 34
         * Output: 30 + 4
         * Input: 49
         * Output: 40 + 9*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();
        int res = (number / 10);
        int res2 = number % 10;
        System.out.println(res+ "0 + " + res2);
    }
}
