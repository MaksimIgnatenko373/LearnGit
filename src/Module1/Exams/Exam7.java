package Module1.Exams;

public class Exam7 {
    public static void main(String[] args) {
        System.out.println();
        int num = 1;
        System.out.println(num);
        System.out.println();
        System.out.println("По итогу выходит -> ");
        System.out.println();
        switch (num){
            case 1:
                System.out.printf("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ввод числа неверный!");
        }
    }
}
