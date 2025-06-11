package Module1.Methods;
/**
 * Примечание:
 * Задание № 4 из блока "Задачи без заготовок кода с подсказками"
 * Задание: создать метод "isPositive", который принимает целое число и
 * возвращает true, если число положительное, и false в противном
 * случае.
 */
import java.util.Scanner;

public class MethodsIsPositive {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Введите число Вашего запроса: "); // в терминале появится текст с просьбой пользователю о вводе числа для проверки
        Scanner scanner = new Scanner(System.in); // оператор "Scanner" для числа, которое ведёт пользователь
        System.out.println();
        System.out.println(isPositive(scanner.nextInt())); //
        System.out.println();
    }

    public static boolean isPositive (int n){
        if (n > 0){
            return true;
        } else {
            return false;
        }
    }
}
