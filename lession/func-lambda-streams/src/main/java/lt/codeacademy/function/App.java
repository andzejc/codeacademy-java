package lt.codeacademy.function;

import lt.codeacademy.function.model.TwoValueStorage;

import java.util.function.BiFunction;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<Integer, Integer> myFunc = new AddThreeFunc();
        System.out.println(myFunc.apply(2)); // 5

        TwoValueStorage twoValueStorage = new TwoValueStorage(2, 3);
        Function<TwoValueStorage, Integer> funcObj = new ApplyObject();
        System.out.println(funcObj.apply(twoValueStorage)); // 5

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> Integer.sum(a, b);
        System.out.println(sum.apply(2, 3)); // 5
    }
}
