package Module1.Cycles;

import java.util.Scanner;

public class ForLoopTask {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        System.out.println();
        int number = scanner.nextInt();
        System.out.println();
        for (int i = 1; i <= number ; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
