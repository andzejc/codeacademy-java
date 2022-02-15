package lt.codeacademy;

import lt.codeacademy.factory.PersonFactory;
import lt.codeacademy.model.Person;
import lt.codeacademy.utils.FileUtils;

import java.util.List;

public class InputOutputObjectExample {

    private static final String PERSON_FILE = "person.data";
    private static PersonFactory personFactory = new PersonFactory();

    public static void init() {
        List<Person> persons = personFactory.getMultiplyPersonsMock();

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
