package lt.codeacademy.model;

public enum GroupType {

    NONE("Nera grupės"),
    C1("Kursas 1"),
    C2("Kursas 2"),
    C3("Kursas 3"),
    C4("Kursas 4");

    private final String type;

    GroupType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
