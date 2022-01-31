package lt.codeacademy;

import lt.codeacademy.service.Calculator;
import lt.codeacademy.service.SubstractCalculator;
import lt.codeacademy.service.SumCalculator;

public class CalculatorApplication {

    public void doCalc() {
        Calculator sumCalculator = new SumCalculator(2, 3);
        Calculator substractCalculator = new SubstractCalculator(3, 2);

        doCalculatorOperation(sumCalculator);
        doCalculatorOperation(substractCalculator);
    }

    public void doCalculatorOperation(Calculator calculator) {
        System.out.println(calculator.doOperationWithTwoDigits());
    }
}
