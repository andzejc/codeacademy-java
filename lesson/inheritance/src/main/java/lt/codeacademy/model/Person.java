package lt.codeacademy.model;

public class Person {

    private String name;
    private String surname;

    public Person() {
        System.out.println("Person is created from default constructor");
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
