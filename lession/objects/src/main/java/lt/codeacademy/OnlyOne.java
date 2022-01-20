package lt.codeacademy;

public enum OnlyOne {
    ONCE(true), TWO(true);

    OnlyOne(boolean b) {
        System.out.println("Construction");
    }
}
