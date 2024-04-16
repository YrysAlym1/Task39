import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        /**
         * 20. Напишите программу , которая принимает с клавиатуры
         * трехзначное положительное число и проверяет, содержится ли в
         * нем хотя бы один ноль. По результатам проверки надо вывести
         * количество нулей в числе.**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("уч орундуу сан жазыныз: ");
        int number = scanner.nextInt();

        int i = 0;


        // while

//        while (number > 0) {  // true
//
//            int res = number % 10;
//            if (res == 0) {
//                i++;
//            }
//            number /= 10;
//        }
//
//        if (i > 0) {
//            System.out.println("число содержит " + i + " нулей");
//        } else {
//            System.out.println("Число не содержит нулей");
//        }


        // for
        for (;number > 0;  number /= 10) {
            int res = number % 10;
            if (res == 0) {
                i++;
            }
        }
        if (i > 0) {
            System.out.println("число содержит " + i + " нулей");
        } else {
            System.out.println("Число не содержит нулей");
        }


    }
}
