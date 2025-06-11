package Module1.ComparisonOperators;

public class ComparisonExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
// Установите точку останова (breakpoint) на следующей строке
        if (str1 == str2) {
            System.out.println("str1 и str2 указывают на один и тот же объект");
        } else {
            System.out.println("str1 и str2 указывают на разные объекты");
        }
        if (str3 == str4) {
        } else {
            System.out.println("str3 и str4 указывают на один и тот же объект");
            System.out.println("str3 и str4 указывают на разные объекты");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 и str3 имеют одинаковое содержимое");
        } else {
            System.out.println("str1 и str3 имеют разное содержимое");
        }
    }
}
