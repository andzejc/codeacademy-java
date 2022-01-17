package lt.codeacademy;

public class App {

    public static void main(String[] args) {
        print("Vienas");
        for (int i = 0; i < 100; i++) {
            print("Du");
        }
        print("Trys");
        printSimpleText();
        addTwoValues(1, 5);
        int result = addTwoValuesWithReturn(2, 7);
        print(result);
    }

    public static void printSimpleText() {
        print("Keturi");
    }

    public static void addTwoValues(int firstValue, int secondValue) {
        print(firstValue + secondValue);
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(int text) {
        print(String.valueOf(text));
    }

    public static int addTwoValuesWithReturn(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }
}
