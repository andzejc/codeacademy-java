package lt.codeacademy;


public class App {

    static ConsolePrinter printer = new ConsolePrinter();

    public static void main(String[] args) {
        printer.print("Vienas");
        for (int i = 0; i < 100; i++) {
            printer.print("Du");
        }
        printer.print("Trys");
        printSimpleText();
        addTwoValues(1, 5);
        printer.print(addTwoValuesWithReturn(2, 7));
    }

    public static void printSimpleText() {
        printer.print("Keturi");
    }

    public static void addTwoValues(int firstValue, int secondValue) {
        printer.print(firstValue + secondValue);
    }

    public static int addTwoValuesWithReturn(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }
}
