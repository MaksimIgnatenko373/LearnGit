package Module1.Arrays;

public class ArrayMaxElement {
    public static void main(String[] args) {
        /*int[] numbers = {1, 2, 3, 4, 5};*/
        int n = 5;
        int [] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*99);
            System.out.println(numbers[i]);
        }
        System.out.println();
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max <= numbers[i]) { // рефактор переменной - меняет название переменной во всех местах (Shift + F6 - Windows). Комбинация на Maс (fn + Shift + F6).
                max = numbers[i]; // В условиях "if" важна постановка переменных при сравнений!!! if (max <= numbers[i]) или if (numbers[i] > max)
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: " + max);
    }
}
