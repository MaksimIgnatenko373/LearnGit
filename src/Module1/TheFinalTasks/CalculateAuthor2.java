package Module1.TheFinalTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CalculateAuthor2 {
    private static int[] num = new int[100];
    private static int[] numAdd = new int[3];
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Вывести все числа в массиве");
            System.out.println("2. Выполнить операцию сложения чисел");
            System.out.println("3. Выполнить операцию вычитания чисел");
            System.out.println("4. Выполнить операцию умножения чисел");
            System.out.println("5. Выполнить операцию деления чисел");
            System.out.println("6. Очистить все числа из массива");
            System.out.println();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printAllNumbers();
                    break;
                case 2:
                    sumAllNumbers();
                    break;
            }

        }
    }

    private static void printAllNumbers() {
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.print(num[i] + " ");
        }
    }

    private static void sumAllNumbers() {
        int num1 = (int) (Math.random());
        int num2 = (int) (Math.random());
        for (int i = 0; i < num.length; i++) {
            if (num1 == num[i]) { // Предварительно: необходимо провести сравнение
                int sum = num1 + num2;
            }
        }
    }
}
