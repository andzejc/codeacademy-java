package lt.codeacademy.service;

/**
 * Budas tinka jei norime pilnai perrasyti doOperationWithTwoDigits metoda
 */
public class SumCalculatorV3 extends CalculatorCommon implements Calculator {

    public SumCalculatorV3(int value1, int value2) {
        super(value1, value2);
    }

    /**
     * This version always return zero for sum operations
     * @return
     */
    @Override
    public int doOperationWithTwoDigits() {
        return 0;
    }
}
