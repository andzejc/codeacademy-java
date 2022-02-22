package lt.codeacademy.streams;

import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<String> stringNumbers = List.of(
                "ONE",
                "TWO",
                "THREE",
                "FOUR",
                "FIVE"
        );

        Stream<String> stringNumbersStream = stringNumbers.stream();

        // do anything with Stream

        // Stream MAP
        stringNumbers.stream()
                .map((s) -> s.toLowerCase())
                .forEach(s -> System.out.println(s));

        System.out.println("------------------");
        // use method reference
        stringNumbers.stream()
                .map(String::toLowerCase)
                .map(s -> s + "a")
                .map(s -> s.substring(2))
                .forEach(System.out::println);

        System.out.println("------- Filter -----------");
        // Stream FILTER
        stringNumbers.stream()
                .filter(s -> s.length() > 3)
                .map(s -> s.toLowerCase())
                .forEach(System.out::println);
    }
}
