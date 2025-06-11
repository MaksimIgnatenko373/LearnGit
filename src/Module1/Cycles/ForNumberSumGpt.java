package Module1.Cycles;

import java.util.Scanner;

public class ForNumberSumGpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число: ");
        System.out.println();
        int number = scanner.nextInt();
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = i + sum; // sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
    }
// уточнить почему не удалась моя версия по работе. "Почему не работает?"
}
