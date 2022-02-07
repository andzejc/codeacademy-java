package lt.codeacademy;

public class RunTest {
  public static void main(String[] args) {
    try {
      CalculatorTest calculatorTest = new CalculatorTest();
      calculatorTest.testCalc();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
