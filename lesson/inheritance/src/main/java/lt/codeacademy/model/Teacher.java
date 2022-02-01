package lt.codeacademy.model;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Teacher info: " + super.toString();
    }
}
