package lt.codeacademy.utils;

import java.io.FileOutputStream;
import java.io.IOException;
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
}
