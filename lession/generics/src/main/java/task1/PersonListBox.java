package task1;

import task1.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonListBox implements ListBox<Person> {

    private final List<Person> persons = new ArrayList<>();

    @Override
    public void addElements(Person[] values) {
        persons.addAll(List.of(values));
    }

    @Override
    public void addElement(Person value) {
        persons.add(value);
    }

    @Override
    public List<Person> getElements() {
        return persons;
    }
}