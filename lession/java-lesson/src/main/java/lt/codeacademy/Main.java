package lt.codeacademy;

public class Main {
  public static void main(String[] args) {
    new Main().explore();
  }

  void makeSomeStuff() throws Exception {
    throw new Exception("went wrong!");
  }

  void fall() {
    throw new IndexOutOfBoundsException("kazkas atsitiko");
  }

  void getUp() {
    // do some things
    System.out.println("tesiame darba");
  }

  void explore() {
    try {
      fall();
    } catch (RuntimeException e) {
//      System.out.println(e);
//      System.out.println(e.getMessage());
        e.printStackTrace();
//      getUp();
    } finally{
      System.out.println("finally");
    }
  }

  void test() {
    String s = "";
    try {
      s += "t";
    } catch(Exception e) {
      s += "c";
    } finally {
      s += "f";
    }
    s += "a";
    System.out.print(s);
  }

  void test2() {
    try{
      runTimeExceptionTypes();
    } catch (IndexOutOfBoundsException e) {

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  void runTimeExceptionTypes() {
//    int b = 10 / 0; //ArithmeticException: / by zero
//    int[] arr = new int[3];
//    System.out.println(arr[4]); //.ArrayIndexOutOfBoundsException
//    String type = "some type";
//    Object obj = type;
//    Integer number = (Integer) obj; //java.lang.ClassCastException
    Integer.parseInt("asv"); //java.lang.NumberFormatException
  }

  void kiekReikiaPinigu(int kiekis) {
    if (kiekis < 0) {
      throw new IllegalArgumentException("kiekis negali buti minusinis");
    }
    System.out.println("mums reikia " + kiekis + " pinigu");
  }

  void infinity(int i) { // StackOverflowError
    infinity(1);
  }
}

class A extends RuntimeException {
  A (Exception e) {
    super(e);
  }

  A (String message) {
    super(message);
  }
}
class B extends RuntimeException {}
class C extends B {}
