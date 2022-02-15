package task2;

public class Printer {

    public <T> void printArray(T[] digits) {
        for (T v : digits) {
            System.out.println(v);
        }
    }
}
