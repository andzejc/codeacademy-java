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
}
