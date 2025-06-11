package Module1.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println();
        int[] number = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            // попробовать вариант с "sout(number[i])" внутри цикла "for"
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
