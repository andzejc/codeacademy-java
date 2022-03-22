package lt.codeacademy.function;

import java.util.function.Function;

public class AddThreeFunc implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer value) {
        return value + 3;
    }
}
