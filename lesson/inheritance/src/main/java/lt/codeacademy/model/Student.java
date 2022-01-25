package lt.codeacademy.model;

public class Student extends Person {

    private GroupType groupType;

    public Student() {
    }

    public Student(String name, String surname) {
        super(name, surname);
    }
}
