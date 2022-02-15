package lt.codeacademy.factory;

import lt.codeacademy.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PersonFactory {

    public List<Person> getMultiplyPersonsMock() {
        return new ArrayList<>(Arrays.asList(
                new Person("Antanas", "Antanaitis", 20),
                new Person("Petras", "Antanaitis", 21),
                new Person("Jonas", "Antanaitis", 22)
        ));
    }
}
