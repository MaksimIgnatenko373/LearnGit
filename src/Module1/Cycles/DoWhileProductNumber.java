package Module1.Cycles;
/**
 * Примечание:
 * Моменты:
 * Инициализировать переменную °factorial° путём, добавления статуса ""
 * Оператор вывода в терминал "sout" лучше поместить вне блока "do ... while".
 */

import java.util.Scanner;

public class DoWhileProductNumber {
    static int factorial; // это локальная переменная - лучще её помещать в пределах метода!
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Введите число для вычисления: ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        factorial(num);
        // System.out.println(factorial * );
        // System.out.println(num + "! = " + factorial);
    }
    public static int factorial(int num) {
        System.out.println();
        int i = 1;
        factorial = 1;
        do {
            factorial = factorial * i;
            System.out.println(factorial);
            i++;
        } while (i <= num);
        return (int) factorial;
    }
}
