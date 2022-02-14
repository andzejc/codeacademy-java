package lt.codeacademy.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static lt.codeacademy.config.Config.RESOURCE_FILE_PATH;

public class FileUtils {

    public static void writeToFile(String filePath, Object object) {
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream(RESOURCE_FILE_PATH + filePath))) {
            os.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFromFile(String filePath) {
        try (ObjectInputStream os = new ObjectInputStream(
                new FileInputStream(RESOURCE_FILE_PATH + filePath))) {
            return os.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
