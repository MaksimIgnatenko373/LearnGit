package Module1.Cycles;

public class DoWhileLoopWithoutLoopExample {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Цикл do...while: " + i);
        i++;
        if (i < 5) {
            System.out.println("Цикл do...while: " + i);
            i++;
        }
        if (i < 5) {
            i++;
            System.out.println("Цикл do...while: " + i);
        }
        if (i < 5) {
            i++;
            System.out.println("Цикл do...while: " + i);
        }
        if (i < 5) {
            i++;
            System.out.println("Цикл do...while: " + i);
        }
    }
}
