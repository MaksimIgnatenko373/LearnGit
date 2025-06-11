package Module1.Methods;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Примечание:
 * Задание № 7 из блока "Задачи без заготовок кода с подсказками"
 * Задание: создать метод "isNumeric", который принимает строку и возвращает
 * true, если строка представляет собой число, и false в противном
 * случае.
 */
public class MethodsIsNumeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите содержимое текста в терминал: ");
        System.out.println();
        System.out.println(isContains(scanner.nextLine()));
    }

    public static boolean isNumeric(String str) {
        /*int a = Integer.parseInt();*/
        char[] charText = str.toCharArray();
        for (int i = 0; i < charText.length; i++) {
            if (Character.isDigit(charText[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isContains(String str) {
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
// ".*\\d.*" - регулярное выражение. Посмотреть что это. Надо понимать! Для работы со строками для нахождения конкретных символов
// Pattern and Matcher! -
// Посмотреть про "регулярные выражения"!