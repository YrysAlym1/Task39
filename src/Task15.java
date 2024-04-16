import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        /**
         * 15. Бир программа жазыныз, клавиатурадан уч сан ала турган, анан
         * аларды if, else if, else жардамдары менен ушул сандарды чоною
         * тартибинде чыгарасыздар консольго.
         * Мисалы:
         * Input: 2 243 1
         * Output: 1, 2, 243
         * Input: 1 -5 92
         * Output: -5, 1, 92**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number: ");
        int num1 = scanner.nextInt();
        System.out.println("Write number: ");
        int num2 = scanner.nextInt();
        System.out.println("Write number: ");
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }

        }

    }
}
