package Module1.Arrays;

public class ArrayDeleteElementsTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueNumbers = new int[numbers.length];
        int uniqueCount = 0;
        System.out.println();
//        for (int i : numbers){ // Комб-ция клавиш : "Shift" + "control" + "/ - ?" - построчное комментирование
//            System.out.println(i);
//        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
