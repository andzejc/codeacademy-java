package inheritance;

public class Inheritance {

    public static void init() {
        doSomething(new A());
        doSomething(new B());

        Generic<A> gA = new Generic<>();
        Generic<B> gB = new Generic<>();
        doSomething(gA);
        doSomething(gB);  //throw compile exception
    }

    public static void doSomething(A obj) {
        ///
    }

    public static void doSomething(Generic<A> obj) {
        ///
    }

    static class A {
    }

    static class B extends A {

    }

    static class Generic<T> {

    }

}
