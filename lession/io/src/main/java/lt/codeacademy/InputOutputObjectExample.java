package lt.codeacademy;

import lt.codeacademy.model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import static lt.codeacademy.config.Config.RESOURCE_FILE_PATH;

public class InputOutputObjectExample {

    private static final String PERSON_FILE = "person.data";

    public static void init() {
        try (OutputStream fileOutputStream = new FileOutputStream(RESOURCE_FILE_PATH +  PERSON_FILE);
             ObjectOutputStream os = new ObjectOutputStream(fileOutputStream)) {
            os.writeObject(new Person("Antanas", "Antanaitis", 20));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
