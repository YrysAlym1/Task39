import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

        /**
         * 19. Трехзначное число называется «дважды четным», если и оно
         * само, и сумма его цифр - четные.
         * Напишите класс, который принимает с клавиатуры трехзначное
         * положительное число и проверяет, является ли оно «дважды
         * четным». В соответствии с результатом проверки надо вывести на
         * экран соответствующее
         * текстовое сообщение.**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("уч орундуу сан жазыныз: ");
        int number = scanner.nextInt();
        int res1 = number / 100;
        int res2 = (number / 10) % 10;
        int res3 = number % 10;

        int result = res1 + res2 + res3;

        if (number % 2 == 0 && result % 2 == 0) {
            System.out.println("дважды четный");
        }else {
            System.out.println("не четный");
        }
    }
}
