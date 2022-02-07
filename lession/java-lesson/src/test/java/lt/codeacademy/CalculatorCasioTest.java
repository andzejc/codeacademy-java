package lt.codeacademy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorCasioTest {
  int a, b, expResult;

  public CalculatorCasioTest(int a, int b, int expResult) {
    this.a = a;
    this.b = b;
    this.expResult = expResult;
  }

  @Rule public Timeout globalTimeout = new Timeout(200, TimeUnit.MILLISECONDS);

  @Parameterized.Parameters
  public static Collection getNumbers() {
    return Arrays.asList(new Object[][]{{10, 20, 30},{7, 7, 14},{0, 5, 5}});
  }

  @BeforeClass
  public static void setUpC() throws Exception {
    System.out.println("BeforeClass");
  }

  @AfterClass
  public static void tearDownC() throws Exception {
    System.out.println("BeforeClass");
  }

  @Before
  public void setUp() throws Exception {
    System.out.println("before");
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("after");
  }

  @Test
  public void prideti() {
    System.out.println("running prideti");
//    int a = 8;
//    int b = 6;
//    int expResult = 14;
    int result = CalculatorCasio.prideti(a, b);
    assertEquals(expResult, result);
  }

//  @Test(timeout = 1000)
  @Ignore
  @Test
  public void padalinti() throws InterruptedException {
    System.out.println("running padalinti");
//    int a = 8;
//    int b = 2;
//    int expResult = 4;
    int result = CalculatorCasio.padalinti(a, b);
    assertEquals(expResult, result);
  }

  @Ignore
  @Test(expected = ArithmeticException.class)
  public void padalintiException() throws InterruptedException {
    System.out.println("running padalinti");
    int a = 8;
    int b = 0;
    int expResult = 4;
    int result = CalculatorCasio.padalinti(a, b);
    assertEquals(expResult, result);
  }
}
