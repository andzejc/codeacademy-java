package lt.codeacademy;

import java.io.IOException;

public class ExceptionLesson {
    public static void main(String[] args) {
        String textInFile = null;
        try {
            readInFile();
        } catch (IOException e) {
            textInFile = new String();
        }
// imagine many lines of code here
        System.out.println(textInFile.replace(" ", ""));
    }
    private static void readInFile() throws IOException {
        throw new IOException();
    }
}
