package Module1.ComparisonOperators;
import java.util.Scanner;
// Задание 5. Проверка на совершеннолетие человека - ("Является ли человек совершеннолетний?")
public class NumberComparisons5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in); // Для такого рода задания предлагается ввести специальный оператор "Scanner" для ввода текущего возраста человека в терминале
        int a = 18; // Такая переменная будет использована в качестве предмета сравнения с текущим возарстом человека18
        int currentAge = scanner.nextInt();
        System.out.println( );
        if (currentAge >= a) {
            System.out.println("Человек - совершеннолетний!");
        } else {
            System.out.println("Человек - несовершеннолетний!");
        }
    }
}
// Конец задачи!
