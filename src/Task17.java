import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /**
         * 17. Напишите программу, который принимает с клавиатуры два
         * числа: первое - количество учеников в классе, второе - количество
         * стульев в классной комнате. Программа проверит соответствие
         * между этими двумя значениями и выведет на экран
         * соответствующую информацию (например, для значений
         * 35 и 39 на экран выводится 4 стула лишних).**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Students: ");
        int students = scanner.nextInt();
        System.out.println("Number of Chair: ");
        int chair = scanner.nextInt();

        if (students > chair) {
            int res1 = students - chair;
            System.out.println(res1 + " стулья не хватает");
        } else if (students < chair) {
            int res2 = chair - students;
            System.out.println(res2 + " стулья лишних");
        } else {
            System.out.println("все хватает четко!");
        }


    }
}
