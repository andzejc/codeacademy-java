package lt.codeacademy;

import lt.codeacademy.model.Person;

public class Lession8 {

    private final Person person;

    public Lession8() {
        person = new Person();
        System.out.println(person);
    }

    public void init() {
        System.out.println(person.isSex());
        System.out.println(person.getName().length());
        System.out.println(person.getPersonalCode());
    }
}
