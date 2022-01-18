package lt.codeacademy;

import java.util.Arrays;

import static lt.codeacademy.ConsolePrinter.*;

public class Main {

    public static void main(String[] args) {
        String[] listOfOrdinal = {"Pirmas", "Antras"};

        listOfOrdinal = addToArray(listOfOrdinal, "Trecias");
        listOfOrdinal = addToArray(listOfOrdinal, "Ketvirtas");
        listOfOrdinal = addToArray(listOfOrdinal, "Penktas");

        print(Arrays.toString(listOfOrdinal));
    }

    /**
     * Method helps to add new value into simple array as new element.
     * Init array: ["One", "Two"]
     * Result array: ["One", "Two", "Three"]
     *
     * @param currentArray String[] assigned an array that needs to be expanded for new value
     * @param value a any text
     * @return new array of any text
     */
    public static String[] addToArray(String[] currentArray, String value) {
        int currentArrayLength = currentArray.length;
        int newArrayLength = currentArrayLength + 1;

        String[] newArray = new String[newArrayLength];

        // copy current array to new array
        System.arraycopy(currentArray, 0, newArray, 0, currentArrayLength);
        newArray[newArrayLength - 1] = value;

        return newArray;
    }
}
