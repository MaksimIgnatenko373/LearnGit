package Module1.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] firstArray = new int[100];
        for (int i = firstArray.length-1; i > 0; i--) {
            if ((i % 2) == 0) {
                firstArray[i] = i;
                System.out.println(firstArray[i]);
            }
        }
    }
}
