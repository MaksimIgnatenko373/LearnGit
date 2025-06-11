package Module1.ComparisonOperators;

public class ComparisonExample1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String ("Hello");

        if (str1 == str2) {
            System.out.println("str1 и str2 указывают на один и тот же объект");
        } else {
            System.out.println("str1 и str2 указывают на разные объекты");
        } if (str1.equals(str2)) {
            System.out.println("str1 и str2 имеют одинаковое содержимое");
        } else {
            System.out.println("str1 и str2 имеют разное содержимое");
        }
    }
}
