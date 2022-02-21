package lt.codeacademy.function;

import lt.codeacademy.function.model.TwoValueStorage;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Function<Integer, Integer> myFunc = new AddThreeFunc();
        System.out.println(myFunc.apply(2)); // 5

        TwoValueStorage twoValueStorage = new TwoValueStorage(2, 3);
        Function<TwoValueStorage, Integer> funcObj = new ApplyObject();
        System.out.println(funcObj.apply(twoValueStorage)); // 5

        System.out.println(sum().apply(2, 3)); // 5


        // Nesting with Function -----------------------
        Function<String, String> addBrackets = (anything) -> "(" + anything + ")";
        System.out.println("addBrackets apply: " + addBrackets.apply("whatEver"));

        Function<String, String> addTripleDots = value -> value + "...";

        String formattedTextWithNestedFunctions = addBrackets // order matters here
                .andThen(addTripleDots)
                .apply("functions are so cool");

        System.out.println(formattedTextWithNestedFunctions);

        // Predicate
        Predicate<String> notNull = value -> value != null;
        System.out.println("this is not null: " + notNull.test("I am not null"));
        System.out.println("this is null: " + notNull.test(null));
        boolean result = notNull
                .and(notNull)
                .or(notNull)
                .test(null);
    }

    public static BiFunction<Integer, Integer, Integer> sum() {
        return (a, b) -> Integer.sum(a, b);
    }
}
