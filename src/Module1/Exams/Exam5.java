package Module1.Exams;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Число num - положительное!");
        } else if (num < 0) {
            System.out.println("Число num - отрицательное!");
        } else {
            System.out.println("Число num = 0!");
        }
    }
}
