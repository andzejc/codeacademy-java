package test;

public interface E extends D {


    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";

    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();

//    public final void surface(); negali buti final


}
