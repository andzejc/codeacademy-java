package inheritance;

public class Inheritance {

    public static void init() {
        doSomething(new A());
        doSomething(new B());

        Generic<A> gA = new Generic<>();
        Generic<B> gB = new Generic<>();
        Generic<C> gC = new Generic<>();
        doSomething(gA);
        doSomething(gB);
        doSomethingDownCast(gC);
        doSomethingDownCast(gB); // compile exception
        doSomethingDownCast(gA);
    }

    public static void doSomething(A obj) {}

    public static void doSomething(Generic<?> obj) {}

    public static void doSomethingDownCast(Generic<? super C> obj) {}

    static class A {}

    static class B extends A {}

    static class C extends A {}

    static class Generic<T> {}
}
