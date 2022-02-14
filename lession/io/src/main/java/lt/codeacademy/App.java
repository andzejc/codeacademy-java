package lt.codeacademy;

import java.io.*;

import static lt.codeacademy.config.Config.RESOURCE_FILE_PATH;

public class App {
    public static void main(String[] args) {
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
