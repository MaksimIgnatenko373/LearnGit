package Module1.IfOperator;
// Задание 4. Проверка наличия денег (ИЛИ!) хорошей погоды.
public class HavingMoneyOrGoodWeather {
    public static void main(String[] args) {
        System.out.println( );
        boolean hasMoney = true;
        boolean isSunny = false;
        if (hasMoney || isSunny) {
            System.out.println("Иду гулять!");
        } else {
            System.out.println("Остаюсь дома :( !");
        }
    }
}
// Конец задачи!
