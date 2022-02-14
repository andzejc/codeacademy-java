package lt.codeacademy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static lt.codeacademy.config.Config.RESOURCE_FILE_PATH;

public class InputOutputByteExample {

    public static void init() {
        try (InputStream in = new FileInputStream(RESOURCE_FILE_PATH + "orig.txt");
             OutputStream out = new FileOutputStream(RESOURCE_FILE_PATH + "copy.txt")) {
            for (int c; (c = in.read()) != -1; ) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
