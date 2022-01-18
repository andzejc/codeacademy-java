package lt.codeacademy;

public class ConsolePrinter {

    public void print(String text) {
        System.out.println(text);
    }

    public void print(int text) {
        print(String.valueOf(text));
    }
}
