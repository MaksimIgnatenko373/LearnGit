package Module1.Examples;

public class PracticeArrays {
    public static void main(String[] args) {
        // первый массив с определённым порядком элементов
        int n = 10;
        int[] firstArray = new int[n];
        System.out.println();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
            System.out.println(firstArray[i]);
        }
        /**
         // второй массив со случайным порядком ("рандонмым") элементов
         System.out.println();
         int a = 30;
         int[] secondArray = new int[a];
         for (int i = 0; i < secondArray.length; i++) {
         secondArray[i] = (int) (Math.random() * 30);
         System.out.println(secondArray[i]);
         }
         }
         **/

    }
}
