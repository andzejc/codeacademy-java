package lt.codeacademy;

public class CalculatorCasio {

  public static int prideti(int a, int b) {
    return a + b;
  }

  public static int padalinti(int a, int b) throws InterruptedException {
    Thread.sleep(80);
    return a / b;
  }
}
