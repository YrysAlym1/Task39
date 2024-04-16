import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        /***
         * 8. Напишите класс, который генерирует случайное положительное
         * двузначное число, а затем генерирует три целых положительных
         * числа, меньших первого.*/

        Random random = new Random();
        int ranNumber = random.nextInt(10,99);
        int ranNum1 = random.nextInt(ranNumber);
        int ranNum2 = random.nextInt(ranNumber);
        int ranNum3 = random.nextInt(ranNumber);

        System.out.println(" Рандом сан : " + ranNumber);
        System.out.println("Рандом сан 1 : " + ranNum1);
        System.out.println("Рандом сан 2 : " + ranNum2);
        System.out.println("Рандом сан 3 : " + ranNum3);
    }
}
