import java.util.Random;

public class Task27 {
    public static void main(String[] args) {
        /**
         * 27. Напишите класс, который генерирует и выводит на экран
         * случайное целое чисел из диапазона положительных двузначных
         * чисел.**/


        Random random = new Random();
        int ranNumber = random.nextInt(10,99);
        System.out.println(ranNumber);
    }
}
