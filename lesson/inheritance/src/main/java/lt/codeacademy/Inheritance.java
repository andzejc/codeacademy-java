package lt.codeacademy;

import lt.codeacademy.model.GroupType;
import lt.codeacademy.model.Student;
import lt.codeacademy.model.Teacher;
import lt.codeacademy.service.PersonManager;

public class Inheritance {

    PersonManager personManager;

    public Inheritance() {
        personManager = new PersonManager();
    }

    public void init() {
        personManager.addPerson(new Student("Vardenis", "Pavardenis", GroupType.C2));
        personManager.addPerson(new Teacher("Petras", "Mokytojas"));

        System.out.println(personManager.getAll());
    }
}
