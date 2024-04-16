import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        /**
         * 23. Напишите класс, который принимает с клавиатуры целое число,
         * которое должно означать порядковый номер месяца. В случае если
         * полученное
         * значение действительно соответствует порядковому номеру
         * одного из месяцев, следует вывести сезон (лето, осень, зима,
         * весна), к которому относится месяц.
         * В случае если введенное значение не является порядковым
         * номером месяца, следует вывести на экран соответствующее
         * текстовое сообщение.**/

        // do while
//        Scanner scanner = new Scanner(System.in);
//
//        int numberOfMonth;
//
//        do {
//            System.out.println("Write number of month: ");
//            numberOfMonth = scanner.nextInt();
//            switch (numberOfMonth) {
//                case 1, 2, 12:
//                    System.out.println("Winter!");
//                    break;
//                case 3, 4, 5:
//                    System.out.println("Spring!");
//                    break;
//                case 6, 7, 8:
//                    System.out.println("Summer!");
//                    break;
//                case 9, 10, 11:
//                    System.out.println("Autumn!");
//                    break;
//                default:
//                    System.out.println("мындай ай жок!");
//                    break;
//            }
//
//        } while (numberOfMonth != 0);



        // for
        for (int i = 0; true; i++) {

            Scanner scanner = new Scanner(System.in);
//
        int numberOfMonth;


            System.out.println("Write number of month: ");
            numberOfMonth = scanner.nextInt();
            switch (numberOfMonth) {
                case 1, 2, 12:
                    System.out.println("Winter!");
                    break;
                case 3, 4, 5:
                    System.out.println("Spring!");
                    break;
                case 6, 7, 8:
                    System.out.println("Summer!");
                    break;
                case 9, 10, 11:
                    System.out.println("Autumn!");
                    break;
                default:
                    System.out.println("мындай ай жок!");
                    break;
            }
            if (numberOfMonth == 0) {
                break;
            }
        }



    }
}
