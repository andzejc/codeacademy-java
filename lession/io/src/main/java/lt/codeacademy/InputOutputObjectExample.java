package lt.codeacademy;

import lt.codeacademy.model.Person;
import lt.codeacademy.utils.FileUtils;

import java.util.List;

public class InputOutputObjectExample {

    private static final String PERSON_FILE = "person.data";

    public static void init() {
        List<Person> persons = List.of(
            new Person("Antanas", "Antanaitis", 20),
            new Person("Petras", "Antanaitis", 21),
            new Person("Jonas", "Antanaitis", 22)
        );
        FileUtils.writeToFile(PERSON_FILE, persons);

        List<Person> personObjFromFile = (List<Person>) FileUtils.readFromFile(PERSON_FILE);
        for (Person person : personObjFromFile) {
            System.out.println(person.toString());
        }
    }
}
