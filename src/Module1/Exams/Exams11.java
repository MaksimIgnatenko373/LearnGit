package Module1.Exams;
// Здание
public class Exams11 {
    public static void main(String[] args) {
        int num = 5;
        int[] numbers = new int[num];
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 50);
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[i + 1]) {
                int element = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = element;
                /*numbers[0] = numbers[i];*/
            }
                System.out.println(numbers[i]);
        }
    }
}

