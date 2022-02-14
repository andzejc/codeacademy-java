package lt.codeacademy.model;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -99755517021312437L;

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", getName(), getSurname(), getAge());
    }
}
