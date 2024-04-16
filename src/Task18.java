import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        /**
         * 18. Бир программа жазыныз, сиз торт орундуу оң сан бериниз, сиз
         * текшеришиниз керек кайсыл орундагы саны чон экен, консольго
         * чыгарышынз мисалы: биринчи сан 25 экинчи сан 35 тен чон, же экоо
         * барабар болсо 25 жана 25 бири бирине барабар деп чыгарасыз. **/
        // Алымбеков Ырыскелди , +996704637863, студент курс программистте окуйм, Бишкек шаары,  Лидерлик жонундо илим алып колдоно баштайм
        Scanner scanner = new Scanner(System.in);
        System.out.println("Торт орундуу сан жазыныз: ");
        int number1 = scanner.nextInt();

        int res1 = number1 / 100;
        int res2 = (number1 % 100);

        if (number1 < 1000 || number1 > 9999) {
            System.out.println("Ошибка!");
        }else {
            if (res1 > res2) {
                System.out.println(res1 + " > " + res2);
            } else if (res1 == res2){
                System.out.println(res1 + " = " + res2);
            }else {
                System.out.println(res1 + " < " + res2);
            }
        }





    }
}
