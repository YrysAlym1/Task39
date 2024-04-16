import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /**
         * 13. Бир программа жазыныздар, ал программа консольдон 2
         * орундуу сан алыш керек, бир гана if менен текшериш керек сандын
         * 1 оруну жана 2 орунунун кобойтуусу чонбу же сан озубу**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a 2-digit number: ");
        byte b = scanner.nextByte();

        byte r1 = (byte) (b / 10);
        byte r2 = (byte) ( b % 10);

        int result = r1 * r2;

        if (b > result) {
            System.out.println(b + " > " + result );
        } else {
            System.out.println(b + " < " + result);
        }


    }
}
