package Module1.Arrays;

public class ArraysReverseOrder {
    public static void main(String[] args) {
        System.out.println();
        int[] numbers = {1,2,3,4,5};
        System.out.println("Элементы массива в обратном порядке: ");
        System.out.println();
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
