package Module1.Examples;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        String firstElement = fruits.get(0);
        System.out.println(firstElement);
    }
}
