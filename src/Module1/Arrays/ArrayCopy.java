package Module1.Arrays;
/**
 * Задача № 5 из блока "Задачи без заготовок кода с подсказками"
 * Задача : написать программу, создающую копию массива
 *
 */
public class ArrayCopy {
    public static void main(String[] args) {
        System.out.println();
        /*int[] arr = {1, 2, 3, 4, 5};*/
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random()*99);
            System.out.println(arr[i]);
        }
        System.out.println();
        int[] specialArray = new int [arr.length]; // инициализируем создание массива с аналогичным размером первого массива
        for (int i = 0; i < specialArray.length; i++) { // прописываем цикл "for" для прохода по массиву
            specialArray[i] = arr[i]; // присваиваем состав первого массива "arr" массиву "specialArray"
            System.out.println(specialArray[i]); // вывод состава массива в терминал
        }
    }
}

/**
 * Примечание.
 * Посмотреть GitHUB. Выгрузить коды. С проектом "поиграть".
 *
 */