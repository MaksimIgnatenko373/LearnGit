package Module1.Methods;
/**
 * Примечание:
 * Задание № 5 из блока "Задачи без заготовок кода с подсказками"
 * Задание: создать метод "max", который принимает два целых числа и
 * возвращает наибольшее из них.
 */
import java.util.Scanner;

public class MethodsMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите первое число: "); // выводим в терминал текст с предложением пользователю о вводе первого числа
        int a = scanner.nextInt(); // переменная для числа "a" для операции сравнения чисел с присвоением к ней оператора "scanner"
        System.out.println();
        System.out.println("Введите второе число: "); // выводим в терминал текст с предложением пользователю о вводе второго числа
        int b = scanner.nextInt(); // переменная для числа "b" для операции сравнения чисел с присвоением к ней оператора "scanner"
        System.out.println();
        System.out.println(max(a,b)); // вывод в терминал возвращаемого результата метода "max" с аргументами метода "a" и "b" типа "int"
    }
    public static int max (int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }

    }
}
