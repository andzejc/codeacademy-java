package lt.codeacademy;

public enum OnlyOne {
    ONCE(true), TWO(true);

    private OnlyOne(boolean b) {
        System.out.println("constructing");
    }
}
