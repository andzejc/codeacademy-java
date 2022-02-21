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

        System.out.println(sum().apply(2, 3)); // 5


        // -----------------------
        Function<String, String> addBrackets = (anything) -> "(" + anything + ")";
        System.out.println("addBrackets apply: " + addBrackets.apply("whatEver"));

        Function<String, String> addTripleDots = value -> value + "...";

        String formattedTextWithNestedFunctions = addBrackets // order matters here
                .andThen(addTripleDots)
                .apply("functions are so cool");

        System.out.println(formattedTextWithNestedFunctions);
    }

    public static BiFunction<Integer, Integer, Integer> sum() {
        return (a, b) -> Integer.sum(a, b);
    }
}
