package task1;

import java.util.ArrayList;
import java.util.List;

public class StringListBox implements ListBox<String> {

    private final List<String> texts = new ArrayList<>();

    @Override
    public void addElements(String[] values) {
        texts.addAll(List.of(values));
    }

    @Override
    public void addElement(String value) {
        texts.add(value);
    }

    @Override
    public List<String> getElements() {
        return texts;
    }
}
