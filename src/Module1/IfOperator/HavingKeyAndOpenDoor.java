package Module1.IfOperator;
// Задание 5. Проверка наличия ключей (И!) открытой двери
public class HavingKeyAndOpenDoor {
    public static void main(String[] args) {
        System.out.println();
        boolean hasKey = true;
        boolean isOpenDoor = true;
        if (hasKey && isOpenDoor) { // Прописываем оператор "if" для построения условия и логический оператор "&&", согласно формулировке задания (обращайте внимание на формулировку названия задания, т.к. о неё зависит её решения)
            System.out.println("Вхожу в дом!"); // Выводим варианта полученного результата. Вариант №1.
        } else { // о роли оператора "else" нужно уточнить
            System.out.println("Не могу войти в дом!"); // Вариант №2.
        }
    }
}
// Конец задачи!


