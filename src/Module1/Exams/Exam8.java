package Module1.Exams;
// Ввожу положительное число и получаю список чисел диапозоном от 1 до введённого числа
// Добавить, чтобы не принимал числа < 1 и программа выполнялась бесконечно. Чтобы не надо было

import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println();
        while (true) {
        System.out.println("Введите число больше 1 : ");
            num = scanner.nextInt();
            if (num <= 1) {
                System.out.println("Неверное число: " + num);
            } else {
                int i = 0;
                for (int j = 1; j <= num; j++) {
                    System.out.println(j);
                }
                System.out.println("Введите число снова");
            }
        }
    }
}

