package Module1.DataTypes;

public class AppleExample {
    public static void main(String[] args) {
        int a = 10; // Ящик с яблоком
        int b = a; // Копируем яблоко в другой ящик
        b = 20; // Меняем яблоко в новом ящике
        System.out.println();
        System.out.println("a: " + a); // 10 (старое яблоко осталось в первом ящике)
        System.out.println("b: " + b); // 20 (новое яблоко в новом ящике)
    }
}
