package test;

public interface A extends B, C{
    public static final int MINIMUM = 100;
    int MAXIMUM_DEPTH = 500;

    public abstract void printA();

    static int getJumpHeight() {
        return 8;
    }

}
