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
                .forEach(s -> System.out.println("Number word after mapping: " + s));

    }
}
