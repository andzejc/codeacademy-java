package lt.codeacademy;

public class A {
    int a;
    int b;
    static String str;
    private static final String CONST;

    {
       a = 5;
       b = 5;
        System.out.println("Initialize non static block");
    }

    static {
        str = "test";
        CONST = "";
        System.out.println("Initialize static block");
    }

    B newB = new B();

    private void doSomeStuff() {
        newB.getAge();
        newB.addAge(10);
        B b = new B();
        b.someInt = 20;
    }
}
