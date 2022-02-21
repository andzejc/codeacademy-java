package lt.codeacademy.function.model;

// immutable class
public class TwoValueStorage {
    private final int firstValue;
    private final int secondValue;

    public TwoValueStorage(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }
}
