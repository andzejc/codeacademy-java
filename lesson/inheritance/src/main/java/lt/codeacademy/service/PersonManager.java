package lt.codeacademy.service;

import lt.codeacademy.model.Person;
import lt.codeacademy.model.Student;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        if (person instanceof Student) {
            persons.add(person);
        }
    }

    public String getAll() {
        String result = "";
        for (Person person: persons) {
            result += person.toString() + "\n";
        }

        return result;
    }
}
