package lt.codeacademy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static lt.codeacademy.ConsolePrinter.print;

public class HashMapExample {

    public void task4() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sausis");
        map.put(2, "Vasaris");
        map.put(3, "Kovas");

        printMapValues(map);

        print("get() -> " + map.get(2));
        print("size() -> " + map.size());
        map.put(3, "Nezinomas Menuo");
        printMapValues(map);

        map.remove(2);
        print("after remove() -> ");
        printMapValues(map);
    }

    private void printMapValues(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> m: map.entrySet()) {
            print(m.getValue());
        }
    }
}
