package Module1.Exams;

import java.util.Arrays;

public class Exam10 {
    public static void main(String[] args) {
        System.out.println();
        int a = 5;
        int[] numbers = new int[a];
        for (int i = numbers.length - 1; i > 0; i--) {

            numbers[i] = (int) (Math.random() * 1000);
            System.out.println(Arrays.toString(numbers));
        }
    }
}
// Задача со * - сортировать по возрастанию и убыванию!!!