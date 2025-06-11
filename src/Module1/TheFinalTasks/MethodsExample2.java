package Module1.TheFinalTasks;

import org.w3c.dom.ls.LSOutput;

public class MethodsExample2 {
    public static void main(String[] args) {
        System.out.println( );
        Person person1 = new Person();
        person1.name = "Александр";
        person1.age = 29;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Павел";
        person2.age = 25;
        person2.speak();
        System.out.println( );
        String[] userNames = {"petya", "vasya", "evgeny"};
        for (var i = 0; i < userNames.length; i++) {
            System.out.println(userNames[i]);
        }
    }

    static class Person{
        String name;
        int age;
        public void speak() {
            System.out.println("Меня зовут " + name + "." + " " + "Мне " + age + " " + "лет!");
        }
    }
}


