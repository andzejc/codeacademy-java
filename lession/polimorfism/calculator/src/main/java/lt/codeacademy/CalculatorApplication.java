package lt.codeacademy;

import lt.codeacademy.service.Calculator;
import lt.codeacademy.service.SubstractCalculator;
import lt.codeacademy.service.SumCalculator;
import lt.codeacademy.service.SumCalculatorV2;

public class CalculatorApplication {

    public void doCalc() {
        Calculator sumCalculator = new SumCalculator(2, 3);
        Calculator substractCalculator = new SubstractCalculator(3, 2);

        doCalculatorOperation(sumCalculator);
        doCalculatorOperation(substractCalculator);

        doOtherCalc();
    }

    public void doOtherCalc() {
        Calculator sumCalculatorV2 = new SumCalculatorV2(1, 1);
        doCalculatorOperation(sumCalculatorV2);

        Calculator sumCalculatorV3 = new SumCalculatorV2(1, 1);
        doCalculatorOperation(sumCalculatorV3);
    }

    public void doCalculatorOperation(Calculator calculator) {
        System.out.println(calculator.doOperationWithTwoDigits());
    }
}
