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
    }
}
