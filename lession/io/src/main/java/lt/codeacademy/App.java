package lt.codeacademy;

import java.io.*;

import static lt.codeacademy.config.Config.RESOURCE_FILE_PATH;

public class App {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            try {
                in = new FileInputStream(RESOURCE_FILE_PATH + "orig.txt");
                out = new FileOutputStream(RESOURCE_FILE_PATH + "copy.txt");
                for (int c; (c = in.read()) != -1; ) {
                    out.write(c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                in.close();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
