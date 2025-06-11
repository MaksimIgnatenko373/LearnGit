package Module1.Arrays;

/**
 * Примечание:
 * Логика сравнения содержания двух массивов
 */

/**
 * Примечания №2:
 * уточнить про оператор HashSet!
 */
public class ArrayDeleteElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueNumbers = new int[numbers.length];
        int uniqueCount = 0;

        System.out.println();
        // uniqueNumbers[i] = numbers[i];

        System.out.println();
        System.out.println("Массив без дубликатов: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueNumbers[i]);
        }
    }
}

