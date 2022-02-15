package task1;

import java.util.List;

/**
 * @implNote Generics Task-1
 * @implSpec Create any implementation regarding this interface
 * @version 1.0
 */
public interface ListBox<E> {

    /**
     * Should be implementation from simple array to collection
     *
     * @param values array of {@link E} values
     */
    void addElements(E[] values);

    /**
     * Should be implementation to add single element
     * @param value
     */
    void addElement(E value);

    /**
     * Should be implementation to get collection with/without values
     *
     * @return a Collection
     */
    List<E> getElements();
}
