package Module1.Cycles;

public class ForDoubleMultiplicationTable {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.printf(product + " ");
            }
            System.out.println(); // " " (с оператором вывода в терминал) - перенос на строчку вниз текста. Необязательно содержание внутри скокбок у оператора вывода.
        } // поискать в интернете способ вывода таблицы в терминале ровным порядком. Подсказка: пользуемся оператором "printf" и прописать в кургл. скобках
        // "i + "*" + j + "=" +" - это к выводу
    }
}

