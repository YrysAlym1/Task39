import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /**\
         *4. Сиздер консольдон 3 орундуу сан киргизишиниздер керек, ошол
         * санды сиздер математикалык турдоо консольго чыгарышыныздар
         * керек
         * Мисалы:
         * Input: 364
         * Output: 300 + 60 + 4
         * **/

        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        int res1 = num / 100;
        int res2 = (num / 10) % 10;
        int res3 = num % 10;

        System.out.println(res1 + "00 + " + res2 + "0 + " + res3);
    }
}
