package task2;

public class Task2Impl {

    public static void init() {
        Printer printer = new Printer();

        Integer[] digits = {1, 2, 3};
        String[] texts = {"Hello", "World"};
        printer.printArray(digits);
        printer.printArray(texts);
    }

}
