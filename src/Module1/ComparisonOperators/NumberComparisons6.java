package Module1.ComparisonOperators;

import java.util.Scanner;

// Задание 6. Проверка на чётность числа ("Является ли число чётным?")
public class NumberComparisons6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println( );
        if ((num % 2) == 0){
            System.out.println("Число - чётное!");
        } else {
            System.out.println("Число - нечётное!");
        }
    }
}
// Конец задачи!