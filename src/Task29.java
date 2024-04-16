import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        /***
         * 29. Напишите программу, сиз консольдон эки маани алышыныз
         * керек рандом учун, биринчи сан нижний диапазон, экинчи сан
         * верхний диапазон, рандом сан бир санды генерация кылат.
         * Сиз консольдон бир сан киргизишиниз керек, эгерде сиз жазган сан
         * менен рандом сан барабар болсо, окуучу тапты деген нерсени
         * чыгарышыныз керек, болбосо окуучу таппады деген жазуу*/

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("нижний диапазон: ");
        int num1 = scanner.nextInt();
        System.out.println("верхний диапазон: ");
        int num2 = scanner.nextInt();

        int ran1 = random.nextInt(num1 , num2);
        System.out.println("Сан жазыныз: ");
        int ran3 = scanner.nextInt();

        if (ran1 == ran3) {
            System.out.println(ran1 + " Окуучу тапты " + ran3);
        }else {
            System.out.println(ran1 + " Окуучу таппады " + ran3);
        }


    }
}
