package lt.codeacademy.model;

public class Person {

    private String name;
    private String surname;

    public Person() {
        this.name = "-";
        this.surname = "-";
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
