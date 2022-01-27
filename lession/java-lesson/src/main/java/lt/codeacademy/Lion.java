package lt.codeacademy;

import test.A;

public class Lion extends NewAnimal{

    int a;
    int b = 20;

    public static void main(String[] args) {
        lionMethod();
    }
    private static void lionMethod() {
        System.out.println(A.getJumpHeight());
        System.out.println("12");
        System.out.println("13");

    }

    @Override
    public String getName() {
        return "New name";
    }

    @Override
    protected boolean isPet() {
        return false;
    }

    @Override
    public void newMethod() {
        Lion animal = new Lion();
    }

    @Override
    public void printA() {

    }

    @Override
    public void getB() {

    }

    @Override
    public void getC() {

    }


//    public abstract boolean isSleaping(); doesn't compiele

}
