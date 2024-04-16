import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /**
         * 21. Напишите класс, который принимает с клавиатуры
         * положительное целое число и выводит на экран ближайшее к нему
         * «крутлое число».
         * Например, для введенного значения 433 выводится на экран 430, а
         * для 56 выводится 60.**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сан жазыныз: ");
        int number = scanner.nextInt();

        int remainder = number % 10;

        int roundNumber;
        if (remainder <= 5) {
            roundNumber = number - remainder;
        }else {
            roundNumber = number - remainder + 10;
        }
        System.out.println(roundNumber);
    }
}
