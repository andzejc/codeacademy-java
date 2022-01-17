package lt.codeacademy;

public class App {

    public static void main(String[] args) {
        System.out.println("Vienas");
        for (int i = 0; i < 100; i++) {
            System.out.println("Du");
        }
        System.out.println("Trys");
        printSimpleText();
        addTwoValues(1, 5);
    }

    public static void printSimpleText() {
        System.out.println("Keturi");
    }

    public static void addTwoValues(int firstValue, int secondValue) {
        System.out.println(firstValue + secondValue);
    }
}
