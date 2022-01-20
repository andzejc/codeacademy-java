package lt.codeacademy;

public enum Seasons {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String expectedVisitors;
    Seasons(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExceptedVisitors(){
        System.out.println(expectedVisitors);
    }

}
