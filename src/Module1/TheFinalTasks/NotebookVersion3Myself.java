package Module1.TheFinalTasks;

import java.util.Scanner;

public class NotebookVersion3Myself {

    private static String[] names = new String[5];
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Добавить имя");
            System.out.println("2.Вывести все имена");
            System.out.println("3.Поменять имя");
            System.out.println("4.Удалить имя");
            System.out.println("5.Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addNames(scanner);
                    break;
                case 2:
                    printAllNames(scanner);
                    break;
                case 3:
                    changeNames(scanner);
                    break;
                case 4:
                    deleteNames(scanner);
                    break;
                case 5:
                    System.out.println("Программа завершена! Всего хорошего!!! :)");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова!");

            }
        }
    }

    private static void addNames(Scanner scanner) {
        System.out.println("Введите имя!");
        if(count < names.length){
           String name = scanner.nextLine();
            names[count++] = name;

        } else {
            System.out.println("Массив заполнен! Добавление имени более невозможно!");
        }
    }

    private static void printAllNames(Scanner scanner) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    private static void changeNames(Scanner scanner) {
        System.out.println("Введите текущее имя: ");
        String currentName = scanner.nextLine();
        System.out.println("Введите новое имя: ");
        String newName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(currentName)) {
                names[i] = newName;
                found = true;
                break;
            }
        }
    }

    private static void deleteNames(Scanner scanner) {
        System.out.println("Введите имя, которое нужно удалить: ");
        String nameToDelete = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameToDelete)) {
                found = true;
                for (int j = i; j < names.length - 1; j++) {
                    names[i] = names[j + 1];
                }
                names[count - 1] = null;
                count--;
                break;
            }
        }
        if (!found) {
            System.out.println("Имя не найдено!");
        }
    }
}
