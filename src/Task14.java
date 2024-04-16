import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        /****
         * 14. Бир программа жазыныз, сиз клавиатурадан эки сан беришиниз
         * керек, биринчи сан окуучулардын саны, экинчи отургучтардын саны.
         * Сиздер текшеришиниздер керек окуучуларга орун жетеби же
         * жетпейби.
         * Мисалы
         * Input: 25 30
         * Output: “Отургучтардын саны окуучулардан коп экен”
         * жана “Отургучтар жетет экен” , “Отургучтар жетпей калат деген”
         * варианттар болот.****/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number of Students: ");
        int numOfStudents = scanner.nextInt();
        System.out.println("Write number of Chair: ");
        int numOfChair = scanner.nextInt();

        if (numOfStudents < numOfChair) {
            System.out.println("Отургучтардын саны окуучулардан коп экен");
        } else if (numOfStudents > numOfChair) {
            System.out.println("Отургучтар жетпей калат экен");
        } else {
            System.out.println("Отургучтар жетет экен");
        }
    }
}
