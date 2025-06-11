package Module1.TheFinalTasks;
    import java.util.Scanner;

public class NotebookGpt {
        private static String[] names = new String[5]; // Объявите массив типа String для хранения имен
        private static int count = 0;

        public static void main(String[] args) {
            System.out.println( );
            Scanner scanner = new Scanner(System.in);
            // Основной цикл программы
            while (true) {
                // Вывод меню
                System.out.println("1. Вывести все имена");
                System.out.println("2. Добавить имя");
                System.out.println("3. Переименовать имя");
                System.out.println("4. Удалить имя");
                System.out.println("5. Выход");
                // Чтение выбора пользователя
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после ввода числа
                // Обработка выбора пользователя
                switch (choice) {
                    case 1:
                        printAllNames(scanner);
                        break;
                    case 2:
                        addName(scanner);
                        break;
                    case 3:
                        changeName(scanner);
                        break;
                    case 4:
                        deleteName(scanner);
                        break;
                    case 5:
                        System.out.println("Программа завершена.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        }
    // Частю нижк начинается блок с методами для работы "программы"
        // Метод для вывода всех имен
        private static void printAllNames(Scanner scanner) {
            for (int i = 0; i < count; i++) { // использование цикла "for" для прохода по массиву, с учётом того факта, что i < count (для исключения выводв результата "null")
                System.out.println(names[i]); // вывод результата
            }
        }

        // Метод для добавления имени
        private static void addName(Scanner scanner) { // в сигнатуре метода для того, чтобы не объявлять каждый раз оператор "Scanner"
            if (count < names.length) {
                System.out.println("Введите имя:"); // вывод в терминал текста с запросом на ввод имени (в случае создания списка - нового имени).
                String name = scanner.nextLine(); // присваиваем "scanner.nextLine()" к типу переменной "name" типа String.
                names[count] = name; // тут добаляем в массив "name" по индексу "count"
                count++; //данная команда (увеличиваем счётчик на 1 единицу) позволяет заполнять массив постепенно элементом за элементом
            } else { // здесь пишем альтернативный вариант через оператор "else" в противовес оператору if, если что-то пойдёт не так
                System.out.println("Массив заполнен. Невозможно добавить новое имя.");
            }
        }

        // Метод для переименования имени
        private static void changeName(Scanner scanner) {
            System.out.println("Введите текущее имя:"); // вывод в терминал текста с запросом на ввод имени (того имени, которое вводили при выполнении пункта выбора 2 при создании списка с именами)
            String currentName = scanner.nextLine(); // присваиваем "scanner.nextLine()" к типу переменной "currentName" типа String. Сначала вводим в терминал то, что у нас есть в списке с именами.
            System.out.println("Введите новое имя:"); // вывод в терминал текста с запросом на ввод имени (того имени, которое вводили при выполнении пункта выбора 2 при создании списка с именами)
            String newName = scanner.nextLine(); // присваиваем "scanner.nextLine()" к типу переменной "newName" типа String.Затем вводим другое имя, на замену старому.
            boolean found = false; // здесь прописывем используя тип переменной "boolean"
            for (int i = 0; i < count; i++) {
                if (names[i].equals(currentName)) {
                    names[i] = newName;
                    found = true;
                    break; // команда прерывания действия метода
                }
            }
            if (!found) {
                System.out.println("Имя не найдено.");
            }
        } // стоит отметить, что териминале следует соблюдать чёткую пропись имени (ЖЕЛАТЕЛЬНО БЕЗ ПРОБЕЛОВ!!!). От этого завист дальнейшая работа с выбором вариантов

        // Метод для удаления имени
        private static void deleteName(Scanner scanner) {
            System.out.println("Введите имя, которое нужно удалить: ");
            String nameToDelete = scanner.nextLine();
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (names[i].equals(nameToDelete)) {
                    found = true;
                    for (int j = i; j < count - 1; j++) {
                        names[j] = names[j + 1];
                    }
                    names[count - 1] = null;
                    count--;
                    break;
                }
            }
            if (!found) {
                System.out.println("Имя не найдено.");
            }
        }
}
