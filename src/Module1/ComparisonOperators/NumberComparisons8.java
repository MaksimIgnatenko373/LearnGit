package Module1.ComparisonOperators;

import java.util.Scanner;

public class NumberComparisons8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Число - отрицательное!");
        } else {
            System.out.println("Число - положительное!");
        }
    }
}
// Конец задачи!