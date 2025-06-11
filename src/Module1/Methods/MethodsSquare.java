package Module1.Methods;
/**
 * Примечание:
 * Задание № 1 из блока "Задачи без заготовок кода с подсказками"
 * Задание: создать метод "square", который принимает одно целое число и возвращает его квадрат
 */

import java.util.Scanner;

public class MethodsSquare {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(square(scanner.nextInt())); // можно не создавать отдельную переменную для вывода результата через метод, а просто написать метод с переменной "number" в команде для вывода в терминале
    } // не обязательно создавать отдельную переменную для присвоения оператора sc.nextInt(при условии без переиспользования). Можно ... см. в стр. 15

    public static int square (int a) { // "static" пишем, чтобы использовать метод в любом другом классе
        return a * a;
    }
}

/**
 * Примеание:
 * Сначала метод "main" - потом остальные вспомогательные для функционала
 */