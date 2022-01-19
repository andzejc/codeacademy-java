package lt.codeacademy;

public class Scope {
    String one = new String("a");
    String two = new String("b");
    int a = 1000;

    public void changeRef() {
        this.one = this.two;
        String three = this.one;
        this.one = null;
        System.gc();
    }
}
