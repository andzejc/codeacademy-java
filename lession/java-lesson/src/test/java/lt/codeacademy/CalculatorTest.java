package lt.codeacademy;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int result = calculator.add(3,5);
    if (result != 7) {
      System.out.println("calculator is working wong!");
    }
  }

  public void testCalc() {
    Calculator calculator = new Calculator();
    int result = calculator.add(3,5);
    if (result != 7) {
      System.out.println("calculator is working wong!");
    }
  }

  @Test
  public void testCalcJunit() {
    Calculator calculator = new Calculator();
    int result = calculator.add(3,5);
    Assert.assertEquals("pridejimas + 4", 12, result);
  }
}

//TestCase -> klase nuo kurios reikia paveldeti testnine klase kad veiktu testai(super klase)
//TestSuite -> tai yra konteineris testu klasems
//TestResult -> klase reikalinga dirbti su testu rezultatais
//Assert -> kai testas atidirbo, sitoje klaseje yra visi patikrinimai, palyginimai
//TestRule -> galima su sita klase kurti savo nestandartines taisykles,