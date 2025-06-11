package Module1.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        System.out.println();
        String[] favoriteFilms = new String[3];
        favoriteFilms[0] = "Inception";
        favoriteFilms[1] = "The Matrix";
        favoriteFilms[2] = "Interstellar";
        System.out.println("My favorite films are: ");
        System.out.println();
        for (int i = 0; i < favoriteFilms.length; i++) {
            System.out.println(favoriteFilms[i]);
        }
    }
}
