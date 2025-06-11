package Module1.Cycles;
/**
 * Принцип
 * 1 + 0 = 1
 * 2 + 1 = 3
 * 3 + 3 = 6
 * 4 + 6 = 10
 * 5 + 10 = 15
 * <p>
 * Ещё вспомнить про корзину с яблоками
 */

import java.util.Scanner;

import static Module1.Cycles.DoWhileProductNumber.factorial;

public class ForNumberSum {
    static int sum;

    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        System.out.println();
        System.out.println("Введите число для вычисления суммы: ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println();
        for (int i = 1; i <= num; i++) {
            sum = i;
            sum2 = i + sum;
            sum3 = sum2 + sum;
            System.out.println(sum + " + " + sum2 + " = " + sum3);
            factorial = 4;
            // "sum + " " + sum2" вывод чисел цикла в два ряда
        }
//        System.out.println("Сумма всех чисел от 1 до " + num + " = " + sum);
    }
}
