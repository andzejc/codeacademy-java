package lt.codeacademy.service;

public class SubstractCalculator extends CalculatorCommon implements Calculator {

    public SubstractCalculator(int value1, int value2) {
        super(value1, value2);
    }

    @Override
    public int doOperationWithTwoDigits() {
        return getValue1() - getValue2();
    }
}
