package lt.codeacademy;

public class ConsolePrinter {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(int text) {
        print(String.valueOf(text));
    }
}
