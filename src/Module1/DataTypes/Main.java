package Module1.DataTypes;

// Выполнение задания по разделу "Ссылочные типы данных"
public class Main {
    public void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = person1;
        person2.setName("Bob"); // задать вопрос Кириллу по работе с Debug

        System.out.println("Person1: " + person1.getName());
        System.out.println("Person2: " + person2.getName());
    }

}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
