import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        /**
         * 26. Напишите класс, который принимает с клавиатуры два
         * строковых значения, каждое из которых содержит имя человека, и
         * проверяет, являются ли эти люди тезками. По результатам
         * проверки следует вывести на экран соответствующее сообщение.**/

        Scanner scanner = new Scanner(System.in);
        System.out.println("напишите имя: ");
        String name1 = scanner.nextLine();
        System.out.println("напишите имя: ");
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println(name1 + " тезки " + name2);
        }else {
            System.out.println(name1 + " не тезки " + name2);
        }

    }
}
