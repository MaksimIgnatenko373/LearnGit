package Module1.TheFinalTasks;
// Комбинация "command + D" - дублирование настоящей строки (по расположению курсора)
// Почитать про exception - исключения в Java. Обработка исключений...
import java.util.Scanner;

public class CalculateAuthor {
    private static int[] nums = new int[4];
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(); // через систему printf - необходимо
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Вывести все числа в массиве");
            System.out.println("2. Выполнить операция сложения чисел");
            System.out.println("3. Выполнить операция вычитания чисел");
            System.out.println("4. Выполнить операция умножения чисел");
            System.out.println("5. Выполнить операция деления чисел");
            System.out.println("6. Выполнить очищение чисел массива");
            System.out.println();
            int choice = scanner.nextInt();
            // scanner.nextLine(); - надо посмотреть отсутствие!
            switch (choice){
                case 1:
                    printAllNumbers();
                    break;
                case 2:
                    sumAllNumbers(scanner);
                    break;
                case 3:
                    subtractAllNumbers(scanner);
                    break;
                case 4:
                    multiplyAllNumbers(scanner);
                    break;
                case 5:
                    divideAllNumbers(scanner);
                    break;
                case 6:
                    cleanAllNumbers();
                    break;
                case 7:
                    System.out.println("Программа завершена!");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова!");
            }
        }
    }

    private static void printAllNumbers() {
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }

    private static void sumAllNumbers(Scanner scanner) { //
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        nums[count] = sum;
        count++;
    }
    private static void subtractAllNumbers(Scanner scanner) { //
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int diff = num1 - num2; // уточнить по расположеню переменных для операции!
        nums[count++] = diff;
        // count++;
    }
    private static void multiplyAllNumbers(Scanner scanner) {
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        nums[count++] = product; // На заметку : по английски произведение - "product"
    }
    private static void divideAllNumbers(Scanner scanner) {
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int quotient = num1 / num2; // также уточнить вопрос по расположению пересенных по местам для вычисления остатка!
        nums[count++] = quotient;

    }
    private static void cleanAllNumbers() {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
            // уточнить по варианту "nums[i] = null;"
            // команда null относится к объектам, а не к значениям!!!
            // примитивные
        }
        count = 0;
    }
}
