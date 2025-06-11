package Module1.Arrays;

import java.util.Arrays;

/**
 * Задача № 2 из блока "Задачи без заготовок кода с подсказками"
 * Задача : написать программу, вычисляемую количество чётных / нечётных элементов массива
 */
public class ArrayEvenNumbers {

    public static void main(String[] args) {
        int even = 0;
        int even1 = 0;
        System.out.println();
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                even ++;
            } else {
//                System.out.println(arr[i]);
                even1 ++;
            }
        }
        System.out.println();
        System.out.println("Количество чётных чисел внутри массива = " + even);
        System.out.println();
        System.out.println("Количество нечётных чисел внутри массива = " + even1);
        System.out.println();
        System.out.println(Arrays.toString(arr)); // Это выывод массива целиком, как на поле для кода
    }
}
/*
Примечание по решенеию:
через размер массива
+ рандомный порядок массива
 */