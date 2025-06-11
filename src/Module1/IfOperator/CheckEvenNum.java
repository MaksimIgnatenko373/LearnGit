package Module1.IfOperator;
// Задание 2. Проверка чётного числа.
import java.util.Scanner;

public class CheckEvenNum {
    public static void main(String[] args) {
        System.out.println( );
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if ((num % 2) == 0) {
            System.out.println("Число чётное!");
        } else {
            System.out.println("Число нечётное!");
        }
    }
}
// Конец задачи!
