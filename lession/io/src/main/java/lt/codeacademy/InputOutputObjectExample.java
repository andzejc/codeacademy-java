package lt.codeacademy;

import lt.codeacademy.model.Person;
import lt.codeacademy.utils.FileUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputOutputObjectExample {

    private static final String PERSON_FILE = "person.data";

    public static void init() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("Antanas", "Antanaitis", 20),
            new Person("Petras", "Antanaitis", 21),
            new Person("Jonas", "Antanaitis", 22)
        ));

        List<Person> previousPersonsData = (List<Person>) FileUtils.readFromFile(PERSON_FILE);
        if (previousPersonsData != null) {
            persons.addAll(previousPersonsData);
        }
        FileUtils.writeToFile(PERSON_FILE, persons);

        List<Person> personObjFromFile = (List<Person>) FileUtils.readFromFile(PERSON_FILE);
        for (Person person : personObjFromFile) {
            System.out.println(person.toString());
        }
    }
}
