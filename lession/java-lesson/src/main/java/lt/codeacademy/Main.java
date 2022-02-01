package lt.codeacademy;

public class Main {

    int f;
    Main m = new Main();
    {
        m.f = 10;
        System.out.println("Initialize non static Main block");
        System.out.println(f);
    }

    static {
        System.out.println("Initialize static Main block");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        A a = new A();
    }
}
