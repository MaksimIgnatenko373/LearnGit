package Module1.Cycles;

import java.util.Scanner;

public class WhileEvenNumber {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println();
        int i = 1;
        while (i < num) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
