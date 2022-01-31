package lt.codeacademy.service;
/**
 * Budas tinka jei norime papildyti doOperationWithTwoDigits metoda su komponotos
 * klases doOperationWithTwoDigits implementacija.
 */
public class SumCalculatorV2 implements Calculator {

    private final SumCalculator sumCalculator;

    public SumCalculatorV2(int value1, int value2) {
        this.sumCalculator = new SumCalculator(value1, value2);
    }

    /**
     * This version will return always + 1 for result
     * @return
     */
    @Override
    public int doOperationWithTwoDigits() {
        return sumCalculator.doOperationWithTwoDigits() + 1;
    }
}
