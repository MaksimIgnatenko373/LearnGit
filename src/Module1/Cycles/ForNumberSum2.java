package Module1.Cycles;

import java.util.Scanner;

public class ForNumberSum2 {
    static int sum;
    public static void main(String[] args) {
//        int sum2 = 0;
//        System.out.println();
//        System.out.println("Введите число для вычисления суммы: ");
//        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println();
//        for (int i = 1; i <= num; i++) {
//            sum = i + i;
//            System.out.println(sum);
//            for (int j = 1; j <= num ; j++) {
//                sum = i + sum;
//                System.out.println(sum);
//
//            }
//        }
//        System.out.println("Сумма всех чисел от 1 до " + num + " = " + sum2);
        int num = 10;
        for (int i = 0; i < 5; i++) {
            sum = i + num;
            System.out.println();
            System.out.println(sum);
        }
    }
}
