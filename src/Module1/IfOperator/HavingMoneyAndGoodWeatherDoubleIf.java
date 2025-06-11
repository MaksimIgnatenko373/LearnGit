package Module1.IfOperator;
// Задание 6. Проверка наличия денег и хорошей погоды с вложенным "if"
public class HavingMoneyAndGoodWeatherDoubleIf {
    public static void main(String[] args) {
        System.out.println( );
        boolean hasMoney = true;
        boolean isSunny = true;
        if (hasMoney) {
            if (hasMoney && isSunny) {
                System.out.println("Иду гулять и покупаю мороженое!");
            } else {
                System.out.println("Покупаю мороженое, но остаюсь дома!");
            }
        } else {
            System.out.println("Остаюсь дома!");
        }
    }
}
// Конец задачи!