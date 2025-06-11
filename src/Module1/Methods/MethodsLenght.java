package Module1.Methods;

import java.util.Scanner;

/**
 * Примечание:
 * Задание № 3 из блока "Задачи без заготовок кода с подсказками"
 * Задание: создать метод "lenght", который принимает строку и возвращает её
 * длину.
 */
public class MethodsLenght {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите строку в терминал: ");
        System.out.println();
        String result = scanner.nextLine();
        System.out.println(result.length());
        System.out.println();
    }
    
    /*public static int length(String str) { // сплева - то что метод возвращает, справа - то, что передаётся в метод -> типы могут не совпадать
        int quantity = 0;
        char[] charWord = str.toCharArray();
        for (int i = 0; i < charWord.length; i++) {
            quantity++;
        }
        return quantity;
    }
// Второй вариант кода метода (упрощённый)
    public static int length2 (String str){
        return str.length();
    }*/
}
