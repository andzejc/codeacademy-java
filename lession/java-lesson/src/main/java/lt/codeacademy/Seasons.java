package lt.codeacademy;

public enum Seasons {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String expectedVisitors;

    private Seasons(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
