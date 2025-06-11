package Module1.Cycles;

import java.util.Scanner;

public class WhileLoopTask {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        System.out.println();
        int number = scanner.nextInt();
        int i = 1;
        System.out.println();
        while (i <= number) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
