import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /**
         * 12. Трехзначное положительное число называется «четно красивым», если каждая из его цифр - четная. Напишите класс,
         * который принимает с клавиатуры трехзначное число и проверяет,
         * является ли оно «четнокрасивым». В соответствии с результатом
         * проверки надо вывести на экран соответствующее текстовое
         * сообщение. Обратите внимание: задание имеет решение с
         * использованием одного оператора if и без составного условия!**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("write a three-digit number: ");
        short s = scanner.nextShort();

        int r1 = s / 100;
        int r2 = (s / 10) % 10;
        int r3 = s % 10;

        if (r1 % 2 == 0 && r2 % 2 == 0 && r3 % 2 == 0) {
            System.out.println(s + " четнокрасивый число!");
        }else {
            System.out.println(s);
        }

    }
}
