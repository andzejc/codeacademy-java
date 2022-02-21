package lt.codeacademy.function;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<Integer, Integer> myFunc = new AddThreeFunc();
        System.out.println(myFunc.apply(2)); // 5
    }
}
