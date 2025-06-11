package Module1.TheFinalTasks;
// комбинация: "Option" + "Command" + "L" - выправка текста кода
import java.util.Scanner;

public class NotebookVersion2Myself {
    private static String[] names = new String[5];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( );
        while (true){
            System.out.println("1. Добавить имена");
            System.out.println("2. Вывести все имена");
            System.out.println("3. Поменять имя");
            System.out.println("4. Удалить имя");
            System.out.println("5. Выход");
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
        System.out.println("Введите имя: ");
        if (count < names.length){
            String name = scanner.nextLine();
            names[count++] = name;
        } else {
            System.out.println("Массив заполнен. Невозможно добавить новое имя!");
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
        for (int i = 0; i < count; i++) {
            if (names[i].equals(currentName)) {
                names[i] = newName;
                found = true;
                break;
            }
        }
    }
    private static void deleteNames (Scanner scanner) {
        System.out.println("Введите имя, которое нужно удалить: ");
        String nameToDelete = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if(names[i].equals(nameToDelete)){
                found = true;
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[ j + 1];
                }
                names[count-1] = null;
                count--;
                break;
            }
        }
    }
}
