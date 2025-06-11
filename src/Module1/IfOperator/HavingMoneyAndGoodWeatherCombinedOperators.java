package Module1.IfOperator;
// Задание 8. Проверка на наличие денег и хорошей погоды с комбинированными операторами
public class HavingMoneyAndGoodWeatherCombinedOperators {
    public static void main(String[] args) {
        System.out.println( );
        boolean hasMoney = false;
        boolean isSunny = true;
        boolean moodGood = false;
        System.out.println( );
        if ((moodGood && hasMoney) || isSunny) { // В данной задаче были применениы сразу два сравнительных оператора, т.к. условия задачи этого требовали
            System.out.println("Иду гулять и покупаю мороженое!");
        } else {
            System.out.println("Не могу гулять или покупать мороженое! :( ");
        }
    }
}
// Конец задачи!
