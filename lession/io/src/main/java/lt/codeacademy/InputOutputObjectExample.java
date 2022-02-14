package lt.codeacademy;

import lt.codeacademy.model.Person;
import lt.codeacademy.utils.FileUtils;

public class InputOutputObjectExample {

    private static final String PERSON_FILE = "person.data";

    public static void init() {
        FileUtils.writeToFile(
                PERSON_FILE,
                new Person("Antanas", "Antanaitis", 20)
        );

        Person personObjFromFile = (Person) FileUtils.readFromFile(PERSON_FILE);
        System.out.println(personObjFromFile.toString());
    }
}
