package lt.codeacademy;

import java.util.ArrayList;
import java.util.List;

import static lt.codeacademy.ConsolePrinter.print;

public class ArrayListExample {

    public void example() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        print(integers.get(1));
    }
}
