package lt.codeacademy.function;

import lt.codeacademy.function.model.TwoValueStorage;

import java.util.function.Function;

public class ApplyObject implements Function<TwoValueStorage, Integer> {
    @Override
    public Integer apply(TwoValueStorage twoValueStorage) {
        return twoValueStorage.getFirstValue() + twoValueStorage.getSecondValue();
    }
}
