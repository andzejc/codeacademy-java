package lt.codeacademy;

public class Animal {

    String name;
    static int age = 40;

    public Animal() {}

    public Animal(String name) {
        this(name, 20);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
