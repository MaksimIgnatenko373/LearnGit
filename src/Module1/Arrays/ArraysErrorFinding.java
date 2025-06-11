package Module1.Arrays;

public class ArraysErrorFinding {
    public static void main(String[] args) {
        System.out.println();
        String[] friends = {"Alice", "Bob", "Charlie"};
        for (int i = 0; i < friends.length ; i++) { // ошибка в условии внутри цикла "for". Нужно поменять оператор сравнения: с "<=" на "<".
            System.out.println(friends[i]);
        }
    }
}
