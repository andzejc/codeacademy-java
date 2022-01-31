package lt.codeacademy.service;

public class SubstractCalculator implements Calculator {

    private final int value1;
    private final int value2;

    public SubstractCalculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public int doOperationWithTwoDigits() {
        return value1 - value2;
    }
}
