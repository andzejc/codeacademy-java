package lt.codeacademy.service;

public final class SumCalculator extends CalculatorCommon implements Calculator {

    public SumCalculator(int value1, int value2) {
        super(value1, value2);
    }

    @Override
    public int doOperationWithTwoDigits() {
        return getValue1() + getValue2();
    }
}
