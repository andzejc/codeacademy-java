package lt.codeacademy.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> stringNumbers = List.of(
                "ONE",
                "TWO",
                "THREE",
                "FOUR",
                "FIVE"
        );

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

        System.out.println("------- Map + Collection -----------");
        List<String> stringNumbersFiltered = stringNumbers.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());

        stringNumbersFiltered.forEach(System.out::println);

        // Stream change data types
        System.out.println("------- Set<Integer> to List<Long> -----------");
        Set<Integer> num1 = Set.of(1, 2, 3, 4);
        List<Long> num1Long = num1.stream()
                .map(value -> value.longValue())
                .map(value -> value * 2)
                .sorted()  // without sorted result will be randomly sorted
                .collect(Collectors.toList());
        num1Long.forEach(System.out::println);

    }
}
