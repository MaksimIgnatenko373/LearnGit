package Module1.ArithmeticOperations;
// Задание 2 по теме "Арифметические операции"
public class IncrementDecrement {

    /** Справочный материал:
     * 1. Инкремент (++): Увеличивает значение переменной на 1.
     * 2. Декремент (--): Уменьшает значение переменной на 1.
     * 3. Префиксный инкремент (++a): Увеличивает значение переменной на 1 до использования.
     * 4. Префиксный декремент (--b): Уменьшает значение переменной на 1 до использования.
     * Различия "постфикса" и "Префикса":
     * "Постфикс" -
     * "Префикс" -
     */
    public static void main(String[] args) {
        // Шаг 1. Ввводим переменные данные перед проведением арифметических операций и присваиваем значения этим переменным с указанием типа переменных
        int a = 5; // значения переменной "a" типа "int" = число 5
        int b = 10; // значения переменной "b" типа "int" = число 10
        // Ниже приведён вывод результатов по значениям переменных данных (по желанию!)
        System.out.println("Переменная a: " + a); // покажет, что у переменной "a" значение = 5
        System.out.println("Переменная b: " + b); // покажет, что у переменной "b" значение = 10
        System.out.println(  ); // специальный код с командой для пробела в просмотре в консоле с результатами (см. после нажатия кнопки "Run")
        // Шаг 2. Приступаем к выполнению арифметических операции следующих типов
        // Постфиксный инкремент
        int postIncrement = a++; // Прописываем операцию по инкременту (постфиксному - знаки "+" расположены после знака переменной "a")
        System.out.println("Постфиксный инкремент: " + postIncrement); // Укзываем в выводе в консоль переменную "postIncrement".На этом этапе результат покажет тот же, что и при присвоении значения переменной "a"
        System.out.println("После инкремента: " + a); // Здесь указываем изменённую переменную "a". Тут результат будет на 1 (единицу) выше от исходного значения переменной "a"
        // Постфиксный декремент
        int postDecrement = b--; // Прописываем операцию по декременту (аналогично см. строку № 17)
        System.out.println("Постфиксный декремент: " + postDecrement); // Укзываем в выводе в консоль переменную "postDecrement".На этом этапе результат покажет тот же, что и при присвоении значения переменной "b"
        System.out.println("После декремента: " + b); // Здесь указываем изменённую переменную "b". Тут результат будет на 1 (единицу) ниже от исходного значения переменной "b"
        // Префиксный инкремент
        int preIncrement = ++a; // Прописываем операцию по инкременту (префиксному - знаки "+" расположены перед знаком переменной "a")
        System.out.println("Префиксный инкремент: " + preIncrement); // Будет результат на 2 единицы выше от исходного значения переменной "a"
        // Префиксный декремент
        int preDecrement = --b; // Прописываем операцию по декременту (аналогично см. строку № 25)
        System.out.println("Префиксный декремент: " + preDecrement); // Будет результат на 2 единицы ниже от исходного значения переменной "b"
    }
}
// Конец задачи!
