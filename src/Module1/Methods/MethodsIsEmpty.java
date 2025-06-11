package Module1.Methods;
/**
 * Примечание:
 * Задание № 2 из блока "Задачи без заготовок кода с подсказками"
 * Задание: создать метод "isEmpty", который который принимает строку и возвращает
 * true, если строка пустая, и false в противном случае
 */
public class MethodsIsEmpty {
    public static void main(String[] args) {
        System.out.println();
        boolean result = isEmpty("");
        System.out.println("Является ли строка пустой: " + result);
    }

    public static boolean isEmpty(String str) {
        str.isEmpty();
        if (str.equals("")) {
            return true;
        }
        return false;
    }
}