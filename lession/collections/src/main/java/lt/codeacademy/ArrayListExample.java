package lt.codeacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lt.codeacademy.ConsolePrinter.print;

public class ArrayListExample {

    public void example() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        print(integers.get(1));
    }

    public void task1() {
        List<Integer> integers = new ArrayList<>();

        integers.add(10);
        print("size of array list: " + integers.size());
        print("1 -> " + Arrays.toString(integers.toArray()));
        integers.add(22);
        print("size of array list: " + integers.size());
        print("2 -> " + Arrays.toString(integers.toArray()));

        // cia ideda i pradzia po 0 pozicijos
        integers.add(1, 45);
        print("3 -> " + Arrays.toString(integers.toArray()));

        // perraso jau egzistojanti
        integers.set(1, 55);
        print("4 -> " + Arrays.toString(integers.toArray()));

//        integers.add(50, 50);  // mes klaida
//        System.out.println(integers.get(50)); // mes klaida
//        System.out.println(integers.get(49)); // mes klaida

        print("size of array list: " + integers.size());
        print("5 -> for i");
        for (int i = 0; i < integers.size(); i++) {
            print(integers.get(i));
        }
        print("6 -> foreach");
        for (Integer integer : integers) {
            print(integer);
        }

        print("Istrinta reiksme: " + integers.remove(2));
        print("7 -> foreach");
        for (Integer integer : integers) {
            print(integer);
        }

        print("IndexOf: " + integers.indexOf(55));
    }
}
