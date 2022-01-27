package lt.codeacademy;

public abstract class Animal {

    int s;
    int ss = 10;

    public abstract String getName();

    protected abstract boolean isPet();

    public void eat() {
        System.out.println("eating");
    }
//      doesn't compile
//    public abstract void swim() {};
//    public abstract int getAge() {
//        return 10;
//    };
}
