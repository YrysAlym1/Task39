import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        /**
         * 25. Напишите класс, который читает с клавиатуры символ и
         * проверяет, является ли введенный символ буквой латинского
         * алфавита. По результатам проверки следует вывести на экран
         * соответствующее сообщение**/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')) {
            System.out.println("Введенный символ является буквой латинского алфавита.");
        } else {
            System.out.println("Введенный символ не является буквой латинского алфавита.");
        }



    }
}
