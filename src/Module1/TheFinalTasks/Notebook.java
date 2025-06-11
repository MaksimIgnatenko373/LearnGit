package Module1.TheFinalTasks;
// int[] myArray = new int[10] - рекомендация с прошлого занятия с Женей (14.02)

import java.util.Scanner;

public class Notebook {
   public static String[] names = new String[3];
//    private static String[] names = new String[]{"Иван", "Пётр", "Сергей"};
    private static int count = 0;

    // Метод для вывода всех имён

    // String[] names = {"Иван", "Пётр", "Сергей"}; может здесь быть инициализация
    public static void main(String[] args) {
        String[] names = new String[10];
        Scanner scanner = new Scanner(System.in);

        // Основной цикл программы
        while (true) {
            System.out.println("Меню");
            System.out.println("1. Вывести все имена");
            System.out.println("2. Добавить имя");
            System.out.println("3. Изменить имя");
            System.out.println("4. Удалисть имя");
            System.out.println("5. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            switch (choice) {
                case 1:
                    printAllNames();
                    break;
                case 2:
                    addName();
                    break;
                case 3:
                    changeName();
                    break;
                case 4:
                    deleteName();
                    break;
                case 5:
                    exitTheProgram();
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }


    private static void printAllNames() { // уточнить по поводу аргумента у метода!
        String[] names = {"Иван", "Пётр", "Сергей"};
        for (int i = 0; i < names.length; i++) { // или лучше использовать такую форму "for" (String n : names)?
            System.out.println(names[i]);
        }
    }
    // Метод для добавления имени


    private static void addName() {
        if (count < names.length) {
            Scanner scanner = new Scanner(System.in);
            String names = scanner.nextLine(); // запрос имени у пользователя с помощью scanner.nextLine
            // System.out.println("Введите имя: " + names);
            // array[names++] = item;
            count++; // строкой выше  - эксперимент
            } else {
            System.out.println("Массив заполнен. Невозможно добавить новое имя.");
        }
    }

    private static void changeName() {
        
    }

    private static void deleteName() {

    }

    private static void exitTheProgram() {

    }

}
