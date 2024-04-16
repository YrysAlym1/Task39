import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /**
         *3. Сиздер консольдон 2 орундуу сан киргизишиниздер керек, ошол
         * санды сиздер математикалык турдоо консольго чыгарышыныздар
         * керек
         * Мисалы:
         * Input: 34
         * Output: 30 + 4
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number: ");
        int number = scanner.nextInt();

        int res = number / 10;
        int res2 = number % 10;
        System.out.println(res + "0 + " + res2);
    }
}
