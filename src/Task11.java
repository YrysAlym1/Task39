import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /**
         * 11. Напишите программу, который принимает с клавиатуры два
         * целых числа и, если первое больше второго, выводит на экран их
         * сумму, если же наоборот - выводит на экран их произведение. В
         * случае же, если числа одинаковы, программа выводит на экран
         * сообщение Числа равны**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int num = scanner.nextInt();
        System.out.println("Input: ");
        int num2 = scanner.nextInt();
        if (num > num2) {
            System.out.println(num + num2);
        } else if (num < num2) {
            System.out.println(num + " " + num2);
        } else {
            System.out.println("Числа равны");
        }
    }
}
